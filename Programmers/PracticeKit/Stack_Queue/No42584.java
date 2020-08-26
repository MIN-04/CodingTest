class Solution {
    /**
        스택/큐 - 주식가격
    */
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];

        for(int i=0;i<prices.length-1;i++){
            int index = prices.length - 1;
            for(int j=i+1;j<prices.length;j++){
                if(prices[i]>prices[j]){
                    index = j;
                    break;
                }
            }
            answer[i] = index - i;
        }
        
        return answer;
    }
}
