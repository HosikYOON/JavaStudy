package ch02;

public class AddTest {

	public static void main(String[] args) {

		Add addL = (x , y)->{return x+y;};
	//  Add addL = (x , y)-> x+y; 이렇게 많이 사용한다. 
		
		System.out.println(addL.add(2, 3));
		
	}

}
