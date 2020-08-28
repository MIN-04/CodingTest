package difficulty.level02;

import java.util.Scanner;

public class no1970 {
	
	/**
	 * 1970. 쉬운 거스름돈
	*/
	
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		
		int[] money = {50000,10000,5000,1000,500,100,50,10};
		
		for(int test_case = 1; test_case <= T; test_case++)
		{
			int N = sc.nextInt(); //받은 돈
			
			System.out.printf("#%d\n",test_case);
			
			for(int i=0; i<8; i++) {
				if(N / money[i] !=0) {
					System.out.printf("%d ",N / money[i]);
					N %= money[i];
				}else {
					System.out.printf("%d ",0);
				}
			}
			System.out.println();
		}
	}
}
