package chapter3;

public class DiscountGoods extends Goods {
	private float discountRate = 0.5f;
	
	public float getDiscountPrice() {
		
		// protecter는 자식에서 접근 할 수 있다. (price)
		return price * discountRate;
		
	}
	

}
