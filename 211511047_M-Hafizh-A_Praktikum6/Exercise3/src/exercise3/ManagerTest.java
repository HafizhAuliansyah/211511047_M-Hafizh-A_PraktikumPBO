/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise3;

public class ManagerTest{ 
    public static void main (String[] args){ 
        Manager[] managers = new Manager[3];
        managers[0] = new Manager("Antonio Rossi", 2000000, 1, 10, 1989);
        managers[1] = new Manager("Maria Bianchi", 5000000, 1, 12, 1991);
        managers[2] = new Manager("Isabel Vidal", 3000000, 1, 11, 1993);
        int i;
        for (i = 0; i < 3; i++) managers[i].raiseSalary(5);
        for (i = 0; i < 3; i++) managers[i].print();
        Sortable.shell_sort(managers);
        for (i = 0; i < 3; i++) managers[i].print();
    }
}

