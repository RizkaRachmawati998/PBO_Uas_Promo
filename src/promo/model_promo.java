package promo;

public class model_promo {

    private String kd_promo;
    private String kd_barang;
    private String nm_barang;
    private String jenis;
    private double promo;
    private String priode;

    public double getPromo() {
        return promo;
    }

    public String getPriode() {
        return priode;
    }

    public void setPriode(String priode) {
        this.priode = priode;
    }

    public void setPromo(double promo) {
        this.promo = promo;
    }
    private String detail;
 

     public String getKd_promo() {
        return kd_promo;
    }

    public void setKd_promo(String kd_promo) {
        this.kd_promo = kd_promo;
    }

    public String getKd_barang() {
        return kd_barang;
    }

    public void setKd_barang(String kd_barang) {
        this.kd_barang = kd_barang;
    }

    public String getNm_barang() {
        return nm_barang;
    }

    public void setNm_barang(String nm_barang) {
        this.nm_barang = nm_barang;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    
}
