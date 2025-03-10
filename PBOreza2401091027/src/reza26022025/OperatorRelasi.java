/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reza26022025;

/**
 *
 * @author LAB-MM
 */
public class OperatorRelasi {
    public static void main(String[] args){
        int i= 37;
        int j= 42;
        int k= 42;
        System.out.println("Variable values...");
        System.out.println("    i= " + i);
        System.out.println("    j= " + j);
        System.out.println("    k= " + k);
        
        //lebih besar dari
        System.out.println("Greater than...");
        System.out.println("    i > j = " + (i > j));
        System.out.println("    j > i = " + (j > i));
        System.out.println("    k > j = " + (k > j));
        
        //lebih besar atau sama dengan
        System.out.println("Greater than or equal to...");
        System.out.println("    i >= j = " + (i >= j));
        System.out.println("    j >= i = " + (j >= i));
        System.out.println("    k >= j = " + (k >= j));
        
        //lebih kecil dari
        System.out.println("Less than...");
        System.out.println("    i < j = " + (i < j));
        System.out.println("    j < i = " + (j < i));
        System.out.println("    k < j = " + (k < j));
        
        //lebih kecil atau sama dengan
        System.out.println("Less than or equal to...");
        System.out.println("    i <= j = " + (i <= j));
        System.out.println("    j <= i = " + (j <= i));
        System.out.println("    k <= j = " + (k <= j));
        
        //sama dengan
        System.out.println("Equal to...");
        System.out.println("    i == j = " + (i == j));
        System.out.println("    k == j = " + (k == j));
        
        //tidak sama dengan
        System.out.println("Not equal to...");
        System.out.println("    i != j = " + (i != j));
        System.out.println("    k != j = " + (k != j));
    }
}
