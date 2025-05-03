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
public class Tugas652 {
     public static void main(String[] args){
        BufferedReader dataIn  = new BufferedReader(new InputStreamReader(System.in));
        int angka1=0;
        
        try{
            System.out.print("Enter number : ");
            angka1 = Integer.parseInt(dataIn.readLine());
        }
            catch(IOException e){
                System.out.println("Error in getting input");
        }
        
        if(angka1==1){
            System.out.println(angka1 + " " + "= Satu");
        }else if(angka1==2){
            System.out.println(angka1 + " " + "= Dua");
        }else if(angka1==3){
            System.out.println(angka1 + " " + "= Tiga");
        }else if(angka1==4){
            System.out.println(angka1 + " " + "= Empat");
        }else if(angka1==5){
            System.out.println(angka1 + " " + "= Lima");
        }else if(angka1==6){
            System.out.println(angka1 + " " + "= Enam");
        }else if(angka1==7){
            System.out.println(angka1 + " " + "= Tujuh");
        }else if(angka1==8){
            System.out.println(angka1 + " " + "= Delapan");
        }else if(angka1==9){
            System.out.println(angka1 + " " + "= Sembilan");
        }else if(angka1==10){
            System.out.println(angka1 + " " + "= Sepuluh");
        }else{
            System.out.println("Invalid number");
        }
        
        int angka2=0;
        
        try{
            System.out.print("Enter number (versi switch) : ");
            angka2 = Integer.parseInt(dataIn.readLine());
        }
            catch(IOException e){
                System.out.println("Error in getting input");
        }
        
        switch(angka2){
            case 1:
                System.out.println(angka2 + " " + "= Satu");
                break;
            case 2: 
                System.out.println(angka2 + " " + "= Dua");
                break;
            case 3:
                System.out.println(angka2 + " " + "= Tiga");
                break;
            case 4:
                System.out.println(angka2 + " " + "= Empat");
                break;
            case 5:
                System.out.println(angka2 + " " + "= Lima");
                break;
            case 6:
                System.out.println(angka2 + " " + "= Enam");
                break;
            case 7:
                System.out.println(angka2 + " " + "= Tujuh");
                break;
            case 8:
                System.out.println(angka2 + " " + "= Delapan");
                break;
            case 9:
                System.out.println(angka2 + " " + "= Sembilan");
                break;
            case 10:
                System.out.println(angka2 + " " + "= Sepuluh");
                break;    
            default:
                System.out.println("Invalid number");
                break;  
        }
    }

}
