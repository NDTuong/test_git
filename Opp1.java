public class Opp1{

	public static void main(String[] args) {
		
	}
}

class Student{
	private String name;

	public void study(){

	}

}
// Dùng interface, abstract khi cần tạo để dùng cho nhiều thằng khác
interface Person{
	public final static String COUNTRY_NAME = "VIET_NAM";  //Là Hằng

	public void show();  //Khác class trên không có dấu {}
}

abstract class  Employee{
	private String name;

	public abstract void move(); //có abstract thì k cần {}

	public void show(){
		// Không có abstract thì cần {}
	}

}