package prob03;

public class Money {
	private int amount;
	
	public Money(int amount) {
		this.amount = amount;
	}
	
	public Money add(Money money) {
		this.amount += money.amount;
		int result = this.amount + money.amount;
		System.out.println("this.amount:" + this.amount);
		System.out.println("result:" + result);
		Money money2 = new Money(this.amount);
		return money2;
	}
	
	public Money minus(Money money) {
		this.amount -= money.amount;
		Money money2 = new Money(this.amount);
		return money2;
	}
	
	public Money multiply(Money money) {
		this.amount *= money.amount;
		Money money2 = new Money(this.amount);
		return money2;
	}
	
	public Money devide(Money money) {
		this.amount /= money.amount;
		Money money2 = new Money(this.amount);
		return money2;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	
	
}
