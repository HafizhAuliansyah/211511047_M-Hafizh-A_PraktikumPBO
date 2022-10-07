/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise3;
public class EmployeeTest {
    public static void main (String[] args){ 
        Manager[] staff = new Manager[3];
        staff[0] = new Manager("Antonio Rossi", 2000000, 1, 10, 1989);
        staff[1] = new Manager("Maria Bianchi", 5000000, 1, 12, 1991);
        staff[2] = new Manager("Isabel Vidal", 3000000, 1, 11, 1993);
        System.out.println("Before sort :");
        for(Employee e : staff){
            e.print();
        }
        System.out.println("After sort :" );
        Sortable.shell_sort(staff);
        for(Employee e : staff){
            e.print();
        }

    }
}
