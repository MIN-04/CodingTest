package difficulty.level01;

import java.util.Scanner;

public class no1545 {
	
	/**
	 * 1545. 거꾸로 출력해 보아요
	*/
	
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		
		for(int test_case = T; test_case >= 0; test_case--)
		{
			if(test_case>0) {
				System.out.print(test_case+" ");
			}else {
				System.out.print(test_case);
			}
		}
	}
}
