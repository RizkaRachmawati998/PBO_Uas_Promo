package tblBarang;


import javax.swing.JTable;

public interface InterfaceBarang {
     public void createUpdateBarang(String kd_barang, String nm_barang, String jenis, String detail, Double harga, int tag);

    public void readBarang(JTable data);

    public void deleteBarang(String kd_barang);

    public void searchBarang(JTable data, String kd_barang);

    
}
