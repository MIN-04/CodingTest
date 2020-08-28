package difficulty.level02;

import java.util.Arrays;
import java.util.Scanner;

public class no1984 {
	
	/**
	 * 1984. 중간 평균값 구하기
	*/
	
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++)
		{
			int[] num = new int[10];
			int sum = 0;
			int avg = 0;
			
			for(int i=0; i<10; i++) {
				num[i] = sc.nextInt();
			}
			
			Arrays.sort(num);
			
			for(int i=1; i<9; i++) {
				sum += num[i];
			}
			
			avg = (int) Math.round((double)sum/8);
			
			System.out.printf("#%d %d\n",test_case,avg);
		}
	}
}
