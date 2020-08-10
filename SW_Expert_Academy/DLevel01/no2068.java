package difficulty.level01;

import java.util.Scanner;

public class no2068 {
	
	/**
	 * 2068. 최대수 구하기
	*/
	
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
			int max = 0;
			
			for(int i=0; i<10; i++) {
				int num = sc.nextInt();
				
				if(max<num) {
					max = num;
				}
			}
			
			System.out.printf("#%d %d\n",test_case,max);
			

		}
	}
}
