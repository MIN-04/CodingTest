package difficulty.level01;

import java.util.Scanner;

public class no1933 {
	
	/**
	 * 1933. 간단한 N의 약수
	*/
	
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++)
		{
			if(T%test_case==0 && test_case<T) {
				System.out.print(test_case+" ");
			}else if(test_case == T) {
				System.out.print(test_case);
			}
		}
	}
}
