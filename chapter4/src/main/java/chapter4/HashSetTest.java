package chapter4;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {
		
		// Set은 내용 기반
		Set<Rect> set = new HashSet<>();
		
		Rect rect1 = new Rect(10, 20);
		Rect rect2 = new Rect(10, 20);
		
		set.add(rect1);
		set.add(rect2);

		for(Rect rect : set) {
			System.out.println(rect);
			
		}
		
		// 결론 : 해쉬랑 이퀄스랑 같이 오버라이드 하기 성능면에서 좋음
	}
}