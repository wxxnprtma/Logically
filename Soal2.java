/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logically;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Soal2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int num;
        System.out.println("Masukkan Bilangan: ");
        num = input.nextInt();
         if (num % 2 == 0) {
            System.out.println("\n " + num + " adalah bilangan genap");
        } else {
            System.out.println("\n" + num + " adalah bilangan ganjil");
        }
    }
    
}
