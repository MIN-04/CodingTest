import java.util.*;

class Solution {
    /**
      완전탐색 - 모의고사
    */

    public int[] solution(int[] answers) {
        int[] answer = {};
        
        int[] su01 = {1,2,3,4,5};
        int[] su02 = {2,1,2,3,2,4,2,5};
        int[] su03 = {3,3,1,1,2,2,4,4,5,5};
        int[] cnt = new int[3];
        List<Integer> list = new ArrayList<>();
        
        for(int i=0; i<answers.length; i++){
            if(answers[i] == su01[i%5]) cnt[0]++;
            if(answers[i] == su02[i%8]) cnt[1]++;
            if(answers[i] == su03[i%10]) cnt[2]++;
        }
        
        int max = cnt[0];
        
        for(int i=1; i<cnt.length; i++){
            if(max < cnt[i]){
                max = cnt[i];
            }
        }
        
        for(int i=0; i<cnt.length; i++){
            if(cnt[i]==max){
                list.add(i);
            }
        }
        answer = new int[list.size()];
        for(int i=0; i<answer.length; i++){
            answer[i] = list.get(i)+1;
        }
        Arrays.sort(answer);
               
        return answer;
    }
}
