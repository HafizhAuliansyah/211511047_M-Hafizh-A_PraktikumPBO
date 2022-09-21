
package soal5;
/** 
 * <h1>Buka Tutup Jalanr</h1>
 * Dimasukkan 4 plat mobil yang lewat
 * Jika gabungan angka dikurangi 999999 dibai 5 sisa 0, maka mobil harus berhanti
 * dan begitu pula sebaliknya
 * @author  Hafizh
 * @version 1.0
 * @since   2022-09-05
 */
import java.text.ParseException;
import java.util.Scanner;
public class Soal5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String plat_mobil = input.nextLine();
        plat_mobil = plat_mobil.replaceAll(" ", "");
        try{
            long platGabungan = Long.parseLong(plat_mobil);
            if((platGabungan-999999) % 5 == 0)
                System.out.println("Jalan");
            else
                System.out.println("Berhenti");
        }catch(NumberFormatException e){
            System.out.println("Error parsing");
        }
    }
}
