public class Opp3{
	public static void main(String[] args) {
	
	Outer out = new Outer();
	out.show();

	C out2 = new C();
	out2.show();
	}
}

class Outer{											//Outer class ở ngoài, ngang bằng các class khác
	public void show(){
	Inner in = new Inner();
	in.display();

	}
	class Inner{										//Inner class ở trong 1 class khác
		public void display(){
			System.out.println("Inner class");
		}
	}
}

class C{
	public void show(){
	Outer.Inner in = new Outer().new Inner(); 			// Cách dùng class Inner của 1 class Outer
	in.display();										// ở trong 1 class Outer khác
	}
}