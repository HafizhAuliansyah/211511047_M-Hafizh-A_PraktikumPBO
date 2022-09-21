
package restaurantmain;
public class Makanan {
    private String nama_makanan;
    private double harga_makanan;
    private int stok;
    public Makanan(){
        nama_makanan = "-";
        harga_makanan = 0;
        stok = 0;
    }
    public void setNama(String nama){
        this.nama_makanan = nama;
    }
    public String getNama(){
        return this.nama_makanan;
    }
    public void setHarga(double harga){
        this.harga_makanan = harga;
    }
    public double getHarga(){
       return this.harga_makanan;
    }
    public void setStok(int stok){
        this.stok = stok;
    }
    public int getStok(){
        return this.stok;
    }
}
