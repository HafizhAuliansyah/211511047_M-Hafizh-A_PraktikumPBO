/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studikasus1;

/**
 *
 * @author Hafizh
 */
public class Hourly extends Employee{
    private int hoursWorked;

    public Hourly(String eName, String eAddress, String ePhone, String soSecNumber, double rate) {
        super(eName, eAddress, ePhone, soSecNumber, rate);
        this.hoursWorked = 0;
    }
    public void addHours(int moreHours){
        hoursWorked += moreHours;
    }
    @Override
    public double pay(){
        double payment = payRate * hoursWorked;
        hoursWorked = 0;
        return payment;
    }

    @Override
    public String toString() {
        String result = super.toString();
        result += "\nCurrent hours: "+hoursWorked;
        return result;
    }
    
}
