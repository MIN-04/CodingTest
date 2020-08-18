package difficulty.level01;

import java.util.Scanner;

public class no1936 {
	
	/**
	 * 1936. 1대1 가위바위보
	*/
	
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		switch (A) {
		case 1:
			if(B==2) {
				System.out.print("B");
			}else {
				System.out.print("A");
			}
			break;
		case 2:
			if(B==1) {
				System.out.print("A");
			}else {
				System.out.print("B");
			}
			break;
		default:
			if(B==1) {
				System.out.print("B");
			}else {
				System.out.print("A");
			}
			break;
		}
		
	}
}
