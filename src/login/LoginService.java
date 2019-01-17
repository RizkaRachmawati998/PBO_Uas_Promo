package login;

import java.sql.ResultSet;
import javax.swing.JOptionPane;
import koneksi.koneksi;

public class LoginService {
    koneksi kon = new koneksi();
    String sql;
    boolean status;
    ResultSet rs;
    static String namaUser;
    public void login(String Username, String Password) {
        sql = "SELECT * FROM admin WHERE Username='"+Username+"' AND password='"+Password+"'";
        
        try {
            rs = kon.getStm().executeQuery(sql);
            while (rs.next()) {
                if (Username.equalsIgnoreCase(rs.getString("username"))
                        && Password.equalsIgnoreCase(rs.getString("password"))) {
                    status=true;
                    
                } else {
                    status=false;
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
