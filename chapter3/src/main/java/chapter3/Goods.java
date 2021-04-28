package chapter3;

public class Goods {
	
	static int countOfGoods;
	
	public Goods() {
		Goods.countOfGoods++;
	}
	
	public String name; 	// 모든 접근 가능 (접근 제한 없음)
	protected int price; 	// 같은 패키지 + 자식 접근 가능
 	int countStock; // 재고량 // 디폴트, 같은 패키지만 접근 가능
	private int countSold; // 판매량 // 클래스 내부에서만 접근이 가능
	
	void m() {
		countSold = 100;
	}
}
