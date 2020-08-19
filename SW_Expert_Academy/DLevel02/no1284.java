package difficulty.level02;

import java.util.Scanner;

public class no1284 {
	
	/**
	 * 1284. 수도 요금 경쟁
	*/
	
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++)
		{
			int P = sc.nextInt(); //A사 1L당 요금
			int Q = sc.nextInt(); //B사 기본 요금
			int R = sc.nextInt(); //B사 기본 요금 기준 (이하)
			int S = sc.nextInt(); //B사 1L당 초과 요금
			int W = sc.nextInt(); //한달 사용량
			
			int costA = P * W;
			int costB = 0;
			
			if(W <= R) {
				costB = Q;
			}else {
				costB = Q + S * (W - R);
			}
			
			if(costA > costB) {
				System.out.printf("#%d %d\n",test_case,costB);
			}else {
				System.out.printf("#%d %d\n",test_case,costA);
			}
		}
	}
}
