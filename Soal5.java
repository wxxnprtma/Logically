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
public class Soal5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int[] num = new int[4];
        int max=num[0];
        int min=num[0];
        
        for (int i = 0; i < num.length; i++) {
            System.out.print("Masukkan Angka : ");
            num[i] = scan.nextInt();
        }
        for (int i = 0; i < num.length; i++) {
            if (num[i]>max){
                max = num[i];
            }
        }
        System.out.println("Nilai maksimum dari bilangan tersebut = "+max);
    }
    
}
