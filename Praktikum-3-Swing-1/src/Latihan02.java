import javax.swing.JOptionPane;
public class Latihan02 {
	
	public static void main(String[] args){
		Biodata myBio = new Biodata();
		myBio.setFullname (JOptionPane.showInputDialog(
				null,
				"Input your fullname",
				"From Input",
				JOptionPane.QUESTION_MESSAGE
				));
		myBio.setAge (JOptionPane.showInputDialog(
				null,
				"Input your Age",
				"From Input",
				JOptionPane.QUESTION_MESSAGE
				));
		myBio.setAlamat (JOptionPane.showInputDialog(
				null,
				"Input your Address",
				"From Input",
				JOptionPane.QUESTION_MESSAGE
				));
		JOptionPane.showMessageDialog(
				null,
				"Your fullname is " + myBio.getFullname()
				+ "\nYour age is " + myBio.getAge() + "year"
				+ "\nYouraddress is " + myBio.getAlamat()
				);		
	}
}
