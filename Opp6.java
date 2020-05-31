public class Opp6{
	public static void main(String[] args) {
		
	}
}

interface Document{
	void show();
}

interface ReferentDoc extends Document{		//Interface thừa kế 1 interface khác dùng extends

}

class Book implements Document{					// class thừa kế interface dùng implements
	public void show(){

	}
}

class Paper extends Book{				// class thừa kế class khác

}

class NBook extends Book implements Document,ReferentDoc{			/*1 class chỉ kế thừa 1 class,
																	nhưng kế thừa đươc nhiều interface*/
}