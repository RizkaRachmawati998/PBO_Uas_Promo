package promo;

import javax.swing.JTable;

public interface InterfacePromo {

    public void createUpdatePromoBarang(String kd_promo, String kd_barang, String nm_barang, String jenis, Double promo, int tag);

    public void readPromoBarang(JTable data);

    public void deletePromoBarang(String kd_promo);

    public void searchPromoBarang(JTable data, String kd_promo);

}
