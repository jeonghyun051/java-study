package collection;

import java.util.Enumeration;
import java.util.Vector;

public class VectorTest01 {

	public static void main(String[] args) {
		
		// 벡터는 싱크로나이즈를 통해서 동기를 할 수 있음
		// 멀티스레드방식에서 사용함
		// 데베 관련된 것은 어레이리스트 사용함
		
		Vector<String> v = new Vector<>();
		
		v.addElement("둘리");
		v.addElement("마이콜");
		v.addElement("또치");
		
		// 순회1
		int count = v.size();
		for(int i=0; i<count; i++) {
			String s = v.elementAt(i);
			System.out.println(s);
		}
		
		/*
		 * for(String vr : v) { System.out.println(vr); }
		 */
		
		// 삭제
		v.remove(2);
		
		// 순회2 
		Enumeration<String> e = v.elements();
		while(e.hasMoreElements()) {
			String s = e.nextElement();
			System.out.println(s);
		}
		
	
	}
}
