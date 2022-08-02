package method;

public class Ex1 {

	public static void main(String[] args) {
		/*
		 * 캡슐화(Encapsulation) = 은닉성
		 * - 객체 내부의 구조 (멤버변수 및 메서드 처리 과정)을 외부로부터 숨기고
		 *   메세지만으로 객체와 통신하도록 하는것
		 * - 클래스 정의 시 멤버변수를 private 접근제한자를 사용하여 외부 접근을 차단하고
		 *   public 접근제한자가 선언된 Getter/Setter 메서드를 정의하여
		 *   간접적으로 객체 내의 멤버변수에 접근하도록 하는것 
		 * - 모든 Getter / Setter 메서드는 누구나 접근 가능하도록 접근제한자 public을 사용
		 * - Getter 메서드는 내부 멤버변수 값을 외부로 리턴하는 역할을 수행하여
		 *   메서드 이름은 getXXX() 형태 (XXX: 리턴할 멤버변수 이름) 하고
		 *   파라미터는 없고, 리턴타입은 리턴할 멤버변수의 데이터타입을 지정
		 * - Setter 메서드는 외부로부터 전달받은 값을 내부 멤버변수에 저장하는 역할을 수행하며
		 *   메서드 이름은 setXXX() 형태 (XXX: 데이터를 저장할 멤버변수 이름)
		 *   파라미터는 전달받은 데이터의 데이터타입을 지정하고, 리턴타입은 없으므로 void 지정
		 *      
		 * */
		
		Student s = new Student();
		s.setName("홍길동");
		s.setAge(20);
		s.setScore(90);
		System.out.println("이름: " + s.getName());
		System.out.println("나이: " + s.getAge());
		System.out.println("점수: " + s.getScore());
		
		s.setScore(2717623);
		System.out.println(s.getScore());
		s.setScore(-1237123);
		System.out.println(s.getScore());
		
		System.out.println(s.getsetScore(100));
		System.out.println(s.getsetScore(0));
		
		
		
	}

}

class Student {
	// 멤버변수: 이름 (name, 문자열), 나이(age, 정수), 점수(score, 정수)
	// => 모든 멤버변수는 private 접근제한자를 사용하여 선언
	private String name;
	private int age;
	private int score;
//	int score;
	
	// 이름(name)을 외부로 전달받아 내부 멤버변수 name에 저장하는 Setter 메서드 정의
	// => 파라미터: 이름(String타입, name), 리턴타입: 리턴값이 없으므로 void
	public void setName(String name) {
		this.name = name;
	}
	
	// 멤버변수 name 값을 외부로 리턴하는 Getter 메서드 정의
	// => 파라미터: 없음, 리턴타입: String(이름(name) 리턴)
	public String getName() {
		return name;
	}

	// Getter / Setter 자동 생성 단축키 : Alt + Shift + S -> R
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		if(score < 0) score = 0;
		if(score > 100) score = 100;
		this.score = score;
	}
	
	public int getsetScore(int score) {
		this.score = score;
		return this.score;
	}

}











