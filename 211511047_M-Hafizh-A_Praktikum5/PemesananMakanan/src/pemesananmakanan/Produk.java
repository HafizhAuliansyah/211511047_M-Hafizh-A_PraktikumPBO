
package pemesananmakanan;
public class Produk {
    private String nama_produk;
    private double harga;
    private int qty;
    public Produk(String nama, int harga, int jumlah){
        this.nama_produk = nama;
        this.harga = harga;
        this.qty = jumlah;
    }
    public boolean isOutOfStock(int jumlah){
        if(jumlah>qty){
            System.out.println("STOK BARANG KURANG !");
            return true;
        }else
            return false;
    }
    public String getNama() {
        return nama_produk;
    }
    public void setNama(String nama_produk) {
        this.nama_produk = nama_produk;
    }
    public double getHarga() {
        return harga;
    }
    public void setHarga(int harga) {
        this.harga = harga;
    }
    public int getQty() {
        return qty;
    }
    public void setQty(int qty) {
        this.qty = qty;
    }
}
