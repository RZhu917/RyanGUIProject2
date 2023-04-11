/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.zhugui2;

import java.util.Scanner;

/**
 *
 * @author Ryan Zhu
 */
public class InputMaster {
    public static int getInt() {
    Scanner sc = new Scanner(System.in);
    while (!sc.hasNextInt()) {
        System.out.println("Int: ");
        sc.next();
    }
    return sc.nextInt();
    }
    
    public static boolean checkDouble(String d){
        try
            {
              Double.parseDouble(d);
            }
            catch(NumberFormatException e)
            {
              return false;
            }
        return true;
    }
}