class Employee 
{
	int empno;
	String name;
	float sal;
	
	void setDetails(){
		empno = 101;
		name = "Prakash";
		sal = 5500f;
	}

	void getDetails(){
		System.out.println(empno + " | " + name + " | " + sal);
	}

	public static void main(String[] args) {
		System.out.println("in Employee class");
	}
}

class ObjectTest
{
	public static void main(String[] args) 
	{
		Employee emp = new Employee();
		emp.getDetails();

		emp.setDetails();

		emp.getDetails();
	}
}
