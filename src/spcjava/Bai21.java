/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spcjava;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Bai21 {
    public static void main(String[] args) {
         System.out.println("BAI TAP STRING");
       Scanner sc= new Scanner(System.in);
        System.out.print("Nhap ho va ten: ");
        //Tra Hoang An
        String hovaten = sc.nextLine();
        System.out.println("Ho: "+ hovaten.substring(0,3));
        System.out.println("Ten lot: : "+ hovaten.substring(4,9));
         System.out.println("Ten: "+ hovaten.substring(10));  
    }
}
                                
    
    