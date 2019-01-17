package koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class koneksi {
  private Connection con;
    private Statement stm;
    private String database="toko_ku";
    private String url="jdbc:mysql://localhost/" + database;
    private String password = "";
    private String username = "root";

    public Statement getStm() {
        return stm;
    }
    public Connection getCon() {
        return con;
    }

    public koneksi() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url,username,password);
            stm = con.createStatement();
//            JOptionPane.showMessageDialog(null, "Koneksi sukses");
        } catch (Exception e) {
            System.err.println("koneksi gagal" + e.getMessage());
        }
    }
    public static void main(String[] args) {
        new koneksi();
    }

    
}
   

