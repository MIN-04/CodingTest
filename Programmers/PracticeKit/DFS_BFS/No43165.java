class Solution {
    /**
      깊이/너비 우선 탐색(DFS/BFS) - 타겟 넘버
    */
    
    static int answer = 0;
    
    public int solution(int[] numbers, int target) {
        
        dfs(numbers,target,0);
        return answer;
    }
    
    public static void dfs(int[] numbers, int target, int node){
        if(node == numbers.length){
            int sum = 0;
            for(int i = 0; i<numbers.length; i++){
                sum += numbers[i];
            }
            if(sum == target){
                answer++;
                return;
            }
        }else{
            numbers[node] *= 1;
            dfs(numbers,target,node + 1);
            
            numbers[node] *= -1;
            dfs(numbers,target,node + 1);
        }
    }
}
