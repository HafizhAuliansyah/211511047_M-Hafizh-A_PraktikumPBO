
package soal2;
import java.util.Scanner;
/** 
 * <h1>Input & Output(2)</h1>
 * Print formatted output
 * @author  Hafizh
 * @version 1.0
 * @since   2022-09-05
 */
public class Soal2 {
    public static void main(String[] args) {
       String s = "";
       int angka = 0;
       Scanner input = new Scanner(System.in);
       for(int i=0 ; i < 3; i++){
            do{
                s = input.next();
                angka = input.nextInt();
                if(s.length() > 10)
                    System.out.println("String lebih dari 10 karakter");
                else if(angka < 0 || angka > 999)
                    System.out.println("Angka melebihi batas");

            }while(s.length() > 10 || angka < 0 || angka > 999); 
            System.out.printf("%-15s",s);
            System.out.printf("%03d\n",angka);
       }

    } 
}
