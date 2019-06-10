package 기능개발;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class FunctionDev {

    public int[] solution(int[] progresses, int[] speeds) {

        ArrayList<Integer> answers = new ArrayList<>();
        Queue<Integer> progresses_queue = new LinkedList<>();
        Queue<Integer> speeds_queue = new LinkedList<>();

        for (int i : progresses) {
            progresses_queue.add(i);
        }
        for (int j : speeds){
            speeds_queue.add(j);
        }

        while (!progresses_queue.isEmpty()) {
            int result = 0;
            int work, speed;

            for (int i=0;i<progresses_queue.size();i++) {
                work = progresses_queue.poll();
                speed = speeds_queue.poll();
                work += speed;
                progresses_queue.add(work);
                speeds_queue.add(speed);
            }

            while (!progresses_queue.isEmpty() &&
                    progresses_queue.peek() > 100) {
                result++;
                progresses_queue.poll();
                speeds_queue.poll();
            }
            if (result>0){
                answers.add(result);
            }
        }

        int[] answer = new int[answers.size()];
        int size = 0;
        for (int i : answers) {
            answer[size++] = i;
        }
        return answer;
    }
}
