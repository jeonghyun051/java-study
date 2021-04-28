package prob2;

import java.util.Iterator;

public class Prob2 {
	public static void main(String[] args) {
		/* 코드 작성 */
		
		int a = 1;
		int b = 10;
		
		for(int i=1; i<=9; i++) {
			System.out.println();
			
			for(int j=a; j<=b; j++) {
				System.out.print(j+" ");		
				
			}
			
			a++;
			b++;
		}
		
	}
}