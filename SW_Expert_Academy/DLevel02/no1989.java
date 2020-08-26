package difficulty.level02;

import java.util.Scanner;

public class no1989 {
	
	/**
	 * 1989. 초심자의 회문 검사
	*/
	
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++)
		{
			char[] ch = sc.next().toCharArray();
			boolean bool = false;
			for(int i=0;i<ch.length/2;i++) {
				if(ch[i] == ch[ch.length-1-i]) {
					bool = true;
				}else {
					bool = false;
				}
			}
			
			if(bool) {
				System.out.printf("#%d %d\n",test_case,1);
			}else {
				System.out.printf("#%d %d\n",test_case,0);
			}
		}
	}
}
