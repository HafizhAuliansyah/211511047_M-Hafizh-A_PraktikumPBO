/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studikasus3;
import java.util.Scanner;
// SOAL 3
public class Strings {
    public static void main(String[] args) {
        String[] strList;
        int size;
        Scanner scan = new Scanner(System.in);
        System.out.print("\nHow many strings do you want to sort ? ");
        size = scan.nextInt();
        scan.nextLine();
        strList = new String[size];
        System.out.println("\nEnter the string....");
        for(int i=0; i<size; i++){
            strList[i] = scan.nextLine();
        }
        // SOAL 4
        Sorting.insertionSort(strList);
        System.out.println("\nYour numbers in sorted order...");
        for(int i=0;i<size; i++){
            System.out.println(strList[i] + " ");
        }
        System.out.println("");
    }
}
