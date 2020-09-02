package level.bronze01;

import java.util.Scanner;

public class No1110 {
	
	/**
	 	Bronze01 - 1110. 더하기 사이클
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int first = sc.nextInt();
		int newNum = 0; //새로운 수
		int num = 0; //각 자리의 숫자 더한 값
		int cnt = 0; //횟수
		int[] arr = new int[2];
		
		arr[0] = first/10;
		arr[1] = first%10;
		
		while(true) {
			num = arr[0] + arr[1];
			newNum = arr[1]*10 + num%10;
			cnt++;
			if(newNum == first) break;
			arr[0] = arr[1];
			arr[1] = num%10;
		}
		
		System.out.print(cnt);
		
	}
}
