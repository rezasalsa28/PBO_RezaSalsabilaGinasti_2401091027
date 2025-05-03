/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reza11032025;

/**
 *
 * @author ASUS
 */
public class Tugas653 {
     public static void main(String[] args){
        
        String name="Reza Salsabila Ginasti";
        
        //while-loop
        System.out.print("Versi while loop");
        int whilevar=0;
        while (whilevar<100){
            System.out.println(name);
            whilevar++;
        }
        
        //do-while
        System.out.println("");
        System.out.println("Versi do while");
        
        int dovar=0;
        
        do{
            System.out.println(name);
            dovar++;
        }while (dovar<100);
        
        
        //for
        System.out.println("");
        System.out.println("Versi for");
        
        int forvar;
        
        for (forvar=0; forvar<100; forvar++ ){
            System.out.println(name);
        }
    }

    
}
