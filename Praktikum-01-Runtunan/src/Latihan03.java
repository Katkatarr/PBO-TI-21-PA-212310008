import java.util.Scanner;

public class Latihan03 {
	
	public static void main(String[] args) {
		double diagonal1, diagonal2, alas, tinggi, panjang, lebar;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Masukan diagonal1 : ");
		double diagonal_1 = input.nextDouble();
		System.out.print("Masukan diagonal2 : ");
		double diagonal_2 = input.nextDouble();
		System.out.print("Masukan alas : ");
		double a = input.nextDouble();
		System.out.print("Masukan tinggi : ");
		double t = input.nextDouble();
		System.out.print("Masukan panjang : ");
		double p = input.nextDouble();
		System.out.print("Masukan lebar : ");
		double l = input.nextDouble();
		
		double KelilingLayangLayang = 2*(diagonal_1 + diagonal_2);
		double LuasLayangLayang = 0.5 * diagonal_1 * diagonal_2;
		double KelilingPrisma = 2 * (a + t + l) + (3*p);
		double LuasPrisma = 2 * (0.5 * a * t) + (a + t + l);

		System.out.print("Luas Layang - Layang = " + LuasLayangLayang +" cm");
		System.out.print("\nKeliling Layang - Layang = " + KelilingLayangLayang +"cm");
		System.out.print("\nLuas Prisma Segitiga = " + LuasPrisma +" cm");
		System.out.print("\nKeliling Prisma Segitiga = " + KelilingPrisma +"cm");
		
		}
}
	