package prob04;
public class Prob04 {

	public static void main(String[] args) {
		char[] c1 = reverse( "Hello World" );
		printCharArray( c1 );
		
		char[] c2 = reverse( "Java Programming!" );
		printCharArray( c2 );
	}
	
	public static char[] reverse(String str) {
		/* 코드를 완성합니다 */
	      // 버퍼를 만듭니다.
	      StringBuffer strBuffer = new StringBuffer(); 
	      //변환할 문자열

	      // 버퍼에 문자열을 넣고
	      strBuffer.append(str);
	      // 버퍼안에 reverse()를 이용해 거꾸로 출력
	      System.out.println(strBuffer.reverse());
		
		return null;
	}

	public static void printCharArray(char[] array){
		/* 코드를 완성합니다 */
		//System.out.println( array );
	}
}