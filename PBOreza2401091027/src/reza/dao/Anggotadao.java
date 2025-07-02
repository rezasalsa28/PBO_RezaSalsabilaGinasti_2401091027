/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reza.dao;



import reza.model.Anggota;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class Anggotadao {
    public void insert(Anggota anggota) throws Exception{
        Connection con = new Koneksi().getKoneksi();
        String sql = "insert into anggota values(?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1,anggota.getKode());
        ps.setString(2,anggota.getNama());
        ps.setString(3,anggota.getAlamat());
        ps.setString(4,anggota.getJakel());
        ps.executeUpdate();
    }
    
    public void update (Anggota anggota) throws Exception {
        Connection con = new Koneksi().getKoneksi();
        String sql =
           "update anggota set nama=?, alamat=?,jakel=? where kodeanggota=?";
        PreparedStatement ps = con.prepareStatement(sql);
       
        ps.setString(1,anggota.getNama());
        ps.setString(2,anggota.getAlamat());
        ps.setString(3,anggota.getJakel());
        ps.setString(4,anggota.getKode());
        ps.executeUpdate();
    }
    
    public void delete (Anggota anggota) throws Exception{
     Connection con = new Koneksi().getKoneksi(); 
     String sql ="udelete from anggota where kodeta=?";
     PreparedStatement ps = con.prepareStatement(sql);
     ps.setString(1,anggota.getKode());
     ps.executeUpdate();
    }
    
    
    
    public List<Anggota> getAllAnggota() throws Exception{
       Connection con = new Koneksi().getKoneksi(); 
       String sql = "Select * from anggota";
       PreparedStatement ps = con.prepareStatement(sql);
       ResultSet rs = ps.executeQuery();
       List<Anggota> anggotaList = new ArrayList<>();
       Anggota anggota;
       while(rs.next()){
           anggota = new Anggota();
           anggota.setKode(rs.getString(1));
           anggota.setNama(rs.getString(2));
           anggota.setAlamat(rs.getString(3));
           anggota.setJakel(rs.getString(4));
           anggotaList.add(anggota);
       }
       return anggotaList;
     }
}


