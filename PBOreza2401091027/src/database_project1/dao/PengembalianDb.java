/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */



package database_project1.dao;

import database_project1.model.Peminjaman;
import database_project1.model.Pengembalian;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author REZA
 */

public class PengembalianDb {

    public void insert(Pengembalian pengembalian) throws Exception {
        try (java.sql.Connection con = new Connection().getConnection();
             PreparedStatement ps = con.prepareStatement(
                     "INSERT INTO pengembalian (id, kode, tglpinjam, tgldikembalikan, terlambat, denda) VALUES (?, ?, ?, ?, ?, ?)")) {

            Peminjaman peminjaman = pengembalian.getPeminjaman();
            ps.setString(1, peminjaman.getAnggota().getKode());
            ps.setString(2, peminjaman.getBuku().getKode());
            ps.setDate(3, java.sql.Date.valueOf(peminjaman.getTglPinjam()));
            ps.setDate(4, java.sql.Date.valueOf(pengembalian.getTglDikembalikan()));
            ps.setInt(5, pengembalian.getTerlambat());
            ps.setLong(6, pengembalian.getDenda());
            ps.executeUpdate();
        }
    }

    public void update(Pengembalian pengembalian) throws Exception {
        try (java.sql.Connection con = new Connection().getConnection();
             PreparedStatement ps = con.prepareStatement(
                     "UPDATE pengembalian SET tgldikembalikan = ?, terlambat = ?, denda = ? WHERE id = ?")) {

            ps.setDate(1, java.sql.Date.valueOf(pengembalian.getTglDikembalikan()));
            ps.setInt(2, pengembalian.getTerlambat());
            ps.setLong(3, pengembalian.getDenda());
            ps.setInt(4, pengembalian.getId());
            ps.executeUpdate();
        }
    }

    public void delete(Pengembalian pengembalian) throws Exception {
        try (java.sql.Connection con = new Connection().getConnection();
             PreparedStatement ps = con.prepareStatement(
                     "DELETE FROM pengembalian WHERE id = ?")) {

            ps.setInt(1, pengembalian.getId());
            ps.executeUpdate();
        }
    }
public Pengembalian getPengembalian(int idPengembalian) throws Exception {
    java.sql.Connection con = new Connection().getConnection();
    String sql = "SELECT * FROM pengembalian WHERE id = ?";
    PreparedStatement ps = con.prepareStatement(sql);
    ps.setInt(1, idPengembalian);
    ResultSet rs = ps.executeQuery();

    Pengembalian pengembalian = null;
    PeminjamanDb peminjamanDb = new PeminjamanDb();

    if (rs.next()) {
        pengembalian = new Pengembalian();
        pengembalian.setId(idPengembalian);
        String kodeAnggota = rs.getString("id");
        String kodeBuku = rs.getString("kode");
        java.sql.Date tglPinjam = rs.getDate("tglpinjam");

        Peminjaman peminjaman = peminjamanDb.getPeminjaman(kodeAnggota, kodeBuku, tglPinjam);
        pengembalian.setPeminjaman(peminjaman);
        pengembalian.setTglDikembalikan(rs.getDate("tgldikembalikan").toString());
        pengembalian.setTerlambat(rs.getInt("terlambat"));
        pengembalian.setDenda(rs.getLong("denda"));
    }

    rs.close();
    ps.close();
    con.close();
    return pengembalian;
}

public List<Pengembalian> getAll() throws Exception {
    java.sql.Connection con = new Connection().getConnection();
    String sql = "SELECT * FROM pengembalian";
    PreparedStatement ps = con.prepareStatement(sql);
    ResultSet rs = ps.executeQuery();

    List<Pengembalian> pengembalianAll = new ArrayList<>();
    PeminjamanDb peminjamanDb = new PeminjamanDb();

    while (rs.next()) {
        Pengembalian pengembalian = new Pengembalian();
        pengembalian.setId(rs.getInt("id"));

        String kodeAnggota = rs.getString("id");
        String kodeBuku = rs.getString("kode");
        java.sql.Date tglPinjam = rs.getDate("tglpinjam");

        Peminjaman peminjaman = peminjamanDb.getPeminjaman(kodeAnggota, kodeBuku, tglPinjam);
        pengembalian.setPeminjaman(peminjaman);
        pengembalian.setTglDikembalikan(rs.getDate("tgldikembalikan").toString());
        pengembalian.setTerlambat(rs.getInt("terlambat"));
        pengembalian.setDenda(rs.getLong("denda"));
        pengembalianAll.add(pengembalian);
    }

    rs.close();
    ps.close();
    con.close();
    return pengembalianAll;
}

    public int getKurangTanggal(String tgl1, String tgl2) throws Exception {
        int result = 0;
        try (java.sql.Connection con = new Connection().getConnection();
             PreparedStatement ps = con.prepareStatement("SELECT DATEDIFF(?, ?)")) {

            ps.setDate(1, java.sql.Date.valueOf(tgl1));
            ps.setDate(2, java.sql.Date.valueOf(tgl2));
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    result = rs.getInt(1);
                }
            }
        }
        return result;
    }
}