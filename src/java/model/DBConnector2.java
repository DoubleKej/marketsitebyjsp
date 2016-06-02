/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Kej
 */
public class DBConnector2 {
    private static String dbPath = "jdbc:mysql://localhost:3306/bigexercise";
    private static String user = "root";
    private static String password = "";
    Connection conn;
    Statement stm;
    ResultSet rs;

    public void getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(dbPath, user, password);
            System.out.println("DB is Connected");
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }

    public ResultSet getSelectResults(String sql) {
        try {
            stm = conn.createStatement();
            rs = stm.executeQuery(sql);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return rs;
    }
}
