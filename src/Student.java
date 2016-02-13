
public abstract class Student {
	public String RollNum;
	public String StudentName;
	public String RegistrationNum;	
	
	public Student( String rNum, String Name, String RegNum )
	{
		RollNum = rNum;
		StudentName = Name;
		RegistrationNum = RegNum;
	}
	public abstract void getStudentDetails();
}
