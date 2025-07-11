/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */



package database_project1.dao;

import database_project1.model.Anggota;
import database_project1.model.Buku;
import database_project1.model.Peminjaman;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author REZA
 */

public class PeminjamanDb {

    public void insert(Peminjaman peminjaman) throws Exception {
        String sql = "INSERT INTO peminjaman (tglpinjam, tglkembali, anggota, buku) VALUES (?, ?, ?, ?)";
        try (java.sql.Connection con = new Connection().getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, peminjaman.getTglPinjam());
            ps.setString(2, peminjaman.getTglKembali());
            ps.setString(3, peminjaman.getAnggota().getKode());
            ps.setString(4, peminjaman.getBuku().getKode());
            int rows = ps.executeUpdate();
            if (rows == 0) {
                throw new Exception("Gagal menyimpan data peminjaman.");
            }
        }
    }

    public void update(Peminjaman peminjaman) throws Exception {
        String sql = "UPDATE peminjaman SET tglkembali=?, tglpinjam=? WHERE anggota=? AND buku=?";
        try (java.sql.Connection con = new Connection().getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, peminjaman.getTglKembali());
            ps.setString(2, peminjaman.getTglPinjam());
            ps.setString(3, peminjaman.getAnggota().getKode());
            ps.setString(4, peminjaman.getBuku().getKode());
            int rows = ps.executeUpdate();
            if (rows == 0) {
                throw new Exception("Data tidak ditemukan untuk diupdate.");
            }
        }
    }

    public void delete(Peminjaman peminjaman) throws Exception {
        String sql = "DELETE FROM peminjaman WHERE anggota=? AND buku=?";
        try (java.sql.Connection con = new Connection().getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, peminjaman.getAnggota().getKode());
            ps.setString(2, peminjaman.getBuku().getKode());
            int rows = ps.executeUpdate();
            if (rows == 0) {
                throw new Exception("Data tidak ditemukan untuk dihapus.");
            }
        }
    }

    public Peminjaman getPeminjaman(String kodeAnggota, String kodeBuku, java.sql.Date tglPinjam) throws Exception {
        String sql = "SELECT cast(tglpinjam as char) as tglpinjam, cast(tglkembali as char) as tglkembali, anggota, buku FROM peminjaman WHERE anggota=? AND buku=? AND tglpinjam=?";
        try (java.sql.Connection con = new Connection().getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, kodeAnggota);
            ps.setString(2, kodeBuku);
            ps.setDate(3, tglPinjam);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    Peminjaman peminjaman = new Peminjaman();
                    peminjaman.setTglPinjam(rs.getString("tglpinjam"));
                    peminjaman.setTglKembali(rs.getString("tglkembali"));
                    AnggotaDb anggotaDb = new AnggotaDb();
                    BukuDb bukuDb = new BukuDb();
                    peminjaman.setAnggota(anggotaDb.getAnggota(rs.getString("anggota")));
                    peminjaman.setBuku(bukuDb.getBuku(rs.getString("buku")));
                    return peminjaman;
                }
            }
        }
        return null;
    }

    public List<Peminjaman> getAllPeminjaman() throws Exception {
        List<Peminjaman> list = new ArrayList<>();
        String sql = "SELECT cast(tglpinjam as char) as tglpinjam, cast(tglkembali as char) as tglkembali, anggota, buku  FROM peminjaman";
        try (java.sql.Connection con = new Connection().getConnection();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            AnggotaDb anggotaDb = new AnggotaDb();
            BukuDb bukuDb = new BukuDb();
            while (rs.next()) {
                Peminjaman p = new Peminjaman();
                p.setTglPinjam(rs.getString("tglpinjam"));
                p.setTglKembali(rs.getString("tglkembali"));
                p.setAnggota(anggotaDb.getAnggota(rs.getString("anggota")));
                p.setBuku(bukuDb.getBuku(rs.getString("buku")));
                list.add(p);
            }
        }
        return list;
    }
}