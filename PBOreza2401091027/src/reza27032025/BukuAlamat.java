/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reza27032025;
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author ASUS
 */
public class BukuAlamat {
    private final ArrayList<EntryBukuAlamat> daftarKontak;
    private static final int MAKS_KONTAK = 100;


    public BukuAlamat() {
       this.daftarKontak = new ArrayList<>();
    }

   
    public void tambahKontak(String nama, String alamat, String nomorTelepon, String email) {
        if (daftarKontak.size() < MAKS_KONTAK) {
            daftarKontak.add(new EntryBukuAlamat(nama, alamat, nomorTelepon, email));
            System.out.println("Kontak berhasil ditambahkan!");
        } else {
            System.out.println("Buku alamat penuh, tidak bisa menambahkan kontak baru.");
        }
    }

   
    public void hapusKontak(String nama) {
        boolean ditemukan = false;
        for (int i = 0; i < daftarKontak.size(); i++) {
            if (daftarKontak.get(i).getNama().equalsIgnoreCase(nama)) {
                daftarKontak.remove(i);
                ditemukan = true;
                System.out.println("Kontak berhasil dihapus.");
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Kontak dengan nama '" + nama + "' tidak ditemukan.");
        }
    }

   public void tampilkanSemuaKontak() {
        if (daftarKontak.isEmpty()) {
            System.out.println("Buku alamat kosong.");
        } else {
            for (EntryBukuAlamat kontak : daftarKontak) {
                kontak.tampilkanInfo();
                System.out.println("----------------------");
            }
        }
    }

   
    public void updateKontak(String namaLama, String namaBaru, String alamatBaru, String nomorTeleponBaru, String emailBaru) {
        boolean ditemukan = false;
        for (EntryBukuAlamat kontak : daftarKontak) {
            if (kontak.getNama().equalsIgnoreCase(namaLama)) {
                kontak.setNama(namaBaru);
                kontak.setAlamat(alamatBaru);
                kontak.setNomorTelepon(nomorTeleponBaru);
                kontak.setEmail(emailBaru);
                ditemukan = true;
                System.out.println("Kontak berhasil diperbarui.");
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Kontak dengan nama '" + namaLama + "' tidak ditemukan.");
        }
    }


    public static void main(String[] args) {
        BukuAlamat bukuAlamat = new BukuAlamat();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu Buku Alamat:");
            System.out.println("1. Tambah Kontak");
            System.out.println("2. Hapus Kontak");
            System.out.println("3. Tampilkan Semua Kontak");
            System.out.println("4. Update Kontak");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine(); // konsumsi newline

            switch (pilihan) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = scanner.nextLine();
                    System.out.print("Alamat: ");
                    String alamat = scanner.nextLine();
                    System.out.print("Nomor Telepon: ");
                    String nomor = scanner.nextLine();
                    System.out.print("Email: ");
                    String email = scanner.nextLine();
                    bukuAlamat.tambahKontak(nama, alamat, nomor, email);
                    break;
                case 2:
                    System.out.print("Masukkan nama kontak yang akan dihapus: ");
                    String namaHapus = scanner.nextLine();
                    bukuAlamat.hapusKontak(namaHapus);
                    break;
                case 3:
                    bukuAlamat.tampilkanSemuaKontak();
                    break;
                case 4:
                    System.out.print("Masukkan nama kontak yang akan diperbarui: ");
                    String namaLama = scanner.nextLine();
                    System.out.print("Nama baru: ");
                    String namaBaru = scanner.nextLine();
                    System.out.print("Alamat baru: ");
                    String alamatBaru = scanner.nextLine();
                    System.out.print("Nomor Telepon baru: ");
                    String nomorBaru = scanner.nextLine();
                    System.out.print("Email baru: ");
                    String emailBaru = scanner.nextLine();
                    bukuAlamat.updateKontak(namaLama, namaBaru, alamatBaru, nomorBaru, emailBaru);
                    break;
                case 5:
                    System.out.println("Terima kasih, program selesai.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }
}



