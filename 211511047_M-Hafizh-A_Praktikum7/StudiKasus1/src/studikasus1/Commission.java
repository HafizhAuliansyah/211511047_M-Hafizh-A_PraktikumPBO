/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studikasus1;
public class Commission extends Hourly{
    double total_sales;
    double commission_rate;
    public Commission(String eName, String eAddress, String ePhone, 
            String soSecNumber, double rate, double commission_rate) {
        super(eName, eAddress, ePhone, soSecNumber, rate);
        this.commission_rate = commission_rate;
        this.total_sales = 0;
    }
    public void addSales(double totalSales){
        this.total_sales = totalSales;
    }
    @Override
    public double pay() {
        double payment =  super.pay() + (total_sales*commission_rate);
        total_sales = 0;
        return payment;
    }
    @Override
    public String toString() {
        String result = super.toString();
        result += "\nTotal sales:"+total_sales;
        return result;
    }  
}
