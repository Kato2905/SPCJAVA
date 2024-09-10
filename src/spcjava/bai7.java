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
public class bai7 {
    public static void main(String[] args) {
        System.out.println("CHUONG TRINH TINH HINH TRON");
        Scanner sc=new Scanner(System.in);
        double cv, dt, dk, bk;
        System.out.println("Nhap chu vi");
        cv = sc.nextDouble();
        System.out.println("Nhap dien tich");
        dt = sc.nextDouble();
        System.out.println("Nhap duong kinh");
        dk = sc.nextDouble();
        System.out.println("Nhap ban kinh");
        bk = sc.nextDouble();
        
        //tinh
        System.out.println("Chu vi la: "+cv); 
        cv = dk * 3.14;
       System.out.println("Dien tich la: "+dt);
        dt = bk * bk * 3.14;
        System.out.println("Duong kinh la: "+dk);
        dk = cv / 3.14;
        System.out.println("Ban kinh la: "+ bk);
        bk = cv / 3.14 / 2;
        
        
        
        
        
                
    }
}
