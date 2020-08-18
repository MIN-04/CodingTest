package difficulty.level01;

import java.util.Scanner;

public class no2019 {
	
	/**
	 * 2019. 더블더블
	*/
	
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		
		int num = 1;
		
		for(int test_case = 1; test_case <= T+1; test_case++)
		{
			if(test_case == 1) {
				System.out.print(test_case + " ");
			}else if(test_case != 1 && test_case < T+1) {
				num *= 2;
				System.out.print(num + " ");
			}else {
				num *= 2;
				System.out.print(num);
			}
		}
	}
}
