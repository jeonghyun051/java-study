package chapter3;

public class Goods2App {

	public static void main(String[] args) {
		Goods2 goods2 = new Goods2();
	
		goods2.setName("Nikon");
		goods2.setPrice(10000);
		goods2.setCountSold(20);
		goods2.setCountStock(30);
		
		goods2.setPrice(-1);
		
		goods2.showInfo();
		
		Goods2 goods3 = new Goods2("cannon",20000,20,30);
		goods3.showInfo();

	}

}
