package transaksi;

public class model_transaksi {
    private int kd_transaksi;
    private String kd_barang;
    private int qty;
    private Double total_harga;
    private Double jml_bayar;

    public int getKd_transaksi() {
        return kd_transaksi;
    }

    public void setKd_transaksi(int kd_transaksi) {
        this.kd_transaksi = kd_transaksi;
    }

    public String getKd_barang() {
        return kd_barang;
    }

    public void setKd_barang(String kd_barang) {
        this.kd_barang = kd_barang;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public Double getTotal_harga() {
        return total_harga;
    }

    public void setTotal_harga(Double total_harga) {
        this.total_harga = total_harga;
    }

    public Double getJml_bayar() {
        return jml_bayar;
    }

    public void setJml_bayar(Double jml_bayar) {
        this.jml_bayar = jml_bayar;
    }
}
