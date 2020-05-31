public class Opp7{
	public static void main(String[] args) {
		Room r1 = new Room();
		r1.number = 10;
		System.out.println(r1.number);
		System.out.println(r1.area);

		r1.area = 300;

		Room r2 = new Room();
		r2.number = 20;
		System.out.println(r2.number);

		Room r3 = new Room();
		r3.number = 30;
		System.out.println("##");
	}
	

}

class Room{
	int number;
	static int area = 200;
}