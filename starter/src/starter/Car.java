package starter;

public class Car extends Vehicle{
	private String carname="mustang";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar=new Car();
		myCar.honk();
		System.out.println(myCar.band+" "+myCar.carname);
		
		
	}

}
