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
public class Soal3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, jumlah = 0,i = 0;
        System.out.print("Masukkan Bilangan N :");
        n = input.nextInt();
        while (i <= n) {
            jumlah = jumlah + i;
            i++;
        }
        System.out.println("Hasil penjumlahan 1-N : "+jumlah);
    }
}
