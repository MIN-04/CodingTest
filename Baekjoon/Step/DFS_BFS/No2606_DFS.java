package step.step28.dfsbfs;

import java.util.Scanner;

public class No2606_DFS {
	/**
	 * 단계 28 - DFS와 BFS
	 * no.2606 바이러스
	 */
	
	static int answer = 0; //감염된 컴퓨터 수
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); //컴퓨터의 수
		int E = sc.nextInt(); //연결된 컴퓨터 쌍
		
		int[][] computers = new int[N][N]; //컴퓨터 배열
		boolean[] visited = new boolean[N]; //방문한 노드
		
		
//		for(int i=0; i<N; i++) {
//			computers[i][i] = 1;
//		}
		
		for(int i=0; i<E; i++) {
			int row = sc.nextInt();
			int col = sc.nextInt();
			
			computers[row-1][col-1] = 1;
			computers[col-1][row-1] = 1;
		}
		
		if(!visited[0]) {
			dfs(0,computers,visited);
		}
				
		System.out.print(answer);
		sc.close();
		
	}
	
	public static void dfs(int i, int[][] computers, boolean[] visited) {
		visited[i] = true;
		
		for(int j=0; j<computers.length; j++) {
			if(i!=j && visited[j]==false && computers[i][j]==1) {
				dfs(j,computers,visited);
				answer++;
			}
		}
	}

}
