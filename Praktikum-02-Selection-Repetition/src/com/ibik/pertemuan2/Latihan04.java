package com.ibik.pertemuan2;
import java.util.Scanner;
public class Latihan04 {

	    public static void main(String[] args) {
	        Scanner a = new Scanner(System. in );
	        System.out.println("Masukkan angka");
	        int nilai = a.nextInt();
	        System.out.println("Faktor-faktornya:");
	        a.close();
	        int tambah = 0;
	        for (int z = 0; z <= nilai; z++) {
	            tambah++;
	            if (nilai % tambah == 0) {
	                System.out.print(tambah /* tampilkan bilangan ketika nilainya
	                                         * merupakan modulus dari nilai yang dicari
	                                         */
	                                        + " ");
	            }
	        }
	    }
}


