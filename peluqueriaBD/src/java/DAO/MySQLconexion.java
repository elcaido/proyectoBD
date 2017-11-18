/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;

public class MySQLconexion {
     private Connection conn;
    private String DRIVER = "org.gjt.mm.mysql.Driver";
    private String DBURL = "jdbc:mysql://localhost/vedis3";
    private String USER = "root";
    private String PASS = "";
//     
//     private static final String DRIVER = "org.gjt.mm.mysql.Driver";
//    private static final String DBURL = "jdbc:mysql://sandbox2.ufps.edu.co/ufps_12";
//    private static final String USER = "ufps_12";
//    private static final String PASS = "ufps_hj";
    public boolean keepConnection;

     public MySQLconexion(boolean keepConnection) {
        this.keepConnection = keepConnection;
        try {
            Class.forName(DRIVER).newInstance();
            conn = DriverManager.getConnection(DBURL, USER, PASS);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Connection getConn() {
        return conn;
    }

    public boolean isKeepConnection() {
        return keepConnection;
    }
    
}
