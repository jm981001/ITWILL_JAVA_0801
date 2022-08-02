package method;

/*
 * OverloadingMethod 클래스 정의
 * - int 형 정수 2개를 전달받아 덧셈 결과를 출력하는 add() 메서드 정의 - 오버로딩
 * - double형 실수 2개를 전달받아 덧셈 결과를 출력하는 add() 메서드 정의 - 오버로딩
 * - long형 정수 2개를 전달받아 덧셈 결과를 출력하는 add() 메서드 정의 - 오버로딩
 * */
class OverloadingMethod {
	
	public void add(int num1, int num2) {
		System.out.println("add(int, int) 호출됨!");
		System.out.println(num1 + num2);
	}
	
	public void add(double num1, double num2) {
		System.out.println("add(double, double) 호출됨!");
		System.out.println(num1 + num2);
	}
	
	public void add(long num1, long num2) {
		System.out.println("add(long, long) 호출됨!");
		System.out.println(num1 + num2);
	}
	
}


public class Test2 {

	public static void main(String[] args) {
		// OverloadingMethod 클래스의 인스턴스 생성 후
		// 각 add() 메서드에 해당하는 데이터를 전달하여 덧셈결과 출력
		OverloadingMethod om = new OverloadingMethod();
		om.add(10, 20);
		om.add(3.14, 2.2);
		om.add(100L, 200L);
		System.out.println("-------------");
		
		om.add(10, (int)(2.2));
		om.add(3.14, (int)(100L));
		om.add(100L, 2);
		
		
		
	}

}





