/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal6;
import java.util.Scanner;
import java.math.*;
/** 
 * <h1>Big Number</h1>
 * Operasi tipe BigInteger
 * @author  Hafizh
 * @version 1.0
 * @since   2022-09-05
 */
public class Soal6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BigInteger a = new BigInteger(input.nextLine());
        BigInteger b = new BigInteger(input.nextLine());
        BigInteger tambah = a.add(b);
        BigInteger kali = a.multiply(b);
        
        System.out.println(tambah);
        System.out.println(kali);
    }   
}
