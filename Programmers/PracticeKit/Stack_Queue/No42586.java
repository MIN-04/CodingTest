// 문제가 개편되었습니다. 이로 인해 함수 구성이나 테스트케이스가 변경되어, 과거의 코드는 동작하지 않을 수 있습니다.
// 새로운 함수 구성을 적용하려면 [코드 초기화] 버튼을 누르세요. 단, [코드 초기화] 버튼을 누르면 작성 중인 코드는 사라집니다.
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {

    /**
      스택/큐 - 기능개발
    */

    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> que = new LinkedList<Integer>();
        List<Integer> list = new ArrayList<Integer>();
        int day = 0;
        for(int i=0; i<speeds.length; i++){
            day = (int) Math.ceil((double)(100-progresses[i])/speeds[i]);
            que.offer(day);
        }
        
        int standard = que.poll();
        int cnt = 1;
        
        while(!que.isEmpty()) {
            day = que.poll();
            
        	if(standard >= day) {
        		cnt++;
        	}else {
        		list.add(cnt);
                standard = day;
        		cnt = 1;
        	}
        }
        list.add(cnt);
        
        int[] answer = new int[list.size()];
        for(int i=0;i<answer.length;i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}
