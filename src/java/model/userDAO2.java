/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Kej
 */
public class userDAO2 {
    public static void check(userBean ub) {
        DBConnector2 dbc = new DBConnector2();
        dbc.getConnection();
        ResultSet rs = dbc.getSelectResults("SELECT * FROM userinfo");
        try {
            while (rs.next()) {
                String name = rs.getString(1);
                String pass = rs.getString(2);
                if(ub.getUsername().equals(name) && ub.getPassword().equals(pass)){
                    ub.setType(1);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
