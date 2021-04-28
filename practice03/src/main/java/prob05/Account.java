package prob05;

public class Account {
	
	private String accountNo; 	// 계좌번호
	private int balance; 		// 잔고
	
	public Account() {
		// TODO Auto-generated constructor stub
	}
	
	public Account(String accountNo) {
		
		this.accountNo = accountNo;
		System.out.println(accountNo + " " + "계좌가 개설되었습니다.");
	}
	
	public void save(int money) {
		this.balance += money;
		System.out.println(accountNo + " " + "계좌에" + " " + balance + "만원이 입금되었습니다.");
	}
	
	public void deposit(int money) {
		this.balance -= money;
		System.out.println(accountNo + " " + "계좌에" + " " + money + "만원이 출금되었습니다.");
	}
	
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
}