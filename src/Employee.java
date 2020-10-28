
public class Employee {
		private String firstname;
		private String lastname;
		private int age;
		public static int count;
		static {
			System.out.println("Static block");
			count =0;
		}
		public Employee() {
			firstname = "";
			lastname ="";
			age =0;
			count++;
		}
		
		public Employee(String firstname, String lastname, int age) {
			
			this.firstname = firstname;
			this.lastname = lastname;
			this.age = age;
			count++;
		}

		public String getFirstname() {
			return firstname;
		}

		public void setFirstname(String firstname) {
			this.firstname = firstname;
		}

		public String getLastname() {
			return lastname;
		}

		public void setLastname(String lastname) {
			this.lastname = lastname;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public static int getCount() {
			return count;
		}

		public  void setCount(int count) {
			Employee.count = count;
		}
}
		
		

		