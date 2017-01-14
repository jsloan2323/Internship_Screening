
public class Courses extends Allegient_University{
	
	public String coursename;
	public int enrollment;
	public int max;
	public int students[] = new int[enrollment];
	public String waitlist[] = new String[enrollment-max];
	boolean type; 
	boolean DEtype;
	int currstudentseat; 

	
	public void addStudent(){
		
		if(currstudentseat < max){
		
		students[currstudentseat] =  Student.studentID;
		
		}
		
		else
			System.out.println("There are no remaining seats in this class");
		
		
		
		
	}
	
	public void dropStudent(){
		
	
	}
	


	
}
