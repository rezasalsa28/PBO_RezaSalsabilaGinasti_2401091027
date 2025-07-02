/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reza.model;

/**
 *
 * @author ASUS
 */
public class Anggota {
    private String kode;
    private String nama;
    private String jakel;
    private String alamat;

    public Anggota(String kode, String nama, String jakel, String alamat) {
        this.kode = kode;
        this.nama = nama;
        this.jakel = jakel;
        this.alamat = alamat;
    }
    
    public Anggota(){
    
    }

    public String getKode() {
        return kode;
    }

    public String getNama() {
        return nama;
    }

    public String getJakel() {
        return jakel;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setJakel(String jakel) {
        this.jakel = jakel;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
    
}