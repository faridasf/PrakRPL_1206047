





/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 */
public class KoneksiDatabase {

    private static Connection koneksi;

    public static Connection getKoneksi() {
        if (koneksi == null) {
            try {
                String url = "jdbc:mysql://localhost:3306/apotek";
                String user = "root";
                String password = "";

                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                koneksi = DriverManager.getConnection(url, user, password);
                System.out.println("Membuat Koneksi");
            } catch (SQLException t) {
                System.out.println("Eror Membuat Koneksi");
            }
        }

        return koneksi;


    }
}
