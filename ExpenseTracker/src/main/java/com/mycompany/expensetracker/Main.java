/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.expensetracker;

import java.util.Scanner;
/**
 *
 * @author Bassam
 */
public class Main {
    
    static public void main(String[] args){

        Scanner sc =new Scanner (System.in);

        System.out.println("Enter your name");

        while (true){
            String s = sc.next();
            if(s.equals("End"))
                break;
            System.out.println("welcome "+s);
        }

    }
}
