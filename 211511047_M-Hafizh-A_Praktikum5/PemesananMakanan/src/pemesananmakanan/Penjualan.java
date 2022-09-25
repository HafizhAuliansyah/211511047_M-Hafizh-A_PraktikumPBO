
package pemesananmakanan;
public class Penjualan {
    private String nama_produk;
    private int quantity;
    private double harga_total;
    public Penjualan(Produk item_beli, int quantity){
        this.nama_produk = item_beli.getNama();
        this.quantity = quantity;
        item_beli.setQty(item_beli.getQty()-quantity);
        this.harga_total = item_beli.getHarga() * quantity;
    }
    public void toPrint(){
        System.out.printf("%-20s [%02d]  Rp. %.0f\n", nama_produk, quantity, harga_total);
    }
    public static double oountAllTotal(Penjualan[] items){
        double total = 0;
        for(Penjualan item: items){
            if (item != null)
                total += item.getHarga_total();
        }
        return total;
    }
    public String getNama_produk() {
        return nama_produk;
    }
    public void setNama_produk(String nama_produk) {
        this.nama_produk = nama_produk;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public double getHarga_total() {
        return harga_total;
    }
    public void setHarga_total(double harga_total) {
        this.harga_total = harga_total;
    }
}
