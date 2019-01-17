/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transaksi;

import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import koneksi.koneksi;

/**
 *
 * @author Rizka Rachmawati
 */
public class serviceTransaksi implements InterfaceTransaksi {

    String sql;
    ResultSet rs;
    koneksi kon = new koneksi();
    DefaultTableModel dtm;

    @Override
    public void createTransaksi(int kd_transaksi, String kd_barang, int qty, Double total_harga, Double jml_bayar, int tag) {
        sql = "INSERT INTO transaksi VALUES ('" + kd_transaksi + "','" + kd_barang + "','" + qty + "','" + total_harga + "','" + jml_bayar + "')";

        try {
            kon.getStm().execute(sql);
            JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    @Override
    public void readTransaksi(JTable data) {
        sql = "SELECT * FROM transaksi";
        String Header[] = {"Kd Transaksi", "Kd Barang", "qty", "Total Harga", "Jumlah Bayar"};
        dtm = new DefaultTableModel(null, Header);
        try {
            rs = kon.getStm().executeQuery(sql);
            while (rs.next()) {
                Object o[] = new Object[5];
                o[0] = rs.getInt("kd_transaksi");
                o[1] = rs.getString("kd_barang");
                o[2] = rs.getInt("qty");
                o[3] = rs.getDouble("total_harga");
                o[4] = rs.getDouble("jml_bayar");
                dtm.addRow(o);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        data.setModel(dtm);
    }

    @Override
    public void deleteTransaksi(String kd_transaksi) {
        sql = "DELETE FROM transaksi WHERE kd_transaksi='" + kd_transaksi + "'";
        try {
            kon.getStm().execute(sql);
            JOptionPane.showMessageDialog(null, "Hapus data berhasil");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    @Override
    public void searchTransaksi(JTable data, String kd_transaksi) {
        sql = "SELECT * FROM barang WHERE kd_barang like"
                + " '%" + kd_transaksi + "%'";
        String Header[] = {"Kd Transaksi", "Kd Barang", "qty", "Total Harga", "Jumlah Bayar"};
        dtm = new DefaultTableModel(null, Header);
        try {
            rs = kon.getStm().executeQuery(sql);
            while (rs.next()) {
                Object o[] = new Object[5];
                o[0] = rs.getInt("kd_transaksi");
                o[1] = rs.getString("kd_barang");
                o[2] = rs.getInt("qty");
                o[3] = rs.getDouble("total_harga");
                o[4] = rs.getDouble("jml_bayar");
                dtm.addRow(o);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        data.setModel(dtm);
    }

}
