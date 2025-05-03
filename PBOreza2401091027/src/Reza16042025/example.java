/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reza16042025;

/**
 *
 * @author ASUS
 */
public class example {
 public static void main (String[] args){
        
        LSquare l1 = new LSquare(4,5);
        LSquare l2 = new LSquare(10,20);
        
        Relation r = new LSquare(0,0); 
        
        System.out.println("Luas persegi panjang 1 > persegi panjang 2? " + r.isGreaterWide(l1, l2));
        System.out.println("Luas persegi panjang 1 < persegi panjang 2? " + r.isLessWide(l1, l2));
        System.out.println("Luas sama? " + r.isEqualWide(l1, l2));

        System.out.println("Keliling persegi panjang 1 > persegi panjang 2 ? " + r.isGreaterArround(l1, l2));
        System.out.println("Keliling persegi panjang 1 < persegi panjang 2? " + r.isLessArround(l1, l2));
        System.out.println("Keliling sama? " + r.isEqualArround(l1, l2));
    }
   
}
