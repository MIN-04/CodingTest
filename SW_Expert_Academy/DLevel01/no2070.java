package difficulty.level01;

import java.util.Scanner;

public class no2070 {
	
	/**
	 * 2070. Å« ³ð, ÀÛÀº ³ð, °°Àº ³ð
	*/
	
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
			int left = sc.nextInt();
			int right = sc.nextInt();
			char t = ' ';
			
			if(left < right) {
				t = '<';
			}else if(left > right) {
				t = '>';
			}else {
				t = '=';
			}
			
			System.out.printf("#%d %c\n",test_case,t);

		}
	}
}
