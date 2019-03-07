package 카카오무지의먹방라이브;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.*;


@Slf4j
@Data
public class Solution {
    private List<Integer> list;

    public int solution(int[] food_times, long k) {
        list = new ArrayList<Integer>();

        int answer =-1;
        for(int i : food_times){
            list.add(i);
        }
        Collections.sort(list);


        return answer;
    }

    public String toString() {
        String s = "";
        int count =1;
        for (int i : list) {
            s+=count+" : "+i+"\n";
            count++;
        }
        return s;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] testCase = {3, 1, 2};
        int[] testCase2 = {1, 1, 1};
        System.out.println(solution.solution(testCase, 5));
        System.out.println(solution);

    }
}
