import java.util.Scanner;

public class Latihan01 {

	public static void main(String[] args) {
		double celcius, farenheit, reamur, kelvin;
		
		System.out.println("Masukkan suhu : ");
		Scanner input = new Scanner(System.in);
		celcius = input.nextInt();
		farenheit = (celcius * 9/5) + 32;
		reamur = celcius * 4/5 ;
		kelvin = celcius + 273;
		
		System.out.println("Celcius: " +celcius);
		System.out.println("Kelvin: " +kelvin);
		System.out.println("Reamur: " +reamur);
		System.out.println("Farenheit: "+farenheit);
	}

}