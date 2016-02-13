
public class StudentRecord {
	public static void main(String[] args) {
		Student1 Prashant = new Student1("1", "Prashant", "1234");
		Student2 Anup = new Student2("2", "Anup", "12345");
			
		Prashant.getStudentDetails();
		System.out.println("Academic result = "+Prashant.academicMarksCalculate(15, 10, 15));
		
		Anup.getStudentDetails();
		System.out.println("Academic result = "+ Anup.academicMarksCalculate(20, 15, 25));
		System.out.println("Sports result = "+Anup.SportsPerformanceCalculate(100));
	}

}
