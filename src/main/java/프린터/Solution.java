package 프린터;

import java.util.*;

public class Solution {
    class Documents {
        private int location;
        private int priority;

        public Documents(int location, int priority) {
            this.location = location;
            this.priority = priority;
        }

    }
    LinkedList<Documents> list;

    public int solution(int[] priorities, int location) {
        int answer = 0;
        int max = 0;
        list = new LinkedList<Documents>();

        for (int i = 0; i < priorities.length; i++) {
            Documents document = new Documents(i, priorities[i]);
            list.add(document);
        }
        Documents temp;
        int counter = 1;
        while (!list.isEmpty()) {
            max = findMaxNumber();
            temp = list.poll();
            if (max == temp.priority) {
                if (location == temp.location) {
                    answer = counter;
                    return answer;
                }

                counter++;
            } else {
                list.addLast(temp);
            }

        }
        return answer;
    }

    private int findMaxNumber() {
        int max = 0;
        for (int i = 0; i < list.size(); i++) {
            if (max < list.get(i).priority) {
                max = list.get(i).priority;
            }
        }

        return max;
    }
}
