
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;

public class Employee {
		private String firstName, lastName;
		private int age;
		private int birthYear;
		private int salary;
		
		public Employee() {
			firstName = "";
			lastName = "";
			birthYear = 0;
			salary = 0;
			age = 0;
		}
		public Employee(String firstName, String lastName, int age, int birthYear, int salary) {
			this.firstName = firstName;
			this.lastName = lastName;
			this.age = age;
			this.birthYear = birthYear;
			this.salary = salary;
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public int getBirthYear() {
			return birthYear;
		}
		public void setBirthYear(int birthYear) {
			this.birthYear = birthYear;
		}
		public int getSalary() {
			return salary;
		}
		
		public void setSalary(int salary) {
			this.salary = salary;
			
		}
		public void output() {
				
				System.out.println("employee: "+ this.toString());
		}
			
			public void changeName(String fn, String ln) {
				
				if (fn != null && fn != "") {
					firstName = fn;
				}
				if (ln != null && ln != "") {
					lastName = ln;
		}
				
			}
}
			
		
	
				
		