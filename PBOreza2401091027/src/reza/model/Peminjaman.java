/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reza.model;

/**
 *
 * @author ASUS
 */
public class Peminjaman {
    private Anggota anggota;
    private Buku buku;
    private String tglpinjam;
    private String tglkembali;

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

    public String getTglpinjam() {
        return tglpinjam;
    }

    public void setTglpinjam(String tglpinjam) {
        this.tglpinjam = tglpinjam;
    }

    public String getTglkembali() {
        return tglkembali;
    }

    public void setTglkembali(String tglkembali) {
        this.tglkembali = tglkembali;
    }

    
    
}

