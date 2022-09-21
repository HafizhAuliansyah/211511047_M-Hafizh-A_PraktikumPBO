
package soal4;
import java.util.Scanner;
/** 
 * <h1>Gaji Agent</h1>
 * Perhitungan gaji agent sesuai jumlah barang yang terjual
 * Ketentuan : 
 * Gaji Pokok : 500000
 * Ketika berhasil menjual minimal 40, mendapat bonus 25% total penjualan
 * Ketika berhasil menjual diatas 80, mendapat bonus 35% total penjualan
 * Ketika menjual dibawah 15, mendapat pemotongan 15% total penjualan
 * Selain itu mendapat 10% setiap itemnya
 * @author  Hafizh
 * @version 1.0
 * @since   2022-09-05
 */
public class Soal4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int gaji_p = 500000;
        int harga_i = 50000;
        int gaji = 0;
        int jual = input.nextInt();
        if(jual >= 40)
            gaji = gaji_p + (jual * harga_i * 25/100);
        else if(jual > 80)
            gaji = gaji_p + (jual * harga_i * 35/100);
        else if(jual < 15)
            gaji = gaji_p - (((harga_i * 15)-(harga_i * jual))*15/100);
        else
            gaji = gaji_p + (jual * harga_i * 10/100);
        
        System.out.println(gaji);
    }
}
