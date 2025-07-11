/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package database_project1.dao;

import database_project1.model.Anggota;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author REZA
 */

public class AnggotaDb {
    public void insert(Anggota anggota) throws Exception{
        java.sql.Connection con = new Connection().getConnection();
        String sql = "insert into anggota (Kode, nama, jekel, alamat) values (?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, anggota.getKode());
        ps.setString(2, anggota.getNama());
        ps.setString(3, anggota.getJekel());
        ps.setString(4, anggota.getAlamat());
        ps.executeUpdate();
    }
    
    public void update(Anggota anggota) throws Exception{
        java.sql.Connection con = new Connection().getConnection();
        String sql = "update anggota set nama=?, jekel=?, alamat=? where kode=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, anggota.getNama());
        ps.setString(2, anggota.getJekel());
        ps.setString(3, anggota.getAlamat());
        ps.setString(4, anggota.getKode());
        
        ps.executeUpdate();
    }
    
    public void delete(Anggota anggota) throws Exception{
        java.sql.Connection con = new Connection().getConnection();
        String sql = "delete from anggota where kode=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, anggota.getKode());
        
        ps.executeUpdate();
    }
    
    public Anggota getAnggota(String kode) throws Exception{
        java.sql.Connection con = new Connection().getConnection();
        String sql = "select * from anggota where kode=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, kode);
        ResultSet rs = ps.executeQuery();
        Anggota anggota  = null;
        
        if(rs.next()){
            anggota = new Anggota();
            anggota.setKode(rs.getString(2));
            anggota.setNama(rs.getString(3));
            anggota.setJekel(rs.getString(4));
            anggota.setAlamat(rs.getString(1));
        }
        
        return anggota;
    }
    
    public List<Anggota> getAllAnggota() throws Exception{
        java.sql.Connection con = new Connection().getConnection();
        String sql = "select * from anggota";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        List<Anggota> list = new ArrayList<>();
        Anggota anggota= null;
        
        while (rs.next()){
            anggota = new Anggota();
            anggota.setKode(rs.getString(2));
            anggota.setNama(rs.getString(3));
            anggota.setJekel(rs.getString(4));
            anggota.setAlamat(rs.getString(1));
            list.add(anggota);
        }
        return list;
    }

}
