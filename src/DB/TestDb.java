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
public class TestDb {
    public static void main(String[] args) {
        DBConnection dbCon = new DBConnection();
        Connection con = dbCon.getConnection(); 
        try{
            System.out.println("con");
            System.out.println(con);
            Statement stmt = con.createStatement();
            System.out.println("stmt");
            stmt.executeUpdate("insert into equipment_student values ("  + "630000001, 'E0001')");
            ResultSet rs = stmt.executeQuery(
                    "select * from equipment_student"
            );
            while(rs.next()){
//                System.out.printf("id: %d, name: %s, sex: %s, phone: %d \n", rs.getInt(1), rs.getString(4), rs.getString(3), rs.getInt(2));
                    System.out.println(rs.getInt(1) + rs.getString(2));
            }
        }catch (Exception e){
            System.out.println("here" +e);
        }
        
    }
}
