
package kasus1;

public class Barang {
    String kode_barang;
    String nama_barang;
    private int stok;
    
    public Barang(String kode, String nama, int stk){
        kode_barang = kode;
        nama_barang = nama;
        stok = stk;
    }
    public void tambahStok(int tambahan){
        stok += tambahan;
    }
    public void setStok(int stok){
        this.stok = stok;
    }
    public int getStok(){
        return stok;
    }
}
