package method;

/*
 * 은행계좌(Account) 클래스 정의
 * - 멤버변수 (단, 모든 멤버변수를 private 접근제한자로 선언)
 * 	1) 계좌번호(accountNo, "xxx-xxxx-xxx" = 문자열)
 * 	2) 예금주명(ownerName, "xxx" = 문자열)
 * 	3) 현재잔고(balance, XXXX = 정수)
 * - Getter / Setter 메서드 정의
 * 
 * */
class Account {
	
	private String accountNo;
	private String ownerName;
	private int balance;
	
	// Alt + Shift + S -> R
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public int getBalance() {
		return balance;
	}
	/*
	 * 현재잔고를 설정하는 setBalance() 는 적절하지 않으므로
	 * 대신, 입금기능(deposit()) 메서드
	 * => 파라미터: 입금할 금액(amount, 정수), 리턴타입: void
	 *    입금금액을 전달받아 현재잔고(balance)에 누적하고 다음과같이 출력
	 *    입금할 금액 : XXXX원
	 *    입금 후 현재잔고 : XXXX원
	 * */
	public void deposit(int amount) {
		this.balance += amount;
		System.out.println("입금할 금액 : " + amount + "원");
		System.out.println("입금 후 현재잔고 : " + balance + "원");
	}
	
}


public class Test1 {

	public static void main(String[] args) {
		Account acc = new Account();
		acc.setAccountNo("111-1111-111");
		acc.setOwnerName("홍길동");
		// => 은행 계좌 기능 중 잔고설정(setBalance())은 적합하지 않은 기능이므로
		//    입금기능(deposit())을 통해 처리하는 것이 더 적합함
		acc.deposit(100000);
		
		System.out.println("계좌번호 : " + acc.getAccountNo());
		System.out.println("예금주명 : " + acc.getOwnerName());
		System.out.println("현재잔고 : " + acc.getBalance());
		
	}

}










