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
			
			System.out.println("OUtClass num =" + num + "(외부 클래스의 인스턴스 변수)");
			System.out.println("OUtClass snum =" + sNum + "(외부 클래스의 스태틱 변수)");
			System.out.println("InClass inum =" + iNum + "(내부 클래스의 인스턴스 변수)");

		}
	}
	
	public void usingClass() {
		inClass.inTest();
	}
	
	
	static class InStaticClass {
		
		int iNum = 100;
		static int sInNum = 2222;
		
		void inTest() {
			
			System.out.println("OUtClass snum =" + sNum + "(외부 클래스의 스태틱 변수)");
			System.out.println("InClass inum =" + iNum + "(내부 클래스의 인스턴스 변수)");
			System.out.println("OUtClass num =" + sInNum + "(내부 클래스의 스테틱 변수)");
			
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
