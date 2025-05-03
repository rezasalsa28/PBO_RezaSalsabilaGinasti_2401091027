/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reza11032025;
import java.io.*;
/**
 *
 * @author ASUS
 */
public class Tugas654 {
     public static void main(String[] args){
        BufferedReader dataIn  = new BufferedReader(new InputStreamReader(System.in));
        
        int angka=0;
        int pangkat=0;
        
        try{
            System.out.print("Enter number : ");
            angka = Integer.parseInt(dataIn.readLine());
            System.out.print("Enter pangkat : ");
            pangkat = Integer.parseInt(dataIn.readLine());
        }
            catch(IOException e){
                System.out.println("Error in getting input");
        }
        
        //while-method
        int i = 0;
        int hasil=1;
        
        
        while(i<pangkat){
            hasil=hasil*angka;
            i++;
        }
        
        //do-while-method
        int hasil2=1;
        
        do{
            hasil2=hasil2*angka;
            i++;
        }while(i<pangkat);
        
        //for-method
        int hasil3=1;
        
        for(i=0;i<pangkat;i++)
        {
            hasil3=hasil3*angka;
        }
        
        System.out.println("Hasil pangkatnya (pake while) adalah : " + hasil);
        System.out.println("Hasil pangkatnya (pake do while) adalah : " + hasil);
        System.out.println("Hasil pangkatnya (pake for) adalah : " + hasil);
        
    }

}
