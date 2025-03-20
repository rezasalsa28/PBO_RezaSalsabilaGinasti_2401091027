/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reza13032025;

/**
 *
 * @author ASUS
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Latihan653CetakSeratusKaliWhileLoop {
    public static void main( String[] args ){
        BufferedReader dataIn = new BufferedReader(new InputStreamReader( System.in) );
        String nama = "";
        int angka = 100;
        int i = 1;
        
        try { 
            System.out.print("Masukkan Nama: ");
            nama = dataIn.readLine(); 
        } catch(IOException e) {  
            System.out.println("Error dalam membaca input");
        }
        
        while(angka>=1){
        System.out.print(" " + i);
        System.out.println(" " + nama);
        i++;
        angka--;
        }
    }
}


