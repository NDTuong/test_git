

public class Students{
	private String name = "TuongND";
	private int age = 21 ;

	public Students(){
		// Hàm khởi tạo
	}

	public void showStudents(){
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}

	public int addNumber(int a, int b){
		int sum = a + b;
		return sum;
	}

	public static void main(String [] args){
		Students A = new Students();
		A.showStudents();
		System.out.println("Sum of two numbers: " + A.addNumber(3,4));
	}


}