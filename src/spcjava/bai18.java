/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spcjava;

import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class bai18 {
    public static void main(String[] args) {
        System.out.println("Chuong trinh ArrayList");
        ArrayList ds = new ArrayList();
        
        ArrayList b = new ArrayList();
        for (int i = 1; i < 10; i++) {
            ds.add(i);}
           ds.add("An");
           ds.remove(6);
          ds.removeLast();
          ds.removeFirst();
                for (int i = 0; i<ds.size();i++){
                    System.out.println(ds.get(i)+" ");
                }
                        
            }
            }
    


