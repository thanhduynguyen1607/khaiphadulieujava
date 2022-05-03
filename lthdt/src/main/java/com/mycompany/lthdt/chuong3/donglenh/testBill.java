/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.lthdt.chuong3.donglenh;

import com.mycompany.lthdt.chuong3.coffelogic.Bill;
import com.mycompany.lthdt.chuong3.coffelogic.Product;

/**
 *
 * @author Spring Cuong
 */
public class testBill {

    /**
     * @param args the command line arguments
     * @throws java.lang.CloneNotSupportedException
     */
    public static void main(String[] args) throws CloneNotSupportedException {
        // TODO code application logic here
        Bill a = new Bill(12, new Product[]{new Product("Shapoo", 12),
        new Product("Closeup", 21)});
        
        System.out.println("a = " + a);
        
        Bill temp = (Bill) a.clone();
        temp.setBillID(15);
        
        System.out.println("a = " + a);
        System.out.println("temp =  " + temp);
    }
    
}
