/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package database_project1.views;

import database_project1.controller.BukuController;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author REZA
 */
public class FormBuku extends javax.swing.JFrame {

    /**
     * Creates new form FormBuku
     */
    private BukuController controller;

    public FormBuku() {
        initComponents();
        controller = new BukuController(this);
        controller.clearScreen();
        controller.viewData();
        
    }

    public JTable getBukuTable() {
        return bukuTable;
    }

    public JTextField getTxtJudul() {
        return txtJudul;
    }

    public JTextField getTxtKode() {
        return txtKode;
    }

    public JTextField getTxtPenerbit() {
        return txtPenerbit;
    }

    public JTextField getTxtPengarang() {
        return txtPengarang;
    }

    public JTextField getTxtTahun() {
        return txtTahun;
    }

    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtKode = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtPengarang = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtPenerbit = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtJudul = new javax.swing.JTextField();
        txtTahun = new javax.swing.JTextField();
        btnDelete = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnTambah = new javax.swing.JButton();
        btnCari = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        bukuTable = new javax.swing.JTable();
        btnUpdate = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("Kode");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(12, 43, 51, 16);

        txtKode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKodeActionPerformed(evt);
            }
        });
        getContentPane().add(txtKode);
        txtKode.setBounds(90, 30, 180, 33);

        jLabel2.setText("Pengarang");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(12, 104, 76, 16);

        txtPengarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPengarangActionPerformed(evt);
            }
        });
        getContentPane().add(txtPengarang);
        txtPengarang.setBounds(90, 100, 220, 33);

        jLabel3.setText("Tahun Terbit");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(193, 226, 74, 16);

        jLabel4.setText("Penerbit");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(12, 165, 51, 16);
        getContentPane().add(txtPenerbit);
        txtPenerbit.setBounds(90, 160, 220, 33);

        jLabel5.setText("Judul");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(12, 226, 51, 16);
        getContentPane().add(txtJudul);
        txtJudul.setBounds(12, 248, 169, 33);

        txtTahun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTahunActionPerformed(evt);
            }
        });
        getContentPane().add(txtTahun);
        txtTahun.setBounds(193, 248, 199, 33);

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete);
        btnDelete.setBounds(180, 330, 66, 23);

        btnCancel.setText("Exit");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancel);
        btnCancel.setBounds(330, 330, 72, 23);

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        getContentPane().add(btnReset);
        btnReset.setBounds(250, 330, 72, 23);

        btnTambah.setText("Insert");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });
        getContentPane().add(btnTambah);
        btnTambah.setBounds(20, 330, 72, 23);

        btnCari.setText("Search");
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });
        getContentPane().add(btnCari);
        btnCari.setBounds(310, 30, 101, 33);

        bukuTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Kode", "Pengarang", "Penerbit", "Judul", "Tahun"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(bukuTable);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(480, 20, 360, 330);

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate);
        btnUpdate.setBounds(100, 330, 72, 23);
        getContentPane().add(filler1);
        filler1.setBounds(6, 251, 0, 10);

        setSize(new java.awt.Dimension(862, 456));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtPengarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPengarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPengarangActionPerformed

    private void txtTahunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTahunActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTahunActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        controller.clearScreen();
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        controller.search();
    }//GEN-LAST:event_btnCariActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        controller.delete();
        controller.clearScreen();
        controller.viewData();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        controller.update();
        controller.clearScreen();
        controller.viewData();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        controller.insert();
        controller.clearScreen();
        controller.viewData();        
    }//GEN-LAST:event_btnTambahActionPerformed

    private void txtKodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKodeActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormBuku().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnTambah;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JTable bukuTable;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtJudul;
    private javax.swing.JTextField txtKode;
    private javax.swing.JTextField txtPenerbit;
    private javax.swing.JTextField txtPengarang;
    private javax.swing.JTextField txtTahun;
    // End of variables declaration//GEN-END:variables
}
