public class Opp5{
	public static void main(String[] args) {
		Boss b1 = new Boss();
		System.out.println(b1.age);
	}
}

class Boss{
	public int age;				//có thể dùng ở bất cứ đâu
	protected String name;		//dùng được trong phạm vi cùng package, các class con
	String address;				//chỉ được dùng trong phạm vi cùng package.
	private int numOfWives;		//chỉ dùng trong class của nó thôi
}