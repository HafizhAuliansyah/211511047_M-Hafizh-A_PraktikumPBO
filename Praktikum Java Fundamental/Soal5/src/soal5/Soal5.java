/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal5;
import java.util.Scanner;
/**
 *<h1>Strings</h1>
 * String usage and manipulation
 * 
 * @author  Hafizh
 * @version 1.0
 * @since   2022-08-29
 */
public class Soal5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String A="", B="";
        System.out.print("Masukkan String A : ");
        A = input.nextLine();
        System.out.print("Masukkan String B : ");
        B = input.nextLine();
        System.out.println("");
        System.out.println(A.length() + B.length());
        String lex_order = A.compareTo(B) > 0 ? "Yes" : "No";
        System.out.println(lex_order);
        
        A = A.substring(0, 1).toUpperCase() + A.substring(1);
        B = B.substring(0, 1).toUpperCase() + B.substring(1);
        System.out.println(A + " " + B);
    }
    
}
