public class Employee{
 	static int count = 0;
	
	int id;
	String name;
	int age;
	String department;

	public Employee() {
		count++;
	}
	
	public Employee(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
		count++;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public static int getCount() {
		return count;
	}
	
	public void printDetails() {
		System.out.println("Employee: " + this.getId() + " " + this.getName()+ " " 
						+ this.getAge());
	}

	@Override
	public String toString() {
		return "Employee: " + this.getId() + " " + this.getName()+ " " 
				+ this.getAge();
	}

	@Override
	public int compareTo(Employee o) {
		return this.getId() - o.getId();
	}
    


}