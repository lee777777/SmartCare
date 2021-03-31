/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controllers;

import java.sql.Connection;
import java.sql.ResultSet;
import javax.annotation.Resource;

import javax.sql.DataSource;

/**
 *
 * @author THINKPAD
 */
//@Stateless

public class LoginSe {

 @Resource(mappedName="jdbc/SmartCareDB")
 private DataSource ds;
 
 public void retrieveData(){
     try {
         Connection conn = ds.getConnection();
         ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM users");
         while(rs.next()){
             System.out.println(rs.getString("uname" ));
             System.out.println(rs.getString( "passwd" ));
             System.out.println(rs.getString("role"  ));
         }
         conn.close();
     } catch (Exception e) {
         System.out.println(e.getMessage());
     }
 }
}
