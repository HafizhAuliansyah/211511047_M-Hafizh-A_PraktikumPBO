/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studikasus2;
abstract public class Shape {
    protected String shapeName;
    abstract double area();
    public Shape(String name) {
        this.shapeName = name;
    }
    @Override
    public String toString() {
        return this.shapeName;
    }
}
