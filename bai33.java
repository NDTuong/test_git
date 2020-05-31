public class bai33 extends AA{
	public static void main(String[] args) {
		bai33 b = new bai33();
		System.out.println(b.add(3,4));
		System.out.println(b.add(3.4f, 4.3f));
		System.out.println(b.add("Tuong","ND"));
	}

	public int add(int a, int b){
		return a+b;
	}
	float add(float a, float b){			//overload cùng tên, cùng số lượng tham số thì đổ modif..
		return a+b;
	}
}

class AA{
	public String add(String a, String b){
		return a+b;
	}
}
class new {
}
