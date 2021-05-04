package prob04;

public class StringUtil {
	public static String concatenate(String[] str) {
        //문자열을 결합하여 리턴 하는 메소드 구현

		return str[0].concat(str[1]).concat(str[2]);
		
		// 방식2
//		String result = "";
//		for(String s : strArr) {
//			result += s;
//		}
//		
//		return result;
    }

}
