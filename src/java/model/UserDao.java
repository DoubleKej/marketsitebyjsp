/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Kej
 */
public class UserDao {
    static Map<String, User> USERS = new HashMap<String, User>();
    
    static {
        USERS.put("Kej", new User("Kej", "admin"));
        
    } 
    
    public static User getUser(String username){
        return USERS.get(username);
    }
    
}
