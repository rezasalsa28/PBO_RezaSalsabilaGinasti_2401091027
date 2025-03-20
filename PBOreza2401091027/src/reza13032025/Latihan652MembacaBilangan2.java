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
public class Latihan652MembacaBilangan2 {
    public static void main( String[] args ){
    BufferedReader dataIn = new BufferedReader(new InputStreamReader( System.in) );
        int angka = 0;
        
        try { 
            System.out.print("Masukkan number 1: ");
            angka = Integer.parseInt(dataIn.readLine());
        } catch(IOException e) {  
            System.out.println("Erro9r dalam membaca input");
        }
        
        switch(angka){
        case 1:
            System.out.println( "Angka adalah = Satu" );
            break;
        case 2:
            System.out.println( "Angka adalah = Dua" );
            break;
        case 3:
            System.out.println( "Angka adalah = Tiga" );
            break;    
        case 4:
            System.out.println( "Angka adalah = Empat" );
            break;    
        case 5:
            System.out.println( "Angka adalah = Lima" );
            break;
        case 6:
            System.out.println( "Angka adalah = Enam" );
            break;    
        case 7:
            System.out.println( "Angka adalah = Tujuh" );
            break;
        case 8:
            System.out.println( "Angka adalah = Delapan" );
            break;
        case 9:
            System.out.println( "Angka adalah = Sembilan" );
            break;      
        default:
            System.out.println("Angka tidak valid");
        }
        
    }
}


