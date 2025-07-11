/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database_project1.dao;

import database_project1.model.Buku;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author REZA
 */
public class BukuDb {
    public void insert(Buku buku) throws Exception{
        java.sql.Connection con = new Connection().getConnection();
        String sql = "INSERT INTO buku (tahun, pengarang, penerbit, judul, kode) VALUES (?, ?, ?, ?, ?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(5, buku.getKode());
        ps.setString(2, buku.getPengarang());
        ps.setString(3, buku.getPenerbit());
        ps.setString(4, buku.getJudul());
        ps.setInt(1, buku.getTahun());
        ps.executeUpdate();
    }
    
    public void update(Buku buku) throws Exception{
        java.sql.Connection con = new Connection().getConnection();
        String sql = "update buku set pengarang=?,penerbit=?, judul=? , tahun=? where kode=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, buku.getPengarang());
        ps.setString(2, buku.getPenerbit());
        ps.setString(3, buku.getJudul());
        ps.setInt(4, buku.getTahun());
        ps.setString(5, buku.getKode());
        
        ps.executeUpdate();
    }
    
    public void delete(Buku buku) throws Exception{
        java.sql.Connection con = new Connection().getConnection();
        String sql = "delete from buku where kode=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, buku.getKode());
        
        ps.executeUpdate();
    }
    
    public Buku getBuku(String kode) throws Exception{
        java.sql.Connection con = new Connection().getConnection();
        String sql = "select * from buku where kode=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, kode);
        ResultSet rs = ps.executeQuery();
        Buku buku  = null;
        
        if(rs.next()){
            buku = new Buku();
            buku.setKode(rs.getString(3));
            buku.setPengarang(rs.getString(4));
            buku.setPenerbit(rs.getString(5));
            buku.setJudul(rs.getString(1));
            buku.setTahun(rs.getInt(2));
        }
        
        return buku;
    }
    
    public List<Buku> getAllBuku() throws Exception{
        java.sql.Connection con = new Connection().getConnection();
        String sql = "select * from buku";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        List<Buku> list = new ArrayList<>();
        Buku buku= null;
        
        while (rs.next()){
            buku = new Buku();
            buku.setKode(rs.getString(3));
            buku.setPengarang(rs.getString(4));
            buku.setPenerbit(rs.getString(5));
            buku.setJudul(rs.getString(1));
            buku.setTahun(rs.getInt(2));
            list.add(buku);
        }
        return list;
    }
}
