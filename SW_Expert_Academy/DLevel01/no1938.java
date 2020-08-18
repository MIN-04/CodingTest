package difficulty.level01;

import java.util.Scanner;

public class no1938 {
	
	/**
	 * 1938. 아주 간단한 계산기
	*/
	
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.printf("%d\n%d\n%d\n%d",a+b,a-b,a*b,a/b);
	}
}
