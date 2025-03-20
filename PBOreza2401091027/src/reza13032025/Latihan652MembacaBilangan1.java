/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reza13032025;

/**
 *
 * @author ASUS
 */
import java.io.*;
public class Latihan652MembacaBilangan1 {
 public static void main( String[] args ){
 BufferedReader dataIn = new BufferedReader(new InputStreamReader( System.in) );
        int angka = 0;
        
        try { 
            System.out.print("Masukkan number 1: ");
            angka = Integer.parseInt(dataIn.readLine());
        } catch(IOException e) {  
            System.out.println("Erro9r dalam membaca input");
        }
        
        if (angka == 1){
        System.out.println("Angka adalah = Satu");
        } else 
            if (angka == 2){
        System.out.println("Angka adalah = Dua");
        } else 
            if (angka == 3){
        System.out.println("Angka adalah = Tiga");
        } else 
            if (angka == 4){
        System.out.println("Angka adalah = Empat");
        } else 
            if (angka == 5){
        System.out.println("Angka adalah = Lima");
        } else 
            if (angka == 6){
        System.out.println("Angka adalah = Enam");
        } else 
            if (angka == 7){
        System.out.println("Angka adalah = Tujuh");
        } else 
            if (angka == 8){
        System.out.println("Angka adalah = Delapan");
        } else 
            if (angka == 9){
        System.out.println("Angka adalah = Sembilan");
        } else {
        System.out.println("Angka tidak valid");
        }
        
    } 
}
   
