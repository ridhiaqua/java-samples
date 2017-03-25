/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scanclass;

import java.util.Scanner;

/**
 *
 * @author ridhi
 */
public class ScannerTest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter roll no.");
        int roll = sc.nextInt();
        System.out.println("enter name");
        String name =sc.next();
        System.out.println("enter fee");
        double fee = sc.nextDouble();
        sc.close();
        
    }
}
