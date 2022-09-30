package com.ibik.pertemuan2;
import java.util.Scanner;
public class Latihan05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("input bintang => ");
        int bintang = input.nextInt();
        input.close();
        for (int i = 0; i <= bintang - 1; i++) {
            for (int j = 1; j <= bintang - i; j++) {
                System.out.print("*");
            }
            for (int k = 0; k <= 2 * i; k++) {
                System.out.print(" ");
            }
            for (int l = 1; l <= bintang - i; l++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int i = 2; i <= bintang; i++) {
            for (int a = 1; a <= i; a++) {
                System.out.print("*");
            }
            for (int b = i; b <= bintang * 2 - i; b++) {
                System.out.print(" ");
            }
            for (int a = 1; a <= i; a++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("");
    }
}	