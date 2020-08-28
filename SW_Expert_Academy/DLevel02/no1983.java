package difficulty.level02;

import java.util.Arrays;
import java.util.Scanner;

public class no1983 {
	
	/**
	 * 1983. 조교의 성적 매기기
	*/
	
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		
		String[] grade = {"A+","A0","A-","B+","B0","B-","C+","C0","C-","D0"};
		
		for(int test_case = 1; test_case <= T; test_case++)
		{
			int N = sc.nextInt(); //N명의 학생
			int K = sc.nextInt(); //K번째 학생 
			
			double[] score = new double[N]; //학생들 점수
			double kScore = 0; //K의 점수
			int index = 0; //K가 몇번째에 있는지
			
			for(int i=0; i<N; i++) {
				int mid = sc.nextInt(); //중간고사 점수
				int last = sc.nextInt(); //기말고사 점수
				int work = sc.nextInt(); //과제 점수
				
				score[i] = (mid*0.35 + last*0.45 + work*0.2);
			}
			
			kScore = score[K-1];
			Arrays.sort(score);
			
			for(int i=0; i<score.length; i++) {
				if(score[i] == kScore) {
					index = i;
					break;
				}
			}
			
			System.out.printf("#%d %s\n",test_case,grade[(N-index-1)/(N/10)]);
		}
	}
}
