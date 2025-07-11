/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database_project1.controller;

import database_project1.dao.BukuDb;
import database_project1.model.Buku;
import database_project1.views.FormBuku;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author REZA
 */
public class BukuController {
    
    private FormBuku view;
    private Buku model;
    private BukuDb dao;
    
    public BukuController(FormBuku formBuku) {
        this.view = formBuku;
        dao = new BukuDb();
    }
    
    public void clearScreen() {
        view.getTxtKode().setText("");
        view.getTxtPengarang().setText("");
        view.getTxtPenerbit().setText("");
        view.getTxtJudul().setText("");
        view.getTxtTahun().setText("");
     
    }
    
   
    
    public void insert(){
        model = new Buku();
        model.setKode(view.getTxtKode().getText());
        model.setPenerbit(view.getTxtPenerbit().getText());
        model.setPengarang(view.getTxtPengarang().getText());
        model.setJudul(view.getTxtJudul().getText());
        model.setTahun(Integer.parseInt(view.getTxtTahun().getText()));
        
        
        try{
            dao.insert(model);
            JOptionPane.showMessageDialog(view, "Entry Data Ok!");
        }catch (Exception Ex){
            JOptionPane.showMessageDialog(view, Ex.getMessage());
            Logger.getLogger(AnggotaController.class.getName()).log(Level.SEVERE, null, Ex);
        }
    }
    
    public void update(){
        model = new Buku();
        model.setKode(view.getTxtKode().getText());
        model.setPenerbit(view.getTxtPenerbit().getText());
        model.setPengarang(view.getTxtPengarang().getText());
        model.setJudul(view.getTxtJudul().getText());
        model.setTahun(Integer.parseInt(view.getTxtTahun().getText()));
        
        
        try{
            dao.update(model);
            JOptionPane.showMessageDialog(view, "Update Data Ok!");
        }catch (Exception Ex){
            JOptionPane.showMessageDialog(view, Ex.getMessage());
            Logger.getLogger(AnggotaController.class.getName()).log(Level.SEVERE, null, Ex);
        }
    }
    
    public void delete(){
        try {
            if(model!=null){   
                dao.delete(model);
            }else{
                JOptionPane.showMessageDialog(view, "Data Not Found");
            }
            
        } catch (Exception ex) {
            Logger.getLogger(AnggotaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void search(){
        try {
            String kode = view.getTxtKode().getText();
            model = dao.getBuku(kode);
            
            if (model != null){
                view.getTxtPenerbit().setText(model.getPenerbit());
                view.getTxtPengarang().setText(model.getPengarang());
                view.getTxtJudul().setText(model.getJudul());
                view.getTxtTahun().setText(String.valueOf(model.getTahun()));
            }else{
                JOptionPane.showMessageDialog(view, "Data not found!");
            }
        } catch (Exception ex) {
            Logger.getLogger(AnggotaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public void viewData() {
        
        try {
            DefaultTableModel model = (DefaultTableModel)
                    view.getBukuTable().getModel();
            
            model.setNumRows(0);
            List<Buku> list = dao.getAllBuku();
            for (Buku buku : list) {
                Object[] data = {
                    buku.getKode(),
                    buku.getPengarang(),
                    buku.getPenerbit(),
                    buku.getJudul(),
                    buku.getTahun(),
                };
                model.addRow(data);
            }
        } catch (Exception ex) {
            Logger.getLogger(AnggotaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
