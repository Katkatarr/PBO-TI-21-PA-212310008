package com.ibik.pertemuan2;

import java.util.Scanner;

public class Resto {
	private
		long harga;
		int pil;
		
		private long getPrices(){
			if (pil == 1) {
				harga = 22000;
			}else if (pil == 2) {
				harga = 15000;
			}else if (pil==3) {
				harga = 25000;
			}else {
				System.out.println("Maaf menu yang anda masukan salah.");
			}
			return harga;
		}	
	
		public void chooseMenu() {
			System.out.println("Menu Sarapan:");
			System.out.println("1. Nasi Goreng");
			System.out.println("2. Bubur Ayam");
			System.out.println("3. Soto Ayam");
			System.out.print("Masukkan Pilihan = ");
			
			Scanner input = new Scanner(System.in);
			pil = input.nextInt();
			
			if (harga==0) {
				System.out.println("Harga adalah = " + getPrices());
			}
		}
}