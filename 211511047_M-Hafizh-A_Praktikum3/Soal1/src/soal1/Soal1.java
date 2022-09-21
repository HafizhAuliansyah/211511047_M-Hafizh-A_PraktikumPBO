
package soal1;
import java.util.Scanner;
/** 
 * <h1>Input & Output</h1>
 * Given a string, s, matching the regular expression [A-Za-z !,?._'@]+, split the string into 
 * tokens. We define a token to be one or more consecutive English alphabetic letters. Then, print 
 * the number of tokens, followed by each token on a new line
 * @author  Hafizh
 * @version 1.0
 * @since   2022-09-05
 */
public class Soal1 {
    public static void main(String[] args) {
        String s = "";
        do{
            Scanner input = new Scanner(System.in);
            System.out.print("Masukkan String : ");
            s = input.nextLine();
            if(s.length() < 1)
                System.out.println("Tolong Masukkan Teks !!!");
        }while(s.length() < 1);
        
        String[] words = s.split(" |\\!|\\,|\\?|\\.|\\_|\\'|\\@");
        
        int n = words.length;
        
        System.out.println(n);
        for(String w : words){
            System.out.println(w);
        }
    }
}
