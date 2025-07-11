/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */



package database_project1.model;

/**
 *
 * @author REZA
 */

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Peminjaman {
    private Anggota anggota;
    private Buku buku;
    private String tglPinjam;
    private String tglKembali;

    public Peminjaman() {
    }

    public Anggota getAnggota() {
        return anggota;
    }

    public void setAnggota(Anggota anggota) {
        this.anggota = anggota;
    }

    public Buku getBuku() {
        return buku;
    }

    public void setBuku(Buku buku) {
        this.buku = buku;
    }

    public String getTglPinjam() {
        return tglPinjam;
    }

    public void setTglPinjam(String tglPinjam) {
        this.tglPinjam = tglPinjam;
    }

    public String getTglKembali() {
        return tglKembali;
    }

    public void setTglKembali(String tglKembali) {
        this.tglKembali = tglKembali;
    }

    // Helper tambahan kalau kamu butuh tampilkan sebagai String
    public String getTglPinjamAsString() {
        return new SimpleDateFormat("yyyy-MM-dd").format(tglPinjam);
    }

    public String getTglKembaliAsString() {
        return new SimpleDateFormat("yyyy-MM-dd").format(tglKembali);
    }

}