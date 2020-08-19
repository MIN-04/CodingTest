package difficulty.level02;

import java.util.Scanner;

public class no1204 {
	
	/**
	 * 1204. [S/W 문제해결 기본] 1일차 - 최빈수 구하기
	*/
	
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++)
		{
			int testCase = sc.nextInt();
			int[] freq = new int[101];
			
			for(int i=0; i<1000; i++) {
				int score = sc.nextInt();
				freq[score] += 1; 
			}
			
			int index = 0;
			int max = 0;
			
			for(int i=0; i<101; i++) {
				if(freq[i]>=max) {
					max = freq[i];
					index = i;
				}
			}
			
			System.out.printf("#%d %d\n",testCase,index);
		}
	}
}
