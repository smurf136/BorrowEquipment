/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import java.sql.*;
/**
 *
 * @author smurf
 */
public class DBConnection {
    
    Connection con = null;
    String jdbc = "jdbc:mysql://localhost:8889/Equipment";
    String username = "root";
    String password = "root";
    
    public Connection getConnection(){
        try{
            con = DriverManager.getConnection(jdbc, username, password);
        }catch (Exception e){
            con = null;
        }
        return con;
    }
    
    
}
