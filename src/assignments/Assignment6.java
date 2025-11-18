package assignments;

public class Assignment6 {

	public static void main(String[] args) {
		//creating array for studentname
		String[] StudentName = new String[3];
		StudentName[0] ="Suresh";
		StudentName[1] ="Magesh";
		StudentName[2] ="Naresh";
		
		//creating array for Studentmarks
		int[] StudentMarks = new int[3];
		StudentMarks[0] = 75;
		StudentMarks[1] = 80;
		StudentMarks[2] = 82;
		
		//incrementing value by 10 for the Student marks
		System.out.println("Updated Marks:");
		StudentMarks[0]+=10;
		StudentMarks[1]+=10;
		StudentMarks[2]+=10;
		System.out.println(StudentName[0] +StudentMarks[0]);
		System.out.println(StudentName[1] +StudentMarks[1]);
		System.out.println(StudentName[2] +StudentMarks[2]);
		
		//Finding average for overall student marks
		int c;
		c = StudentMarks[0]+StudentMarks[1]+StudentMarks[2];
		c/=3;
		System.out.println("Average marks is:"+c);
	}

}

