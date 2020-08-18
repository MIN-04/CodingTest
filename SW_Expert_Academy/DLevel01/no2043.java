package difficulty.level01;

import java.util.Scanner;

public class no2043 {
	
	/**
	 * 2043. 서랍의 비밀번호
	*/
	
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		String T;
		T=sc.nextLine();
		
		int index = T.indexOf(" ");
		String P = T.substring(0, index);
		String K = T.substring(index+1);
		
		int num = 0;
		int numP = Integer.valueOf(P);
		int numK = Integer.valueOf(K);
		
		while(numP != numK) {
			numK += 1;
			num++;
		}
		
		if(num!=0) num++;
		
		System.out.print(num);
	}
}
