public class Demo{


	public static void main(String[] args) {
		//if-else
		int age = 21;
		if (age < 20){
			System.out.println("Chua du tuoi lay vo");
		}
		else {
			System.out.println("Du tuoi lay vo");
		}

		//switch
		switch (age) {
			case 0,1,2,21:
				System.out.println("Case 1");
				break;
			case 3,4,5:
				System.out.println("Case 2");
				break;
			default:
				System.out.println("Default");
				break;	
		}

		//for
		for(int i = 0; i < 2; i++){
			System.out.println("i: " + i);
		}

		//while, do-while như c++
		//array
		int [] array1 = new int[10];
		int [] array2 = {2,3,4,5};
		System.out.println(array2.length);
	}
}