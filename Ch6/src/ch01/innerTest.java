package ch01;


class OutClass{
	
	private int num = 3939;
	private static int sNum = 20;
	private InClass inClass;
	
	public OutClass() {
		inClass = new InClass();
	}
	
	class InClass{
		int iNum = 100;
		
		
		void inTest() {
			
			System.out.println("OUtClass num =" + num + "(�ܺ� Ŭ������ �ν��Ͻ� ����)");
			System.out.println("OUtClass snum =" + sNum + "(�ܺ� Ŭ������ ����ƽ ����)");
			System.out.println("InClass inum =" + iNum + "(���� Ŭ������ �ν��Ͻ� ����)");

		}
	}
	
	public void usingClass() {
		inClass.inTest();
	}
	
	
	static class InStaticClass {
		
		int iNum = 100;
		static int sInNum = 2222;
		
		void inTest() {
			
			System.out.println("OUtClass snum =" + sNum + "(�ܺ� Ŭ������ ����ƽ ����)");
			System.out.println("InClass inum =" + iNum + "(���� Ŭ������ �ν��Ͻ� ����)");
			System.out.println("OUtClass num =" + sInNum + "(���� Ŭ������ ����ƽ ����)");
			
		}
		
		static void sTest() {
			
		}
	}
}





public class innerTest {

	public static void main(String[] args) {
		
		OutClass outClass = new OutClass();
		outClass.usingClass();
	}

}
