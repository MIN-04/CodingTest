package difficulty.level01;

import java.util.Scanner;

public class no2071 {
	
	/**
	 * 2071. 평균값 구하기
	*/
	
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		/*
		   여러 개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
		*/

		for(int test_case = 1; test_case <= T; test_case++)
		{
			int result = 0;
			
			for(int i=0; i<10; i++) {
				result += sc.nextInt();
			}
			
			result = (int)Math.round(result/10.0);
			
			System.out.printf("#%d %d\n",test_case,result);

		}
	}
}
