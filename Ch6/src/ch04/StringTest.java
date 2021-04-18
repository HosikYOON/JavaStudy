package ch04;

public class StringTest {

	public static void main(String[] args) {
		
		String ss1 = "��ε�";
		String ss2 = "�ȳ�";
		
		StringConcatImpl SCCI = new StringConcatImpl();
		SCCI.makeString("��ε�", "�ȳ�");
		
		
		StringConcat SC = (s1 , s2)-> System.out.println(s1 + "," + s2);	
		SC.makeString(ss1, ss2);
		
		StringConcat SCC = new StringConcat() { // �͸��Լ�
			
			@Override
			public void makeString(String s1, String s2) {
				System.out.println(s1 + "....." + s2);	
				
			}
		};
		SCC.makeString(ss1, ss2);
	}

}
