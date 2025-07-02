/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reza.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import reza.model.Buku;

/**
 *
 * @author ASUS
 */
public class Bukudao{
    public void insert(Buku buku) throws Exception{
        Connection con = new Koneksi().getKoneksi();
        String sql = "insert into buku values(?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1,buku.getJudul());
        ps.setString(2,buku.getTahun());
        ps.setString(3,buku.getKode());
        ps.setString(4,buku.getPengarang());
        ps.setString(5,buku.getPenerbit());
        ps.executeUpdate();
    }
    
    public void update (Buku buku) throws Exception {
        Connection con = new Koneksi().getKoneksi();
        String sql =
           "update buku set judul=?, tahun=?,pengarang=?,penerbit=? where kodebuku=?";
        PreparedStatement ps = con.prepareStatement(sql);
       
        ps.setString(1,buku.getJudul());
        ps.setString(2,buku.getTahun());
        ps.setString(3,buku.getKode());
        ps.setString(4,buku.getPengarang());
        ps.setString(5,buku.getPenerbit());
        ps.executeUpdate();
    }
    
    public void delete (Buku buku ) throws Exception{
     Connection con = new Koneksi().getKoneksi(); 
     String sql ="udelete from buku where kode=?";
     PreparedStatement ps = con.prepareStatement(sql);
     ps.setString(1,buku.getKode());
     ps.executeUpdate();
    }
    
    
    
    public List<Buku> getAllBuku() throws Exception{
       Connection con = new Koneksi().getKoneksi(); 
       String sql = "Select * from buku";
       PreparedStatement ps = con.prepareStatement(sql);
       ResultSet rs = ps.executeQuery();
       List<Buku> bukuList = new ArrayList<>();
       Buku buku;
       while(rs.next()){
           buku = new Buku();
           buku.setJudul(rs.getString(1));
           buku.setTahun(rs.getString(2));
           buku.setKode(rs.getString(3));
           buku.setPengarang(rs.getString(4));
           buku.setPenerbit(rs.getString(5));
           bukuList.add(buku);
       }
       return bukuList;
     }
}




