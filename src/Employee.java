
public class Employee {
	
	private String name;
	private int id;
	private int age;
	private String city;
	
	public Employee(String name, int id, int age, String city) {
		this.name = name;
		this.id = id;
		this.age = age;
		this.city = city;
	}
	
	public void hey() {
		A emp1 = new A();
		emp1.setData(this);
	}
	
	public static void main(String[] args){
		hey();
	}
}
