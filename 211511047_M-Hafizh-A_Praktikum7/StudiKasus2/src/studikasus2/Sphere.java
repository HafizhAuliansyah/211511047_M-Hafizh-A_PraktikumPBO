/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studikasus2;
public class Sphere extends Shape{
    private double radius;
    public Sphere(double r) {
        super("Sphere");
        this.radius = r;
    }
    @Override
    public double area() {
        return 4*Math.PI*radius*radius;
    }

    @Override
    public String toString() {
        return super.toString() + " of radius "+radius;
    }
    
}
