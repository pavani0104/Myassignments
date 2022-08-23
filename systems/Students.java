package week3.day1.Assignments.systems;

public class Students {
	
	public void getStudentInfo()
	{
		System.out.println("student info is available");
		
	}
	
	public void getStudentInfo(int studid)
	{
		System.out.println("Student ID is " +studid);
	}
	
	public void getStudentInfo(int studid,int StudRank)
	{
		System.out.println("Student Details are: Studid:" +studid+ ", StudRank:"  +StudRank);
	}
public void getStudentInfo(int Studid,String Studname)
{
	System.out.println("Student info is: Studid: " +Studid+ ", Studname:" +Studname);
}

public static void main(String[] args) {
	
	Students stud=new Students();
	
	stud.getStudentInfo();
	stud.getStudentInfo(1, 2);
	stud.getStudentInfo(2);
	stud.getStudentInfo(3, "Ram");
}
}
