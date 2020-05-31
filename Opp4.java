public class Opp4{
	public static void main(String[] args) {
		Manager man = new Manager();
		man.show();
	}
}

interface Human{		//interface class
	public static final int AVG_AGE = 100;			//thuộc tính của interface mặc định 3 cái này,
	int AVG_HEIGHT = 60;							//la hang so, dung o nhieu cho khac duoc
			
	public abstract void show();					//mặc định public abstract, kh viết vẫn tự hiểu vậy
	void study();

}

class Manager implements Human{						//1 class kế thừa interface dùng implements
	
	public void show(){
		System.out.println("AVG_AGE: " + AVG_AGE);
	}


	public void study(){

	}
}