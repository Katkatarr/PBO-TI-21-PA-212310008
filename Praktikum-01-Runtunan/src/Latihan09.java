class Students {
	int npm,semester;
	String fullName,className;
	Double gpa;
	
	int getNPM(int paramNPM) {
		npm = paramNPM;
		return npm;
	}
	
	String getFullName(String paramFullName) {
		fullName = paramFullName;
		return fullName;
	}
	
	String getClassName(String paramClassName) {
		className = paramClassName;
		return className;
	}
	
	int getSemester(int paramSemester) {
		semester = paramSemester;
		return semester;
	}
	
	Double getGPA(Double paramGPA) {
		gpa = paramGPA;
		return gpa;
	}
}

public class Latihan09 {
	public static void main(String[] args) {
		Students myBio = new Students();
		System.out.println("NPM : " + myBio.getNPM(212310008));
		System.out.println("Nama Lengkap : " + myBio.getFullName("Katarina Andrea Laurentia"));
		System.out.println("Kelas : " + myBio.getClassName("TI21-PA"));
		System.out.println("Semester : " + myBio.getSemester(3));
		System.out.println("GPA : " + myBio.getGPA(3.7));
	}
}

