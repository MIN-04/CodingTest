package difficulty.level01;

import java.util.Scanner;

public class no2025 {
	
	/**
	 * 2025. N¡Ÿ µ°º¿
	*/
	
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		
		int num = 0;
		
		for(int test_case = 1; test_case <= T; test_case++)
		{
			num += test_case;
		}
		System.out.print(num);
	}
}
