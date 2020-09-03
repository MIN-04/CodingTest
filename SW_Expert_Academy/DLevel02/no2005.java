package difficulty.level02;

import java.util.Scanner;

public class no2005 {
	
	/**
	 * 2005. 파스칼의 삼각형
	*/
	
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++)
		{
			int num = sc.nextInt();
			int[][] arr = new int[num][num];
			arr[0][0] = 1;
			for(int i=1; i<num; i++) {
				for(int j=0; j<=i; j++) {
					if(j==0 || j==i) {
						arr[i][j] = 1;
					}else {
						arr[i][j] = arr[i-1][j-1]+arr[i-1][j];
					}
				}
			}
			System.out.printf("#%d\n",test_case);
			for(int i=0; i<num; i++) {
				for(int j=0; j<=i; j++) {
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
			}
			
		}
	}
}
