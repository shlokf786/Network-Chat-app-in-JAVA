/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.server;

/**
 *
 * @author LENOVO
 */
import java.sql.*;
public class temp {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306", "srk", "qwerty");
            //here sonoo is database name, root is username and password  
            Statement stmt = con.createStatement();
            stmt.executeQuery("use demo;");
            ResultSet rs = stmt.executeQuery("select * from demoTable");
            while (rs.next()) {
                System.out.println(rs.getInt(1) + "  " + rs.getString(2));
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
