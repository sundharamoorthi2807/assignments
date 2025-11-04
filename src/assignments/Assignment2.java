package assignments;

public class Assignment2 {

	public static void main(String[] args) {
		
		//Semesters as the first dimension
		//Subjects and Status/Marks as the second dimension.
		//Actual values for Subject Names and Marks as the third dimension.
		String [][][] results = new String[5][6][6];
		
		//semester 1 
		results [0][0][0] = "Mathematics I / Pass(78)";
		results [0][1][1] = "Physics / Pass(85)";
		results [0][2][2] = "Chemistry / Fail(21)";
		results [0][3][3] = "Computer Programming / Pass(74)";
		results [0][4][4] = "Engineering Drawing / Pass(88)";
		results [0][5][5] = "Basic Electrical Eng. / Pass(79)";
		
		//semester 2
		results [1][0][0] = "Mathematics II";
		results [1][1][1] = "Mechanics";
		results [1][2][2] = "Environmental Sci.";
		results [1][3][3] = "Basics Electronics";
		results [1][4][4] = "Engineering Physics";
		results [1][5][5] = "Engineering Graphics";
		
		//semester 4
		results [3][0][0] = "Pass(91)";
		results [3][1][1] = "Pass(73)";
		results [3][2][2] = "Fail(19)";
		results [3][3][3] = "Pass(80)";
		results [3][4][4] = "Pass(76)";
		results [3][5][5] = "Pass(87)";
		
		
		
		//Print Semester 2 Subject 4 and Subject 5 names.
		System.out.println(results[1][3][3]);
		System.out.println(results[1][4][4]);
		
		//Print the Status/Marks of Semester 4 Subject 3 and Subject 6.
		System.out.println(results[3][2][2]);
		System.out.println(results[3][5][5]);

	}

}
