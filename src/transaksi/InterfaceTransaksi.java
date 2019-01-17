package transaksi;

import javax.swing.JTable;

public interface InterfaceTransaksi {

    public void createTransaksi(int kd_transaksi, String kd_barang, int qty, Double total_harga, Double jml_bayar, int tag);

    public void readTransaksi(JTable data);

    public void deleteTransaksi(String kd_transaksi);

    public void searchTransaksi(JTable data, String kd_transaksi);

}
