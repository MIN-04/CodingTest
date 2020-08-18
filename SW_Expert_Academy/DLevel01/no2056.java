package difficulty.level01;

import java.util.Scanner;

public class no2056 {
	
	/**
	 * 2056. 연월일 달력
	*/
	
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
			String date = sc.next();
			
			if(date.substring(0) == "0") {
				System.out.printf("#%d -1\n",test_case);
			}else if(date.substring(4) == "0" &&  date.substring(5) == "0") {
				System.out.printf("#%d -1\n",test_case);
			}else {
				String year = date.substring(0,4);
				String month = date.substring(4, 6);
				String day = date.substring(6, 8);
				int numDay = Integer.valueOf(day);
				
				switch (month) {
				case "04": case "06": case "09": case "11":
					if(numDay>=1 && numDay <=30) {
						System.out.printf("#%d %s/%s/%s\n",test_case,year,month,day);
					}else {
						System.out.printf("#%d -1\n",test_case);
					}
					break;
				case "02":
					if(numDay>=1 && numDay <=28) {
						System.out.printf("#%d %s/%s/%s\n",test_case,year,month,day);
					}else {
						System.out.printf("#%d -1\n",test_case);
					}
					break;
				case "00":
					System.out.printf("#%d -1\n",test_case);
					break;
				default:
					if(numDay>=1 && numDay <=31) {
						System.out.printf("#%d %s/%s/%s\n",test_case,year,month,day);
					}else {
						System.out.printf("#%d -1\n",test_case);
					}
					break;
				}
			}
		}
	}
}
