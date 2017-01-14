import java.util.Random;

public class Student extends Courses {

	Random rand = new Random();
	public Object studentname;
	public static int studentID;
	
	
	public void createStudent(){
		
		Student studentname = new Student();
		this.studentID = rand.nextInt((90000)+100000);
	}
	
	public void add(){
		
		
		
	}
	
	public void drop(){
		
	}
	
}
