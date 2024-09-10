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
public class BAI4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap so a: ");
        int a=sc.nextInt();
        System.out.println("Nhap so b: ");
        int b=sc.nextInt();
        int tong=a+b;
        System.out.println(a + "+"+ b +"=" +tong);
        int hieu=a-b;
         System.out.println(a + "-"+ b +"=" +hieu);
        int tich=a*b;
          System.out.println(a + "*"+ b +"=" +tich);
        double thuong= (double)a/b;
          System.out.println(a + "/"+ b +"=" +thuong);
        
    }
   private static int tong(int a, int b){
       return a+b;}
   private static int hieu(int a, int b){
       return a-b;}
   private static int tich(int a, int b){
       return a*b;}
   private static String thuong(int a, int b){
       if (b==a){
           return "Khong the chia cho 0";
       }else{
           return Double.toString((double )a/b);
       }
       
       
       

       
       
   }
}
