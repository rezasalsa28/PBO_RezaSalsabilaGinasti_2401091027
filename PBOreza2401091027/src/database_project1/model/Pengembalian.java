/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */



package database_project1.model;

/**
 *
 * @author REZA
 */

public class Pengembalian {
    private int id;
    private Peminjaman peminjaman;
    private String tglDikembalikan;
    private int terlambat;
    private long denda;

    public Pengembalian() {
    }

    public int getId() {
        return id;
    }

    public Peminjaman getPeminjaman() {
        return peminjaman;
    }

    public String getTglDikembalikan() {
        return tglDikembalikan;
    }

    public int getTerlambat() {
        return terlambat;
    }

    public long getDenda() {
        return denda;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPeminjaman(Peminjaman peminjaman) {
        this.peminjaman = peminjaman;
    }

    public void setTglDikembalikan(String tglDikembalikan) {
        this.tglDikembalikan = tglDikembalikan;
    }

    public void setTerlambat(int terlambat) {
        this.terlambat = terlambat;
    }

    public void setDenda(long denda) {
        this.denda = denda;
    }

    // Tambahkan method khusus untuk hitung denda
    public void hitungDendaOtomatis() {
        this.denda = 1000000000L * this.terlambat;
    }
}