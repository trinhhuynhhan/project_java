/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Data;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Administrator
 */
public class Database {
    public static  Connection c;
    private static  String db_url = "jdbc:mysql://localhost:3306/qldt";
    private static  String username = "root";
    private static  String password = "";
    
    public  static  Connection getConnection() throws Exception {
        if (c == null) {
            c  = DriverManager.getConnection(db_url,username,password);
        }
        return  c;
    }
    
//    public static void main(String[] args) throws Exception {
//        Connection connection = Database.getConnection();
//        System.out.println(connection);
//    }
}
