package interfaceEx;

public interface Calc {

	double pi = 3.14;
	int ERROR = -9999999;
	
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	// interface 선언한다.
	// 위와 같은 메서드들이 어떻게 구현될지 대략적으로 알 수 있고, 그렇게 설계한다.
	
	
}
