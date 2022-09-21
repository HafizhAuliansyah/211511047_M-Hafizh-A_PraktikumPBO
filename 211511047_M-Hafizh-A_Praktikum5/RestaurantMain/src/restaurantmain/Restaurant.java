
package restaurantmain;
public class Restaurant {
    private Makanan[] makanan;
    private byte id;
    public Restaurant(){
        makanan = new Makanan[10];
        for(int i=0; i<10; i++)
            makanan[i] = new Makanan();
        id=0;
    }
    public void tambahMenuMakanan(String nama, double harga, int stok){
        this.makanan[id].setNama(nama);
        this.makanan[id].setHarga(harga);
        this.makanan[id].setStok(stok);
        nextId();
    }
    private int searchMakananByName(String nama){
        int id_pesan = -1;
        for(int i = 0; i < id; i++){
            id_pesan = nama.equals(makanan[i].getNama()) ?  i : id_pesan;
        }
        return id_pesan;
    }
    public void pesanMakanan(String nama_makanan, double uang, int jumlah_pesan){
        int id_pesan = searchMakananByName(nama_makanan);
        
        if(id_pesan == -1){
            System.out.println("Makanan tidak ada !");
            return;
        }
        double total_harga = makanan[id_pesan].getHarga()*jumlah_pesan;
        if(makanan[id_pesan].getStok() < jumlah_pesan){
            System.out.println("Stok "+makanan[id_pesan].getNama()+" kurang !");
            return;
        }
        if(total_harga > uang){
            System.out.println("Uang anda tidak cukup !");
            return;
        }
        makanan[id_pesan].setStok( makanan[id_pesan].getStok() - jumlah_pesan);
        double kembalian = uang - total_harga;
        System.out.println("PESANAN BERHASIL !");
        System.out.println(jumlah_pesan+" "+makanan[id_pesan].getNama()+ " : Rp. "+total_harga);
    }
    private void tampilMakanan(int id){
        System.out.println(makanan[id].getNama()+"["+makanan[id].getStok()+"]"+"\tRp. "+makanan[id].getHarga());
    }
    public void tampilMenuMakanan(){
        for(int i=0; i<=id; i++){
            if(!isOutOfStock(i)){
                tampilMakanan(i);
            }
        }
    }
    private boolean isOutOfStock(int id){
        if(makanan[id].getStok() == 0){
            return true;
        }else{
            return false;
        }
    }
    private void nextId(){
        id++;
    }
}
