class Solution {
    /**
      깊이/너비 우선 탐색(DFS/BFS) - 네트워크
    */
    
    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] visited = new boolean[n];
        
        for(int i=0; i<n; i++){
            if(!visited[i]){
                dfs(i,computers,visited);
                answer++;
            }
        }
        return answer;
    }
    
    public static void dfs(int i, int[][] computers, boolean[] visited){
        visited[i] = true;
        
        for(int j=0; j<computers.length; j++){
            if(i!=j && visited[j]==false && computers[i][j]==1){
                dfs(j,computers,visited);
            }
        }
    }
}
