package difficulty.level02;

import java.util.Scanner;

public class no1926 {
	
	/**
	 * 1926. 간단한 369게임
	*/
	
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++)
		{
			String num = Integer.toString(test_case);
			char[] numChar = num.toCharArray();
			int cnt = 0;
			
			for(int i=0; i<numChar.length; i++) {
				if(numChar[i] == '3' || numChar[i] == '6' || numChar[i] == '9') {
					cnt++;
				}
			}
			
			if(cnt==0) {
				System.out.print(num+" ");
			}else {
				for(int i=0; i<cnt; i++) {
					System.out.print("-");
				}
				System.out.print(" ");
			}
		}
	}
}
