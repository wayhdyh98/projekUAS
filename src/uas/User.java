/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas;

/**
 *
 * @author Otong
 */
public class User {
    private static String username;
    
    public static void setUserLogin(String username){
        User.username = username;
    }
    
    public static String getUserLogin(){
        return username;
    }
    
}
