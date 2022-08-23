package org.Student;



import org.Department.Department;

public class Student extends Department

{
	public void studentName(String Sname) {
		System.out.println("Student name is " +Sname);
	}

	public void studentDept(String Dname) {
		System.out.println("Student dept name is " +Dname);
	}
		public void StudID(int id )
		{
			System.out.println("Student ID is " +id);
	}
		
		public static void main(String[] args) {
			
			Student stud=new Student();
			
			stud.collegeName("BITS");
			stud.deptName("Mathematics");
			stud.collegeCode(005);
			stud.collegeRank(1);
			stud.studentDept("Science");
			stud.StudID(002);
		}
}
