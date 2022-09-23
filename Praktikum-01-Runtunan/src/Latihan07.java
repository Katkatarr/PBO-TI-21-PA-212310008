
public class Latihan07 {
	public static void main(String[] args) {
		String data = "Katarina Andrea Laurentia";

		data = data.replaceAll("[A,a,i,u,e,o]", "X");

		System.out.println("Katarina Andrea Laurentia ==>" + data);
	}	    

}