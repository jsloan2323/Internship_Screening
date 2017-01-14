import java.util.Random;

public class Instructor extends Courses{

	Random rand = new Random();
	public String instructorname;
	public int instructorID;
	
	
	
public void createInstructor(){
		
		Instructor instructorname = new Instructor();
		this.instructorID = rand.nextInt((90000)+100000);
	
}
}
