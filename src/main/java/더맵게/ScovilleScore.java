package 더맵게;

import java.util.*;

public class ScovilleScore {

    public int solution(int[] scoville, int K) {
        int answer = 0;
        Queue<Integer> priorityQueue = new PriorityQueue<Integer>();
        for (int i : scoville) {
            priorityQueue.offer(i);
        }
        int a=0,b=0,result=0;
        while (priorityQueue.size()>0) {
            if (priorityQueue.peek()>=K){
                return answer;
            }
            try {
                a = priorityQueue.poll();
                b = priorityQueue.poll();
                result = a + (b * 2);
                priorityQueue.offer(result);
                answer++;
            }catch (NullPointerException e){
                return -1;
            }
        }

        return -1;
    }

}
