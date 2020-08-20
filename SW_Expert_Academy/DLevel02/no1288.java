package difficulty.level02;

import java.util.Scanner;

public class no1288 {
	
	/**
	 * 1288. 새로운 불면증 치료법
	*/
	
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++)
		{
			int N = sc.nextInt();
			int[] num = new int[10];
			boolean bool = true;
			int mul = 0;
			
			while(bool) {
				int cnt = 0;
				mul++;
				
				String[] array = Integer.toString(N*mul).split("");
				
				for(int i=0;i<array.length;i++) {
					int j = Integer.valueOf(array[i]);
					num[j] += 1;
				}

				for(int i=0;i<num.length;i++) {
					if(num[i]==0) {
						cnt++;
					}
				}
				
				if(cnt==0) {
					System.out.printf("#%d %d\n",test_case,N*mul);
					bool = false;
				}
			}
			
		}
		
		
		
	}
}
