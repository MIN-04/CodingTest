package difficulty.level01;

import java.util.Scanner;

public class no2029 {
	
	/**
	 * 2029. 몫과 나머지 출력하기
	*/
	
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			System.out.printf("#%d %d %d\n",test_case,a/b,a%b);
		}
	}
}
