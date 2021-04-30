package chapter4;

public class StringTest03 {
	public static void main(String[] args) {
		String s = "aBcABCabcAbC";

		System.out.println(s.length());
		System.out.println(s.charAt(2));
		System.out.println(s.indexOf("a"));
		System.out.println(s.substring(3)); // 3번지부터 끝까지
		System.out.println(s.substring(3, 5)); // AB

		String s2 = "   ab    cd   ";
		String s3 = "efg,hjik,lnm,lasdf";

		String s4 = s2.concat(s3);
		System.out.println(s4);

		System.out.println(s2.trim()); // 앞뒤 공백을 없애준다.
		System.out.println(s2.replaceAll(" ", ""));

		String p = "1000";
		int price = Integer.parseInt(p);
		System.out.println(price);

		String[] tockens = s3.split(",");
		for (String token : tockens) {
			System.out.println(token);

		}

		StringBuffer sb = new StringBuffer("");
		sb.append("Hello ");
		sb.append("World ");
		sb.append("Java ");
		sb.append(1.8);

		String s5 = sb.toString();
		System.out.println(s5);

		// String s6 = "Hello " + "World " + "Java" + 1.8;
		// System.out.println(s6);
		String s6 = new StringBuffer("Hello ").append("World ").append("Java ").append(1.8).toString();

		System.out.println(s6);

		// 주의 : 문자열 + 연산을 하지 말아야 할 때
//		String s7 = "";
//		for (int i = 0; i < 100000; i++) {
//			// s7 = s7 + i;
//			// new를 계속하기 때문에 오래 걸림, 메모리 낭비 심함
//			// s7 = new StringBuffer(s7).append(i).toString();
//		}
		
		StringBuffer sb3 = new StringBuffer("");
		for(int i=0; i<1000000; i++) {
			sb3.append(i);
		}
		String s7 = sb3.toString();
		System.out.println(s7.length());

	}
}