package starter;

public class student {
	String name;
	int age;
	static int noOfStudent;
	student(){
		noOfStudent++;
		
	}
	public static int getNoOfStudent()
	{
		return noOfStudent;
	}
	public void setname(String name) {
		this.name=name;
	}
	public String getname() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
