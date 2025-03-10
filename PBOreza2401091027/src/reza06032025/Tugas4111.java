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
public class Tugas4111 {
    public static void main( String[] args ){
        BufferedReader dataIn = new BufferedReader(new InputStreamReader( System.in) ); 
        int number = 0;
        char letter = ' ';
        boolean result = false;
        String str = "";

        try { 
            System.out.print("Masukkan angka: ");
            number = Integer.parseInt(dataIn.readLine()); 
            System.out.print("Masukkan huruf: ");
            letter = dataIn.readLine().charAt(0); 
            System.out.print("Masukkan boolean (true/false): ");
            result = Boolean.parseBoolean(dataIn.readLine()); 
            System.out.print("Masukkan string: ");
            str = dataIn.readLine(); 
        } catch(IOException e) {  
            System.out.println("Error dalam membaca input");
        } catch(NumberFormatException e) {
            System.out.println("Format angka tidak valid");
        }

        System.out.println("\nHasil Input:");
        System.out.println("Angka: " + number);
        System.out.println("Huruf: " + letter);
        System.out.println("Boolean: " + result);
        System.out.println("String: " + str);
    }
}
