package prob5;

public class Prob5 {

	public static void main(String[] args) {
		
		for (int i = 3; i < 100; i++) {
            int unit = i % 10;
            int ten = i / 10;
            if (i < 10) {
                if (i % 3 == 0)
                    System.out.println(i + "짝");
            } else {
                if ((ten % 3 == 0) && (i % 10 == 0))            // 30, 60, 90
                    System.out.println(i + "짝");
                else if ((unit % 3 == 0) && (ten % 3 == 0))     // 일의자리, 십의자리 둘다 3의 배수
                    System.out.println(i + "짝짝");
                else if ((unit % 3 == 0) || (ten % 3 == 0))     // 3의 배수가 한 개
                    if (i % 10 != 0)        // 10의 자리 거르기
                        System.out.println(i + "짝");
            }

        }

//		for (int i = 1; i < 100; i++) {
//			
//			int a = i/10; // 몫
//			int b = i%10; // 나머지
//			int count1 =0; 
//			int count2 = 0;
//			
//			if(a==3 || a== 6 || a==9) {
//
//				count1++;
//			}
//			if(b==3 || b==6 || b==9) {
//
//				count2++;
//			}
//			
//			if (count1 == 1 && count2 == 1) {
//				
//				System.out.println(i + "짝짝");
//			} else if (count1 == 1 && count2 == 0 || count1 ==0 && count2 ==1) {
//				System.out.println(i + "짝");
//			}
//		}

	}
}