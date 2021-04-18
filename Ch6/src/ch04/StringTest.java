package ch04;

public class StringTest {

	public static void main(String[] args) {
		
		String ss1 = "모두들";
		String ss2 = "안녕";
		
		StringConcatImpl SCCI = new StringConcatImpl();
		SCCI.makeString("모두들", "안녕");
		
		
		StringConcat SC = (s1 , s2)-> System.out.println(s1 + "," + s2);	
		SC.makeString(ss1, ss2);
		
		StringConcat SCC = new StringConcat() { // 익명함수
			
			@Override
			public void makeString(String s1, String s2) {
				System.out.println(s1 + "....." + s2);	
				
			}
		};
		SCC.makeString(ss1, ss2);
	}

}
