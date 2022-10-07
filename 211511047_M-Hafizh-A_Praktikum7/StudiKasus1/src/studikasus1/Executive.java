/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studikasus1;
public class Executive extends Employee{
    private double bonus;

    public Executive(String eName, String eAddress, String ePhone, String soSecNumber, double rate) {
        super(eName, eAddress, ePhone, soSecNumber, rate);
        this.bonus = 0;
    }
    public void awardBonus(double execBonus){
        bonus = execBonus;
    }
    @Override
    public double pay(){
        double payment = super.pay() + bonus;
        bonus = 0;
        return payment;
    }
}
