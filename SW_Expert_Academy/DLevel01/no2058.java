package difficulty.level01;

import java.util.Arrays;
import java.util.Scanner;

public class no2058 {
	
	/**
	 * 2058. 자릿수 더하기
	*/
	
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		
		int result = 0;
		int num = 1000;
		
		while(T>0) {
			result += T / num;
			T -= (T / num) * num;
			num /= 10;
		}
		
		System.out.println(result);
		
	}
}
