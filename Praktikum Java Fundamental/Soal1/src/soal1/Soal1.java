
package soal1;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *<h1>Data Types</h1>
 * Data Types program checking if input
 * is instance of Primitive Number Data Types in java
 * 
 * @author  Hafizh
 * @version 1.0
 * @since   2022-08-29
 */
public class Soal1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char keluar = ' ';
        while(keluar != 'y' && keluar != 'Y'){
            String input_angka = "";
            try{
                System.out.print("Input Angka : ");
                input_angka = input.nextLine();
                long long_input = Long.parseLong(input_angka);
                System.out.println(long_input + " can be fitted in");
                if(long_input >= Byte.MIN_VALUE && long_input <= Byte.MAX_VALUE){
                    System.out.println("* Byte");
                }
                if(long_input >= Short.MIN_VALUE && long_input <= Short.MAX_VALUE){
                    System.out.println("* Short");
                }
                if(long_input >= Integer.MIN_VALUE && long_input <= Integer.MAX_VALUE){
                    System.out.println("* int");
                }
                System.out.println("* long");

            }catch(NumberFormatException e){
                System.out.println(input_angka + " can't be fitted anywhere");
            }
            System.out.print("Keluar [Y/N]: ");
            keluar = input.nextLine().charAt(0);
        }

    }
    
}
