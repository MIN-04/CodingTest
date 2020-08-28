package difficulty.level02;

import java.util.Arrays;
import java.util.Scanner;

public class no1966 {
	
	/**
	 * 1966. 숫자를 정렬하자
	*/
	
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++)
		{
			int N = sc.nextInt(); //숫자열
			int[] arr = new int[N]; //숫자를 담을 배열
			
			for(int i=0; i<N; i++) {
				arr[i] = sc.nextInt();
			}
			
			Arrays.sort(arr);
			
			System.out.printf("#%d ",test_case);
			for(int i:arr) {
				System.out.printf("%d ",i);
			}
			System.out.println();
		}
	}
}
