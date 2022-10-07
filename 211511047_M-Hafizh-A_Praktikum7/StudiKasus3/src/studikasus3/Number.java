/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editoSr.
 */
package studikasus3;
import java.util.Scanner;
public class Number {
    public static void main(String[] args) {
        // SOAL 1
        Integer[] intList;
        int size;
        Scanner scan = new Scanner(System.in);
        System.out.print("\nHow many integers do you want to sort ? ");
        size = scan.nextInt();
        intList = new Integer[size];
        System.out.println("\nEnter the numbers....");
        for(int i=0; i<size; i++){
            intList[i] = scan.nextInt();
        }
        // SOAL 4
        Sorting.insertionSort(intList);
        System.out.println("\nYour numbers in sorted order...");
        for(int i=0;i<size; i++){
            System.out.println(intList[i] + " ");
        }
        System.out.println("");
    }
}
