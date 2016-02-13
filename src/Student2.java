
public class Student2 extends Student implements Academic ,Sports{

	public Student2(String rNum, String Name, String RegNum) {
		super(rNum, Name, RegNum);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int SportsPerformanceCalculate(int SportsGrade) {
		// TODO Auto-generated method stub
		return SportsGrade;
	}

	@Override
	public int academicMarksCalculate(int sub1, int sub2, int sub3) {
		// TODO Auto-generated method stub
		return sub1+sub2+sub3;
	}

	@Override
	public void getStudentDetails() {
		// TODO Auto-generated method stub
		System.out.println("Roll Number ="+super.RollNum) ;
		System.out.println("Name ="+super.StudentName);
		System.out.println("Reg number = "+super.RegistrationNum);
	}
}
