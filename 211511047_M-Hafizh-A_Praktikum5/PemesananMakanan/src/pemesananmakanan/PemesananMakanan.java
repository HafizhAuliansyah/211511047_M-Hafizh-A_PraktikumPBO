
package pemesananmakanan;
import java.util.Scanner;
public class PemesananMakanan {
    private static Produk[] GenerateMenu(){
        Produk[] menu = new Produk[15];
        menu[0] = new Produk("Bala-Bala", 1250, 20);
        menu[1] = new Produk("Gehu", 1250, 20);
        menu[2] = new Produk("Cireng", 1250, 20);
        menu[3] = new Produk("Mendoan", 1250, 20);
        menu[4] = new Produk("Lontong", 1250, 20);
        menu[5] = new Produk("Usus Crispy", 3000, 10);
        menu[6] = new Produk("Nasi Goreng", 10000, 10);
        menu[7] = new Produk("Karedok Basreng", 6000, 10);
        menu[8] = new Produk("Nasi Kuning", 6000, 10);
        menu[9] = new Produk("Nasi Uduk", 6000, 10);
        menu[10] = new Produk("Es Mangga", 2000, 15);
        menu[11] = new Produk("Es Sirsak", 2000, 15);
        menu[12] = new Produk("Kopi ABC", 3000, 15);
        menu[13] = new Produk("Chocolatos", 3000, 15);
        menu[14] = new Produk("Mineral Botol", 2000, 30);
        return menu;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char lagi = 'n';
        Produk[] menu = GenerateMenu();
        Penjualan[] jual = new Penjualan[3];
        int no_menu = 1;
        int pilihan = -1;
        int inc_pesanan = 0;
        int jumlah = 0, uang = 0; 
        System.out.printf("\n=======================================\n");
        System.out.printf("%21s\n","MENU");
        System.out.printf("=======================================\n");
        for (Produk item : menu){
           System.out.printf("%2d. %-20s [%2d]  Rp. %.0f\n", no_menu++, item.getNama(), item.getQty(), item.getHarga());
        }
           System.out.printf("=======================================\n");
        do{ 
            do{
                System.out.print("Pilih nomor pesanan : ");
                pilihan = input.nextInt();
            }while(pilihan<1 || pilihan>menu.length);
            do{
                System.out.print("Masukkan jumlah beli : ");
                jumlah = input.nextInt();
            }while(jumlah<1 || menu[pilihan-1].isOutOfStock(jumlah));
            jual[inc_pesanan] = new Penjualan(menu[pilihan-1], jumlah);
            System.out.print("Pesan lagi ? [Y/N] : ");
            lagi = input.next().charAt(0);
            inc_pesanan++;
        }while((lagi=='y'||lagi=='Y') && inc_pesanan<jual.length);
        double all_total = Penjualan.oountAllTotal(jual);
        System.out.printf("=======================================\n");
        System.out.println("DETAIL PEMBELIAN : ");
        for(int i=0; i<inc_pesanan; i++){
            jual[i].toPrint();
        }
        System.out.printf("%-26s Rp. %.0f\n","TOTAL : ", all_total);
        do{
            System.out.print("Masukkan jumlah uang : ");
            uang = input.nextInt();
            if(uang<Penjualan.oountAllTotal(jual))
               System.out.println("UANG ANDA KURANG !!!");
        }while(uang<1||uang<all_total);
        double kembalian = uang - all_total;
        System.out.printf("%-26s Rp. %.0f\n","KEMBALIAN : ", kembalian);
        System.out.printf("=======================================\n");
    }
    
}
