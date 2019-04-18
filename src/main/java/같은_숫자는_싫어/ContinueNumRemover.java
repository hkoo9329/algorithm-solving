package 같은_숫자는_싫어;

import java.util.*;

public class ContinueNumRemover {

    public int[] solution(int[] arr){
        int[] answer = {};
        Deque<Integer> queue = new ArrayDeque<>();
        for(int i : arr){
            if (queue.isEmpty()){
                queue.add(i);
            }
            else{
                if (queue.peekLast()==i){
                    continue;
                }else{
                    queue.add(i);
                }
            }
        }
        answer = new int[queue.size()];
        for (int i=0;i<answer.length;i++){
            answer[i] = queue.poll();
        }
        return answer;
    }
}
