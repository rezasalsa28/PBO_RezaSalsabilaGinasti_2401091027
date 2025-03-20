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
public class Latihan651Nilai1 {
    public static void main( String[] args ){
        BufferedReader dataIn = new BufferedReader(new InputStreamReader( System.in) ); 
        int number1 = 0;
        int number2 = 0;
        int number3 = 0;
        double average;

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
        
        average= (number1 + number2+ number3)/3;
        if (average >= 60){
        System.out.println("average is "+ average);
        System.out.println(" :-) ");}
        else{
        System.out.println("average is "+ average);
        System.out.println(" :-( ");
        }
        
    } 
}
 

