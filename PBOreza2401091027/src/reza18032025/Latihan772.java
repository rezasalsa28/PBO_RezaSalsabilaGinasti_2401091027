/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reza18032025;

/**
 *
 * @author ASUS
 */

import javax.swing.JOptionPane;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Latihan772 {
    public static void main(String[] args) throws IOException {
        // Membuat objek BufferedReader
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Membuat array untuk menyimpan 10 nomor
        int[] nomor = new int[10];

        // Meminta 10 nomor dari user
        for (int i = 0; i < 10; i++) {
            String input = JOptionPane.showInputDialog("Masukkan nomor ke-" + (i + 1));
            nomor[i] = Integer.parseInt(input);
        }

        // Mencari nomor terbesar
        int max = nomor[0];
        for (int i = 1; i < 10; i++) {
            if (nomor[i] > max) {
                max = nomor[i];
            }
        }

        // Menampilkan nomor terbesar
        JOptionPane.showMessageDialog(null, "Nomor terbesar adalah: " + max);
    }  
}

    

