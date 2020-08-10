package difficulty.level01;

import java.util.Arrays;
import java.util.Scanner;

public class no2063 {
	
	/**
	 * 2063. 중간값 찾기
	*/
	
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		int[] arr = new int[T];
		for(int test_case = 1; test_case <= T; test_case++)
		{
			arr[test_case - 1] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		System.out.println(arr[T/2]);
		
		
	}
}
