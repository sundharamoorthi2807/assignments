package assignments;


public class EmpGroupsAssignment3 {
 

		public static void main(String[] args) {
			EmployeesAssignment3 obj = new EmployeesAssignment3();
			String[] employeesname = new String[3];
			employeesname[0]="Bharath";
			employeesname[1]="John";
			employeesname[2]="Aarav";
			int[] employeesid = new int[3];
			employeesid[0]=1234;
			employeesid[1]=1235;
			employeesid[2]=1236;

			System.out.println("Employee Name : "+obj.employee1 +",Employee ID: "+obj.employeeid1);
			System.out.println("Employee Name : "+obj.employee2 +",Employee ID: "+obj.employeeid2);
			System.out.println("Employee Name : "+obj.employee3 +",Employee ID: "+obj.employeeid3);
		

	}

}
