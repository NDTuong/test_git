public class Opp2{

	public static void main(String[] args) {
		A a1 = new A();
		a1.setName("TuongND");
		System.out.println("a1: " + a1.getName());

		A a2 = new A();
		a2.setName("NDTuong");
		System.out.println("a2: " + a2.getName());

		B b1 = new B();
	}
}

class A{
	private String name;

	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}

}

class B{

}