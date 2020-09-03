package difficulty.level02;

import java.util.Scanner;

public class no1959 {
	
	/**
	 * 1959. 두 개의 숫자열
	*/
	
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++)
		{
			//N개의 숫자, M개의 숫자
			int N = sc.nextInt();
			int M = sc.nextInt();
			//배열
			int[] A = new int[N];
			int[] B = new int[M];
			//배열의 초기화
			for(int i=0; i<N; i++) {
				A[i] = sc.nextInt();
			}
			for(int i=0; i<M; i++) {
				B[i] = sc.nextInt();
			}
			//최대값을 담을 변수
			int max = 0;
			
			if(N>M) {
				for(int i=0; i<=N-M; i++) {
					int sum = 0;
					for(int j=0; j<M; j++) {
						sum += A[i+j]*B[j];
					}
					if(max<sum) max = sum;
				}
			}else {
				for(int i=0; i<=M-N; i++) {
					int sum = 0;
					for(int j=0; j<N; j++) {
						sum += A[j]*B[i+j];
					}
					if(max<sum) max = sum;
				}
			}
			System.out.printf("#%d %d\n",test_case,max);
			
		}
	}
}
