/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package database_project1.dao;

import java.sql.DriverManager;

/**
 *
 * @author REZA
 */

public class Connection {
    private final String url = "jdbc:mysql://localhost/pbo_1025";
    private final String username = "root";
    private final String password = "";
    
    public java.sql.Connection getConnection() throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(url, username, password);
    }
    
    public static void main(String[] args){
        Connection connect = new Connection();
        
        try {
            connect.getConnection();
            System.out.println("ok");
        } catch (Exception ex) {
            System.out.println("eror : " + ex.getMessage());
        }
    }
}
