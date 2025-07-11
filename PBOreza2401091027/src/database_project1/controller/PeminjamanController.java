/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


package database_project1.controller;

/**
 *
 * @author REZA
 */

import database_project1.dao.AnggotaDb;
import database_project1.dao.BukuDb;
import database_project1.dao.PeminjamanDb;
import database_project1.model.Anggota;
import database_project1.model.Buku;
import database_project1.model.Peminjaman;
import database_project1.views.FormPeminjaman;
import java.sql.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PeminjamanController {
    private FormPeminjaman formPeminjaman;
    private Peminjaman peminjaman;
    private PeminjamanDb dao;
    private AnggotaDb anggotaDao;
    private BukuDb bukuDao;

    public PeminjamanController(FormPeminjaman formPeminjaman) {
        this.formPeminjaman = formPeminjaman;
        dao = new PeminjamanDb();
        anggotaDao = new AnggotaDb();
        bukuDao = new BukuDb();
    }

    public void clearScreen() {
        anggotaCodeOption();
        bukuCodeOption();
        formPeminjaman.getFieldTglPinjam().setText("");
        formPeminjaman.getFieldTglKembali().setText("");
    }

    public void insert() {
    try {
        peminjaman = new Peminjaman();
        String kodeAnggota = formPeminjaman.getOptionKodeAnggota().getSelectedItem().toString().split("-")[0];
        String kodeBuku = formPeminjaman.getOptionKodeBuku().getSelectedItem().toString();
        String tglPinjamStr = formPeminjaman.getFieldTglPinjam().getText();
        String tglKembaliStr = formPeminjaman.getFieldTglKembali().getText();

        if (!tglPinjamStr.matches("\\d{4}-\\d{2}-\\d{2}") || !tglKembaliStr.matches("\\d{4}-\\d{2}-\\d{2}")) {
            JOptionPane.showMessageDialog(formPeminjaman, "Format tanggal harus yyyy-MM-dd!");
            return;
        }

        String tglPinjam = tglPinjamStr;
        String tglKembali = tglKembaliStr;

        Anggota anggota = anggotaDao.getAnggota(kodeAnggota);
        Buku buku = bukuDao.getBuku(kodeBuku);

        peminjaman.setAnggota(anggota);
        peminjaman.setBuku(buku);
        peminjaman.setTglPinjam(tglPinjam);
        peminjaman.setTglKembali(tglKembali);

        dao.insert(peminjaman);
        JOptionPane.showMessageDialog(formPeminjaman, "Data berhasil ditambahkan.");
    } catch (Exception ex) {
        Logger.getLogger(PeminjamanController.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(formPeminjaman, "Gagal menyimpan data.");
    }
}
public void update() {
    try {
        String kodeAnggota = formPeminjaman.getOptionKodeAnggota().getSelectedItem().toString().split("-")[0];
        String kodeBuku = formPeminjaman.getOptionKodeBuku().getSelectedItem().toString();
        String tglPinjamStr = formPeminjaman.getFieldTglPinjam().getText();
        String tglKembaliStr = formPeminjaman.getFieldTglKembali().getText();

        if (!tglPinjamStr.matches("\\d{4}-\\d{2}-\\d{2}") || !tglKembaliStr.matches("\\d{4}-\\d{2}-\\d{2}")) {
            JOptionPane.showMessageDialog(formPeminjaman, "Format tanggal harus yyyy-MM-dd!");
            return;
        }

        String tglPinjam = tglPinjamStr;
        String tglKembali = tglKembaliStr;

        Anggota anggota = anggotaDao.getAnggota(kodeAnggota);
        Buku buku = bukuDao.getBuku(kodeBuku);

        peminjaman = new Peminjaman();
        peminjaman.setAnggota(anggota);
        peminjaman.setBuku(buku);
        peminjaman.setTglPinjam(tglPinjam);
        peminjaman.setTglKembali(tglKembali);

        dao.update(peminjaman);
        JOptionPane.showMessageDialog(formPeminjaman, "Data berhasil diupdate.");
    } catch (Exception ex) {
        Logger.getLogger(PeminjamanController.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(formPeminjaman, "Gagal mengupdate data.");
    }
}
    

  public void delete() {
    try {
        String kodeAnggota = formPeminjaman.getOptionKodeAnggota().getSelectedItem().toString().split("-")[0];
        String kodeBuku = formPeminjaman.getOptionKodeBuku().getSelectedItem().toString();
        String tglPinjamStr = formPeminjaman.getFieldTglPinjam().getText();

        if (!tglPinjamStr.matches("\\d{4}-\\d{2}-\\d{2}")) {
            JOptionPane.showMessageDialog(formPeminjaman, "Format tanggal pinjam salah! Gunakan yyyy-MM-dd");
            return;
        }

        Date tglPinjam = Date.valueOf(tglPinjamStr);
        Peminjaman data = dao.getPeminjaman(kodeAnggota, kodeBuku, tglPinjam);
        if (data != null) {
            dao.delete(data);
            JOptionPane.showMessageDialog(formPeminjaman, "Data berhasil dihapus.");
        } else {
            JOptionPane.showMessageDialog(formPeminjaman, "Data tidak ditemukan!");
        }
    } catch (Exception ex) {
        Logger.getLogger(PeminjamanController.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(formPeminjaman, "Gagal menghapus data.");
    }
}

  public void search() {
    try {
        if (formPeminjaman.getOptionKodeAnggota().getSelectedItem() == null || formPeminjaman.getOptionKodeBuku().getSelectedItem() == null) {
            return;
        }

        String kodeAnggota = formPeminjaman.getOptionKodeAnggota().getSelectedItem().toString().split("-")[0];
        String kodeBuku = formPeminjaman.getOptionKodeBuku().getSelectedItem().toString();

        // Coba ambil semua data peminjaman
        List<Peminjaman> list = dao.getAllPeminjaman();
        for (Peminjaman p : list) {
            if (p.getAnggota().getKode().equals(kodeAnggota) && p.getBuku().getKode().equals(kodeBuku)) {
                formPeminjaman.getFieldTglPinjam().setText(p.getTglPinjam().toString());
                formPeminjaman.getFieldTglKembali().setText(p.getTglKembali().toString());
                return;
            }
        }

        // Kalau ga ketemu
        formPeminjaman.getFieldTglPinjam().setText("");
        formPeminjaman.getFieldTglKembali().setText("");
    } catch (Exception ex) {
        Logger.getLogger(PeminjamanController.class.getName()).log(Level.SEVERE, null, ex);
    }
}

    public void viewData() {
        try {
            DefaultTableModel model = (DefaultTableModel) formPeminjaman.getTabelPeminjaman().getModel();
            model.setNumRows(0);
            List<Peminjaman> list = dao.getAllPeminjaman();
            for (Peminjaman peminjaman : list) {
                Object[] data = {
                    peminjaman.getAnggota().getKode(),
                    peminjaman.getBuku().getKode(),
                    peminjaman.getTglPinjam().toString(),
                    peminjaman.getTglKembali().toString()
                };
                model.addRow(data);
            }
        } catch (Exception ex) {
            Logger.getLogger(PeminjamanController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void anggotaCodeOption() {
        try {
            List<Anggota> anggotaList = anggotaDao.getAllAnggota();
            formPeminjaman.getOptionKodeAnggota().removeAllItems();
            for (Anggota anggota : anggotaList) {
                formPeminjaman.getOptionKodeAnggota().addItem(anggota.getKode() + "-" + anggota.getNama());
            }
        } catch (Exception ex) {
            Logger.getLogger(PeminjamanController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void bukuCodeOption() {
        try {
            List<Buku> bukuList = bukuDao.getAllBuku();
            formPeminjaman.getOptionKodeBuku().removeAllItems();
            for (Buku buku : bukuList) {
                formPeminjaman.getOptionKodeBuku().addItem(buku.getKode());
            }
        } catch (Exception ex) {
            Logger.getLogger(PeminjamanController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
