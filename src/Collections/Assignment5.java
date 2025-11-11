package Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Assignment5 {

	public static void main(String[] args) {
		Map<String,String> studentdetails1 = new HashMap<String,String>();
		studentdetails1.put("Name", "John Doe");
		studentdetails1.put("Age", "Twenty");
		studentdetails1.put("Gender", "Male");
		studentdetails1.put("Roll Number", "SBA12345");
		studentdetails1.put("Grade", "A++");
		studentdetails1.put("Major", "Computer Science");
		studentdetails1.put("GPA", "A3.8");
		studentdetails1.put("Email", "john@example.com");
		studentdetails1.put("PAN Number", "SDF6543210");
		studentdetails1.put("Address", "123 Elm St");
		System.out.println("Student details1:" + studentdetails1);

		
		Map<String,String> studentdetails2 = new HashMap<String,String>();
		studentdetails2.put("Name", "John Doe");
		studentdetails2.put("Age", "Twenty One");
		studentdetails2.put("Gender", "Female");
		studentdetails2.put("Roll Number", "SBA12346");
		studentdetails2.put("Grade", "B++");
		studentdetails2.put("Major", "Mathematics");
		studentdetails2.put("GPA", "A3.5");
		studentdetails2.put("Email", "jane@example.com");
		studentdetails2.put("PAN Number", "REW6543211");
		studentdetails2.put("Address", "456 Oak St");
		System.out.println("Student details2:" + studentdetails2);
		
		Map<String,String> studentdetails3 = new HashMap<String,String>();
		studentdetails3.put("Name", "Mike Brown");
		studentdetails3.put("Age", "Twenty Two");
		studentdetails3.put("Gender", "Male");
		studentdetails3.put("Roll Number", "SBA12347");
		studentdetails3.put("Grade", "A++");
		studentdetails3.put("Major", "Physics");
		studentdetails3.put("GPA", "A3.9");
		studentdetails3.put("Email", "mike@example.com");
		studentdetails3.put("PAN Number", "TYR6543212");
		studentdetails3.put("Address", "789 Pine St");
		System.out.println("Student1 details3:" + studentdetails3);

		List<Map<String, String>> ProductList = new ArrayList<Map<String, String>>();
		ProductList.add(studentdetails1);
		ProductList.add(studentdetails2);
		ProductList.add(studentdetails3);
		System.out.println("Product list:" + ProductList);
	}

}
