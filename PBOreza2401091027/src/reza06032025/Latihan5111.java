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
public class Latihan5111 {
    public static void main( String[] args ){
        BufferedReader dataIn = new BufferedReader(new InputStreamReader( System.in) ); 
        String word1="";
        String word2="";
        String word3="";
        try{ 
               word1 = dataIn.readLine();
               word2 = dataIn.readLine();
               word3 = dataIn.readLine();
         } catch(IOException e ){  
            System.out.println("Error in getting input");
         } 
        System.out.print(" "+ word1);
        System.out.print(" "+ word2);
        System.out.print(" "+ word3);
    } 
}
