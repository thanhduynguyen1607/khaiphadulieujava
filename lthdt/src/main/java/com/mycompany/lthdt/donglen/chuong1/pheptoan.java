/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lthdt.donglen.chuong1;

/**
 *
 * @author Spring Cuong
 */
public class pheptoan {
    public static void main(String[] args){
//      Cac phep toan voi so nguyen
        int a = 17, b = 4, c;
        
        c = a + b;
        System.out.println("Phep cong " + a + " + " + b + " = " + c);
        c = b - a;
        System.out.println("Phep tru " + b + " - " + a + " = " + c);
        c = a*b;
        System.out.println("Phep nhan " + a + " * " + b + " = " + c);
        c = a/b;
        System.out.println("Phep chia " + a + " / " + b + " = " + c);
        c = a%b;
        System.out.println("Phep chia lay du " + a + " % " + b + " = " + c);
//      Cac phep toan voi so thuc
        double x  = 14.3, y = 3.56, z;
          
        z = x + y;
        System.out.println("Phep cong " + x + " + " + y + " = " + z);
        z = y - x;
        System.out.println("Phep tru " + y + " - " + x + " = " + z);
        z = y * x;
        System.out.println("Phep nhan " + y + " * " + x + " = " + z);
        z = y / x;
        System.out.println("Phep chia " + y + " / " + x + " = " + z);
//      Cac phep toan logic
        boolean flag1 = true, flag2 = false, flag3 = true;
          
        System.out.println("Phep AND " + (flag1 && flag2));
        System.out.println("Phep OR " + (flag1 || flag2));
        System.out.println("Phep NOT " + (!flag1));
        System.out.println("Phep XOR " + (flag1^flag3));
//      Cac phep toan logic
        String s1 = "Hue University";
        String s2 = "university";
  
        System.out.println(s1.toLowerCase());
        System.out.println(s2.toUpperCase());
        System.out.println(s1.toLowerCase().contains(s2));
        s1 += " " + s2;
        System.out.println(s1);
    }
}
