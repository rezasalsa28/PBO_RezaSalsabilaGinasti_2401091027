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
public class person {
    protected String name;
   protected String address;
   
   public person() {
       System.out.println("Inside Person:Constructor");
       name = "Ali";
       address = "Padang";
   }
   
   public person( String name, String address ){
       this.name = name;
       this.address = address;
   } 
   
   public String getName(){
       return name;
   }
   
   public String getAddress(){
       return address;
   }
   
   public void setName( String name ){
       this.name = name;
   }
   
   public void setAddress( String add ){
       this.address = add;
   } 
  
}
    

