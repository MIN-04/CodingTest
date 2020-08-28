package difficulty.level02;

import java.util.Scanner;

public class no1976 {
	
	/**
	 * 1976. 시각 덧셈
	*/
	
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++)
		{
			int[] time = new int[4];
			int h = 0; //시
			int m = 0; //분
			
			for(int i=0; i<4; i++) {
				time[i] = sc.nextInt();
			}
			
			// 시 구하기
			if((time[0] + time[2])/12 !=0) {
				h = (time[0] + time[2]) - 12;
			}else {
				h = time[0] + time[2];
			}
			
			// 분 구하기
			if((time[1] + time[3])/60 != 0) {
				m = (time[1] + time[3]) - 60;
				h += 1;
			}else {
				m = time[1]+time[3];
			}
			
			System.out.printf("#%d %d %d\n",test_case,h,m);
		}
	}
}
