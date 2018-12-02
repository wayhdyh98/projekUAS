package backend;
import java.sql.*;

public class Backend {
    public static Connection koneksi;

    public static void openConnect() {
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

    public static int insertQueryGetId(String query) {
        openConnect();
        int num = 0;
        int result = -1;
        try {
            Statement stmt = koneksi.createStatement();
            num = stmt.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = stmt.getGeneratedKeys();
            if (rs.next()) {
                result = rs.getInt(1);
            }
            rs.close();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
            result = -1;
        }
        return result;
    }

    public static boolean executeQuery(String query) {
        openConnect();
        boolean result = false;
        try {
            Statement stmt = koneksi.createStatement();
            stmt.executeUpdate(query);
            result = true;
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public static ResultSet selectQuery(String query) {
        openConnect();
        ResultSet rs = null;
        try {
            Statement stmt = koneksi.createStatement();
            rs = stmt.executeQuery(query);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }
}
