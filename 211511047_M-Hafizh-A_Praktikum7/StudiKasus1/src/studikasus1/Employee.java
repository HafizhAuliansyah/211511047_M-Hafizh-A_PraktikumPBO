/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studikasus1;
public class Employee extends StaffMember{
    protected String socialSecurityNumber;
    protected double payRate;

    public Employee(String eName, String eAddress, String ePhone, String soSecNumber, double rate) {
        super(eName, eAddress, ePhone);
        this.socialSecurityNumber = soSecNumber;
        this.payRate = rate;
    }

    @Override
    public String toString() {
        String result = super.toString();
        result += "\nSocial Security Number: "+socialSecurityNumber;
        return result;
    }
    @Override
    public double pay(){
        return payRate;
    }
}
