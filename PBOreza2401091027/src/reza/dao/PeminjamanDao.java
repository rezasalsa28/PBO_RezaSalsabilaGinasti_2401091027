/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reza.dao;

import reza.model.Anggota;
import reza.model.Buku;
import reza.model.Peminjaman;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class PeminjamanDao {

    public void insert(Peminjaman peminjaman) throws Exception {
        Connection con = new Koneksi().getKoneksi();
        String sql = "insert into peminjaman values(?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, peminjaman.getAnggota().getKode());
        ps.setString(2, peminjaman.getBuku().getKode());
        ps.setString(3, peminjaman.getTglpinjam());
        ps.setString(4, peminjaman.getTglkembali());
        ps.executeUpdate();
    }

    public void update(Peminjaman peminjaman) throws Exception {
        Connection con = new Koneksi().getKoneksi();
        String sql
                = "update peminjaman set tglkembali=? where kodeanggota=? and kodebuku=? and tglpinjam=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, peminjaman.getTglkembali());
        ps.setString(2, peminjaman.getAnggota().getKode());
        ps.setString(3, peminjaman.getBuku().getKode());
        ps.setString(4, peminjaman.getTglpinjam());
        ps.executeUpdate();
    }

    public void delete(Peminjaman peminjaman) throws Exception {
        Connection con = new Koneksi().getKoneksi();
        String sql = "delete from peminjaman where kodeanggota=? and kodebuku=? and tglpinjam=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, peminjaman.getAnggota().getKode());
        ps.setString(2, peminjaman.getBuku().getKode());
        ps.setString(3, peminjaman.getTglpinjam());
        ps.executeUpdate();
    }

    public Peminjaman getPeminjaman(String kodeanggota, String kodebuku, String tglpinjam) throws Exception {
        Connection con = new Koneksi().getKoneksi();
        String sql = "select * from peminjaman "
                + "where kodeanggota=? and kodebuku=? and tglpinjam=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, kodeanggota);
        ps.setString(2, kodebuku);
        ps.setString(3, tglpinjam);
        ResultSet rs = ps.executeQuery();
        Peminjaman peminjaman = null;
        Anggotadao anggotaDao = new Anggotadao();
        Bukudao bukuDao = new Bukudao();
        if (rs.next()) {
            peminjaman = new Peminjaman();
            Anggota anggota = anggotaDao.getAnggotaKode(rs.getString(1));
            peminjaman.setAnggota(anggota);
            Buku buku = bukuDao.getBukudao(rs.getString(2));
            peminjaman.setBuku(buku);
            peminjaman.setTglpinjam(rs.getString(3));
            peminjaman.setTglkembali(rs.getString(4));
        }
        return peminjaman;
    }

    public List<Peminjaman> getAllPeminjaman() throws Exception {
        Connection con = new Koneksi().getKoneksi();
        String sql = "select * from peminjaman";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        List<Peminjaman> peminjamanList = new ArrayList<>();
        Peminjaman peminjaman = null;
        Anggotadao anggotaDao = new Anggotadao();
        Bukudao bukuDao = new Bukudao();
        while (rs.next()) {
            peminjaman = new Peminjaman();
            Anggota anggota = anggotaDao.getAnggotakode(rs.getString(1));
            peminjaman.setAnggota(anggota);
            Buku buku = bukuDao.getBuku(rs.getString(2));
            peminjaman.setBuku(buku);
            peminjaman.setTglpinjam(rs.getString(3));
            peminjaman.setTglkembali(rs.getString(4));
            peminjamanList.add(peminjaman);
        }
        return peminjamanList;
    }
}


