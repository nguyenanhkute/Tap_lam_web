/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connect;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author N
 */
public class DBConnect {
    public static Connection getConnecttion() {
        Connection conn = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=bh_tet", "sa", "sa");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
    public static void main(String[] args) {
        System.out.println(getConnecttion());
    }

}
