import org.junit.Test;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import static org.junit.Assert.*;

public class 기능개발 {


    @Test
    public void 기능개발_테스트() {
        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 30, 5};
        int[] answer;
        List<Integer> answerList = new LinkedList<>();
        Queue<Integer> progressQueue = new LinkedList<Integer>();
        Queue<Integer> speedsQueue = new LinkedList<>();
        for (int i = 0; i < progresses.length; i++) {
            progressQueue.add(progresses[i]);
            speedsQueue.add(speeds[i]);
        }
        while (!progressQueue.isEmpty()) {
            int count = 0;
            while (progressQueue.peek() >= 100) {
                progressQueue.poll();
                speedsQueue.poll();
                count++;
            }
            if (count != 0) {
                answerList.add(count);
                continue;
            }

            for (int speed : speedsQueue) {
                progressQueue.add(progressQueue.poll() + speed);
            }
        }
        answer = new int[answerList.size()];
        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
            System.out.println(answer[i]);
        }


    }
}
