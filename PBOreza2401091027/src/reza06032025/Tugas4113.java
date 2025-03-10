/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reza06032025;

/**
 *
 * @author LAB-MM
 */
import java.io.*;
public class Tugas4113 {
    public static void main( String[] args ){
        BufferedReader dataIn = new BufferedReader(new InputStreamReader( System.in) ); 
        int number1= 0;
        int number2= 0;
        int number3= 0;
        int max1, max;

        try { 
            System.out.print("Masukkan number 1: ");
            number1 = Integer.parseInt(dataIn.readLine());
            System.out.print("Masukkan number 2: ");
            number2 = Integer.parseInt(dataIn.readLine());
            System.out.print("Masukkan number 3: ");
            number3 = Integer.parseInt(dataIn.readLine());
        } catch(IOException e) {  
            System.out.println("Error dalam membaca input");
        }
        
        max1= (number1 >= number2)?number1:number2;
        max= (max1 >= number3)?max1:number3;
        
        System.out.println(" Terbesar = " +max);
    }
}
