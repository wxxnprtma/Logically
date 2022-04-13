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
public class Soal1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2;
        System.out.print("Masukkan Bilangan Pertama: ");
        num1 = input.nextInt();
        System.out.print("Masukkan Bilangan Kedua: ");
        num2 = input.nextInt();
        if (num1 >= num2) {
            System.out.println(num1 + " Lebih besar daripada " + num2);
        } else {
            System.out.println(num2 + " Lebih besar daripada " + num1);
        }
    }
}
