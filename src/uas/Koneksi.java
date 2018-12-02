package uas;
import java.sql.*;
<<<<<<< HEAD
import javax.swing.*;
import javax.swing.table.*;
=======
>>>>>>> 1f50757f9ab06c8652032b23d9927081834a90b6

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
