package 카카오실패율;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class FailureRateSolution {
    private List<stages_fails> list;

    class stages_fails {
        private int stage_number;
        private float rate;

        public stages_fails(int stage_number, float rate) {
            this.stage_number = stage_number;
            this.rate = rate;
        }
    }

    Comparator<stages_fails> ComparaRate = new Comparator<stages_fails>() {
        @Override
        public int compare(stages_fails o1, stages_fails o2) {
            if (o1.rate > o2.rate) {
                return -1;
            } else if (o1.rate < o2.rate) {
                return 1;
            } else {
                if (o1.stage_number > o2.stage_number)
                    return 1;
                else if (o1.stage_number < o2.stage_number) {
                    return -1;
                } else
                    return 0;
            }
        }
    };

    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        list = new ArrayList<stages_fails>();
        int size = stages.length;
        int[] user = new int[N + 1];
        for (int i : stages) {
            user[i - 1]++;
        }
        for (int i = 0; i < N; i++) {
            if (user[i] == 0)
                list.add(new stages_fails(i + 1, 0));
            else {
                list.add(new stages_fails(i + 1, (float) user[i] / size));
                size -= user[i];
            }
        }
        list.sort(ComparaRate);
        for (int i = 0; i < N; i++) {
            answer[i] = list.get(i).stage_number;
        }
        return answer;
    }

    public static void main(String[] args) {
        FailureRateSolution solution = new FailureRateSolution();

        int N = 4;
        int[] stages2 = {4, 4, 4, 4, 4};
        for (int i : solution.solution(N, stages2)) {
            System.out.println(i);
        }

    }
}