package OnlineTRI;

public class clientonline {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OnlineTries tri=new OnlineTries();
		tri.add("art");
		tri.add("arts");
		tri.add("aman");
		tri.add("bug");
		tri.add("bot");
		tri.add("bou");
		tri.add("cat");
		tri.display();
		System.out.println(tri.search("arrt"));
		tri.remove("art");
		System.out.println("***************");
		tri.display();
	}

}
