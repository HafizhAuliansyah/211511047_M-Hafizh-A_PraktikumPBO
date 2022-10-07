/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studikasus3;
public class Salesperson implements Comparable{
    private String firstName, lastName;
    private int totalSales;

    public Salesperson(String first, String last, int sales) {
        this.firstName = first;
        this.lastName = last;
        this.totalSales = sales;
    }

    @Override
    public String toString() {
        return lastName + ", "+firstName+": \t"+totalSales;
    }

    @Override
    public boolean equals(Object other) {
        return (lastName.equals(((Salesperson)other).getLastName()) &&
                firstName.equals(((Salesperson)other).getFirstName()));
    }

    @Override
    public int compareTo(Object other) {
        int result = 0;
        Salesperson person2 = (Salesperson)other;
        if(this.totalSales < person2.getTotalSales()){
            result = -1;
        }else if(this.totalSales > person2.getTotalSales()){
            result = 1;
        }else{
            String name1 = this.lastName + " " +this.firstName;
            String name2 =  person2.getLastName() + " " +person2.getFirstName();
            result = name1.compareTo(name2);
        }
        return result;
    }
    
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getTotalSales() {
        return totalSales;
    }
    
}
