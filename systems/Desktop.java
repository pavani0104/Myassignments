package week3.day1.Assignments.systems;

public class Desktop extends  Computer{
	
	public void desktopSize() {
		System.out.println("Desktop size is 28inches");
		
}
	
	public static void main(String[] args) {
		Desktop d=new Desktop();
		
		d.ComputerModel();
		d.desktopSize();
	}
}