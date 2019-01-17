package tblBarang;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import koneksi.koneksi;

public class serviceBarang implements InterfaceBarang {

    String sql;
    ResultSet rs;
    koneksi kon = new koneksi();
    DefaultTableModel dtm;

    @Override
    public void createUpdateBarang(String kd_barang, String nm_barang, String jenis, String detail, Double harga, int tag) {
        if (tag == 0) {
            sql = "INSERT INTO barang VALUES('" + kd_barang + "','" + nm_barang + "','" + jenis + "','" + detail + "','" + harga + "')";
        } else {
            sql = "UPDATE barang SET nm_barang = '" + nm_barang + "', jenis ='" + jenis + "',detail ='" + detail + "' , harga = '" + harga + "' WHERE kd_barang = '" + kd_barang + "'";
        }
        try {
            kon.getStm().execute(sql);
            JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    @Override
    public void readBarang(JTable data) {
        String kolom[] = {"Kode Barang", "Nama Barang", "Jenis Barang", "Detail", "Harga"};
        dtm = new DefaultTableModel(null, kolom);
        sql = "SELECT * FROM barang";
        try {
            rs = kon.getStm().executeQuery(sql);
            while (rs.next()) {
                Object o[] = new Object[5];
                o[0] = rs.getString("kd_barang");
                o[1] = rs.getString("nm_barang");
                o[2] = rs.getString("jenis");
                o[3] = rs.getString("detail");
                o[4] = rs.getDouble("harga");

                dtm.addRow(o);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        data.setModel(dtm);
    }

    @Override
    public void deleteBarang(String kd_barang) {
        sql = "DELETE FROM barang WHERE kd_barang='" + kd_barang + "'";
        try {
            kon.getStm().execute(sql);
            JOptionPane.showMessageDialog(null, "Hapus data berhasil");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    @Override
    public void searchBarang(JTable data, String kd_barang) {
        String kolom[] = {"Kode Barang", "Nama Barang", "Jenis", "Detail", "Harga"};
        dtm = new DefaultTableModel(null, kolom);
        sql = "SELECT * FROM barang WHERE kd_barang like"
                + " '%" + kd_barang + "%'";
        try {
            rs = kon.getStm().executeQuery(sql);
            while (rs.next()) {
                Object o[] = new Object[5];
                o[0] = rs.getString("kd_barang");
                o[1] = rs.getString("nm_barang");
                o[2] = rs.getString("jenis");
                o[3] = rs.getString("detail");
                o[4] = rs.getInt("harga");

                dtm.addRow(o);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        data.setModel(dtm);
    }

}
