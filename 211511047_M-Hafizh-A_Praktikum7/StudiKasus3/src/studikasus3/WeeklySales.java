/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studikasus3;
import java.util.Scanner;
public class WeeklySales {
    public static void main(String[] args){
        // SOAL 7
        Scanner scan = new Scanner(System.in);
        Salesperson[] salesStaff;
        System.out.print("Pakai template data ? [Y/N] : ");
        char use_data = scan.next().charAt(0);
        if(use_data == 'Y' || use_data == 'y'){
            salesStaff = new Salesperson[10];
            salesStaff[0] = new Salesperson("Jane", "Jones", 3000);
            salesStaff[1] = new Salesperson("Daffy", "Duck", 4935);
            salesStaff[2] = new Salesperson("James", "Jones", 3000);
            salesStaff[3] = new Salesperson("Dick", "Walter", 2800);
            salesStaff[4] = new Salesperson("Don", "Trump", 1570);
            salesStaff[5] = new Salesperson("Jane", "Black", 3000);
            salesStaff[6] = new Salesperson("Harry", "Taylor", 7300);
            salesStaff[7] = new Salesperson("Andy", "Adams", 5000);
            salesStaff[8] = new Salesperson("Jim", "Doe", 2850);
            salesStaff[9] = new Salesperson("Wait", "Smith", 3000);
        }else{
            System.out.print("Jumlah orang : ");
            int person_count = scan.nextInt();
            salesStaff = new Salesperson[person_count];
            for(int i=0; i<person_count; i++){
                System.out.println("======= DATA "+(i+1)+"=======");
                System.out.print("Enter first name : ");
                String fn = scan.next();
                System.out.print("Enter last name : ");
                String ln = scan.next();
                System.out.print("Enter total sales : ");
                int tl = scan.nextInt();
                salesStaff[i] = new Salesperson(fn, ln, tl);
                
            }
            System.out.println("==============");
        }
        Sorting.insertionSort(salesStaff);
        System.out.println("\nRanking of Sales for the Week\n");
        for(Salesperson s: salesStaff)
            System.out.println(s);
    }
}
