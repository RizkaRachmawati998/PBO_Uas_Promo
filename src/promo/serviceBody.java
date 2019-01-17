package promo;

import Menu_utama.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import koneksi.koneksi;

public class serviceBody implements InterfacePromo {

    String sql;
    ResultSet rs;
    koneksi kon = new koneksi();
    DefaultTableModel dtm;
    
    @Override
    public void createUpdatePromoBarang(String kd_promo, String kd_barang, String nm_barang, String jenis, Double promo, int tag) {
        if (tag == 0) {
            sql = "INSERT INTO promo VALUES('" + kd_promo + "','" + kd_barang + "','" + nm_barang + "','" + jenis+ "','"+ promo +"')";
        } else {
            sql = "UPDATE promo SET nm_barang = '" + nm_barang + "', kd_barang ='" + kd_barang + "', jenis='" + jenis + "' , promo = '" + promo + "' WHERE kd_promo = '" + kd_promo + "'";
        }
        
        try {
            kon.getStm().execute(sql);
            JOptionPane.showMessageDialog(null,"Data Berhasil Disimpan");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    @Override
    public void readPromoBarang(JTable data) {
        String kolom[] = {"Kode Promo", "Kode Barang", "Nama Barang", "Jenis", "Promo"};
        dtm = new DefaultTableModel(null, kolom);
        sql = "SELECT * FROM promo";
        try {
            rs = kon.getStm().executeQuery(sql);
            while (rs.next()) {
                Object o[] = new Object[5];
                o[0] = rs.getString("kd_promo");
                o[1] = rs.getString("kd_barang");
                o[2] = rs.getString("nm_barang");
                o[3] = rs.getString("jenis");
                o[4] = rs.getInt("promo");

                dtm.addRow(o);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
            data.setModel(dtm);

    }

    @Override
    public void deletePromoBarang(String kd_promo) {
         sql="DELETE FROM promo WHERE kd_promo='"+kd_promo+"'";
        try {
            kon.getStm().execute(sql);
            JOptionPane.showMessageDialog(null, "Hapus data berhasil");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    @Override
    public void searchPromoBarang(JTable data, String kd_promo) {
        String kolom[] = {"Kode Promo", "Kode Barang", "Nama Barang", "Jenis", "Promo"};
        dtm = new DefaultTableModel(null, kolom);
        sql = "SELECT * FROM promo WHERE kd_promo like"
                + " '%"+kd_promo+"%'";
        try {
            rs = kon.getStm().executeQuery(sql);
            while (rs.next()) {
                Object o[] = new Object[5];
                o[0] = rs.getString("kd_promo");
                o[1] = rs.getString("kd_barang");
                o[2] = rs.getString("nm_barang");
                o[3] = rs.getString("jenis");
                o[4] = rs.getInt("promo");

                dtm.addRow(o);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
            data.setModel(dtm);
    }

    
    

}
