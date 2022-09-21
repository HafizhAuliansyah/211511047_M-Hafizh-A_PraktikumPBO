
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
        do{ 
            int no_menu = 1;
            int pilihan = -1;
            int jumlah = 0, uang = 0; 
            System.out.printf("\n=======================================\n");
            System.out.printf("%21s\n","MENU");
            System.out.printf("=======================================\n");
            for (Produk item : menu){
                System.out.printf("%2d. %-20s [%2d]  Rp. %.0f\n", no_menu++, item.getNama(), item.getQty(), item.getHarga());
            }
            System.out.printf("=======================================\n");
            do{
                System.out.print("Pilih nomor pesanan : ");
                pilihan = input.nextInt();
            }while(pilihan<1 || pilihan>menu.length);
            do{
                System.out.print("Masukkan jumlah beli : ");
                jumlah = input.nextInt();
            }while(jumlah<1 || menu[pilihan-1].isOutOfStock(jumlah));
            Penjualan jual = new Penjualan(menu[pilihan-1], jumlah);
            do{
                System.out.print("Masukkan jumlah uang : ");
                uang = input.nextInt();
                if(uang<jual.getHarga_total())
                    System.out.println("UANG ANDA KURANG !!!");
            }while(uang<1||uang<jual.getHarga_total());
            System.out.printf("=======================================\n");
            jual.toPrint();
            double kembalian = uang - jual.getHarga_total();
            System.out.printf("%-26s Rp. %.0f\n","Kembalian : ", kembalian);
            System.out.printf("=======================================\n");
            System.out.print("Pesan lagi ? [Y/N] : ");
            lagi = input.next().charAt(0);
        }while(lagi=='y'||lagi=='Y');
    }
    
}
