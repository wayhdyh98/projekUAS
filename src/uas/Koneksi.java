package uas;
import java.sql.*;
import javax.swing.*;

public class Koneksi extends javax.swing.JFrame {
    public static Connection koneksi;
    
    public void openConnect() {
        if (koneksi == null) {
            try {
                String url = "jdbc:mysql://localhost:3306/uas";
                String user = "root";
                String password = "";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                koneksi = (Connection) DriverManager.getConnection(url, user, password);
            } catch (SQLException t) {
                System.out.println("Error membuat koneksi");
            }
        }
    }
}
