/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kasus2;
public class Item {
    private String name;
    private Item() {
        name = "Ipin";
    }
    public Item(String name) {
        this();
        System.out.println(this.name);
    }
}
