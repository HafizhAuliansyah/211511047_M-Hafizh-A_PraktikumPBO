
package restaurantmain;
import java.util.Scanner;
public class RestaurantMain {
    public static void main(String[] args) {
        Restaurant menu = new Restaurant();
        String nama_pesan;
        int jumlah;
        double uang;
        Scanner input = new Scanner(System.in);
        
        menu.tambahMenuMakanan("Bala-Bala", 1_000, 20);
        menu.tambahMenuMakanan("Gehu", 1_000, 20);
        menu.tambahMenuMakanan("Tahu", 1_000, 0);
        menu.tambahMenuMakanan("Molen", 1_000, 20);
        char lagi = 'n';
        do{
            menu.tampilMenuMakanan();
            System.out.println("==================");
            System.out.print("Nama Makanan : ");
            nama_pesan = input.nextLine();
            System.out.print("Jumlah : ");
            jumlah = input.nextInt();
            System.out.print("Uang : ");
            uang = input.nextDouble();
            System.out.println("==================");
            menu.pesanMakanan(nama_pesan, uang, jumlah);
            System.out.println("");
            System.out.print("Lagi ? [Y/N} : ");
            lagi = input.next().charAt(0);
            input.nextLine();
        }while(lagi=='y'||lagi=='Y');
    }
}
