package difficulty.level01;

import java.util.Scanner;

public class no2050 {
	
	/**
	 * 2050. 알파벳을 숫자로 변환
	*/
	
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		String T;
		T=sc.next();
		char[] al = T.toCharArray();

		for(int test_case = 0; test_case < al.length; test_case++)
		{
			if(test_case < al.length-1) {
				System.out.printf(al[test_case]-64 + " ");
			}else {
				System.out.print(al[test_case]-64);
			}
		}
	}
}
