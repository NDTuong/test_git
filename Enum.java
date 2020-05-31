public class Enum{

	enum COLOR {RED, YELLOW, BLUE};
	enum COLOR2 {
		RED(5), YELLOW(7), GREEN(9), BLACK(8);
		private int value;
		COLOR2(int value){
			this.value = value;
		}
		public int getValue(){
			return value;
		}
	}
	public static void main(String[] args) {
		System.out.println(COLOR.YELLOW);
		COLOR2 c = COLOR2.YELLOW;
		System.out.println(c + ":" + c.getValue());
	}
}