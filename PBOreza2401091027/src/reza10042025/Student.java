/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reza10042025;

/**
 *
 * @author LABP1KOMP
 */
public class Student extends person{
     public Student(){
//        super("Ani","Bukittinggi");

        super.name = "Ani";
        super.address = "Padang";
        System.out.println("Inside Student:Constructor");
    }
}

