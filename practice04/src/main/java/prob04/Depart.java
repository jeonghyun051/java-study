package prob04;

public class Depart extends Employee{
	
	private String department;
	
	public Depart() {
		
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Depart(String name, int salary, String employee) {
	
		this.setName(name);
		this.setSalary(salary);
		this.department = employee;
		
	}
	
	public void getInformation() {
	
		System.out.println( "이름:" + this.getName() + "  " + "연봉:" + this.getSalary() + "  " + "부서:" + department);
	}

}
