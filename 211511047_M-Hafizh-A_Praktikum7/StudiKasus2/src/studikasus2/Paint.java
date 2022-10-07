/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studikasus2;
public class Paint {
    private double coverage;
    public Paint(double c){
        coverage = c;
    }
    public double amount(Shape s){
        // SOAL 3
        System.out.println("Counting amount for "+s.toString());
        return s.area() / coverage;
    }
}
