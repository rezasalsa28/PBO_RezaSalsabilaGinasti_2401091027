/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reza.model;

/**
 *
 * @author ASUS
 */
public class Buku {
    private String judul;
    private String tahun;
    private String kode;
    private String pengarang;
    private String penerbit;
    
public Buku(String judul, String tahun, String kode, String pengarang, String penerbit) {
    this.judul = judul;
    this.tahun = tahun;
    this.kode = kode;
    this.pengarang = pengarang;
    this.penerbit = penerbit;
    }

public Buku(){
}

    public String getJudul() {
        return judul;
    }

    public String getTahun() {
        return tahun;
    }
    
    public String getKode() {
        return kode;
    }

    public String getPengarang() {
        return pengarang;
    }

    public String getPenerbit() {
        return penerbit;
    }
  

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setTahun(String tahun) {
        this.tahun = tahun;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public void setPengarang(String Pengarang) {
        this.pengarang = pengarang;
    }
    
    public void setPenerbit(String Penerbit) {
        this.penerbit = penerbit;
    }  
    
}

