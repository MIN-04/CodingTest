package difficulty.level02;

import java.util.Scanner;

public class no2001 {
	
	/**
	 * 2001. 파리 퇴치
	*/
	
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++)
		{
			//배열의 크기
			int N = sc.nextInt();
			int[][] arr = new int[N][N];
			//파리채 크기
			int M = sc.nextInt();
			//최대로 죽인 파리 수
			int max = 0;
			
			//배열 초기화
			for(int i=0; i<N; i++) {
				for(int j=0; j<N; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			
			for(int i=0; i<=N-M; i++) {
				for(int j=0; j<=N-M; j++) {
					int sum = getSum(i,j,M,arr);
					if(max<sum) max = sum;
				}
			}
			
			System.out.printf("#%d %d\n",test_case,max);
		}
	}
	
	public static int getSum(int A, int B, int M, int[][] arr) {
		int sum = 0;
		for(int i=A; i<A+M; i++) {
			for(int j=B; j<B+M; j++) {
				sum += arr[i][j];
			}
		}
		return sum;
	}
}
