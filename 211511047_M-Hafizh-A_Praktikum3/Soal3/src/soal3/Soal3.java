
package soal3;
import java.util.Scanner;
/** 
 * <h1>Berhitung</h1>
 * Input operasi matematika berupa string dan dilakukan operasi
 * sesuai dengan string yang dimasukkan
 * simbol + sebagai penjumlahan
 * simbol - sebagai pengurangan
 * simbol * sebagai pengkalian
 * simbol / sebagai pembagian
 * Angka dan simbol dipisahkan melalui spasi
 * @author  Hafizh
 * @version 1.0
 * @since   2022-09-05
 */
public class Soal3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = "";
        int A, B;
        String[] operasi;
        char operator;
        do{
            s = input.nextLine();
            operasi = s.split(" ");
            A = Integer.parseInt(operasi[0]);
            B = Integer.parseInt(operasi[2]);
            operator = operasi[1].charAt(0);
            if(operasi.length > 3)
                System.out.println("Inputan tidak sesuai format operasi (A operator B)");
            if(A < 1)
                System.out.println("A tidak boleh kurang dari 1");
            if(B > 1000)
                System.out.println("B tidak boleh lebih dari 1000");
            if(operator != '+' && operator != '-' && operator != '*' && operator != '/')
                System.out.println("Operasi diluar +, -, *, / +++++");
        }while(operasi.length > 3 || A < 1 || B > 1000 
                || (operator != '+' && operator != '-' && operator != '*' && operator != '/'));
        
        int hasil = 0;
        boolean err = false;
        switch(operator){
            case '+':
                hasil = A + B;
                break;
            case '-':
                hasil = A - B;
                break;
            case '*':
                hasil = A * B;
                break;
            case '/':
                hasil = A % B;
                if(hasil != 0){
                    System.out.println("A tidak habis dibagi B");
                    err = true;
                }else
                    hasil = A / B;
                break;
            default:
                System.out.println("Operasi diluar +, -, *, /");
                break;   
        }
        if(!err)
            System.out.println(hasil);
    }
}
