package 체육복;

import lombok.extern.slf4j.Slf4j;

import java.util.*;

@Slf4j
public class LostGymSuit {
    //나의 코드
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = reserve.length;
        List<Integer> list = new LinkedList<>();
        for (int i : reserve) {
            list.add(i);
        }
        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < list.size(); j++) {
                if (((list.get(j) - 1) == lost[i]) || ((list.get(j) + 1) == lost[i])) {
                    list.remove(j);
                }
            }
        }

        return (n - (lost.length - (answer - list.size())));
    }

    public int solution_v2(int n, int[] lost, int[] reserve) {
        List<Integer> lostList = new ArrayList<>();
        List<Integer> reserveList = new ArrayList<>();

        for (int i : lost) {
            lostList.add(i);
        }
        for (int i : reserve) {
            reserveList.add(i);
        }

        for (int i = 0; i < lostList.size(); i++) {
            for (int j = 0; j < reserveList.size(); j++) {
                if (lostList.get(i) == reserveList.get(j)) {
                    reserveList.remove(j);
                    lostList.remove(i);
                    i--;
                    break;
                }
            }
        }
        int answer = n - lostList.size();
        for (int i = 0; i < lostList.size(); i++) {
            int lost_num = lostList.get(i);
            for (int j = 0; j < reserveList.size(); j++) {
                int reserve_num = reserveList.get(j);
                if (Math.abs(reserve_num-lost_num)==1) {
                    reserveList.remove(j);
                    answer++;
                    break;
                }
            }
        }

        return answer;
    }


    //다른 사람 코드

    public int other_solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        answer = n;

        for (int i = 0; i < lost.length; i++) {
            boolean rent = false;
            int j = 0;
            while (!rent) {
                if (j == reserve.length) break;
                if (lost[i] == reserve[j]) {
                    reserve[j] = -1;
                    rent = true;
                } else if (lost[i] - reserve[j] == 1) {
                    reserve[j] = -1;
                    rent = true;
                } else if (lost[i] - reserve[j] == -1) {
                    reserve[j] = -1;
                    rent = true;
                } else {
                    j++;
                }
            }
            if (!rent) answer--;
        }
        return answer;
    }

}
