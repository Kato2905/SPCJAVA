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
public class KTCAU2 {
    public static void main(String[] args) {
        System.out.println("CHUONG TRINH TINH DIEN TICH TAM GIAC");
        double s, a, b, c, dt, cv;
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so a: ");
        a = sc.nextInt();
        System.out.print("Nhap so b: ");
        b = sc.nextInt();
        System.out.print("Nhap so c: ");
        c = sc.nextInt();

        s = a + b + c / 2;
        System.out.println("Nua chu vi tam giac la: " + s);
        
       // tinh dien tich
       dt=Math.sqrt(s*(s-a)*(s-b)*(s-c));
       cv = s*2;
        System.out.println("Chu vi: "+cv);
        System.out.println("Dien tich: "+dt);
       
    }
}
