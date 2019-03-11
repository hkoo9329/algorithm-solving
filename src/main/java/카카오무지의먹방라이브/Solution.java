package 카카오무지의먹방라이브;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.*;


@Slf4j
@Data
public class Solution {
    private List<Food_info> food_list;

    private class Food_info {
        private int index;
        private int food_time;
        public Food_info(int index, int food_time){
            this.index = index;
            this.food_time = food_time;
        }

    }
    Comparator<Food_info> foodTime = new Comparator<Food_info>() {
        @Override
        public int compare(Food_info food1, Food_info food2) {
            return food1.food_time-food2.food_time;
        }
    };
    Comparator<Food_info> foodIndex = new Comparator<Food_info>() {
        @Override
        public int compare(Food_info index1, Food_info index2) {
            return index1.index - index2.index;
        }
    };


    public int solution(int[] food_times, long k) {
        food_list = new ArrayList<Food_info>();
        int n = food_times.length;
        for(int i=0;i<n;i++){
            food_list.add(new Food_info(i+1,food_times[i]));
        }

        food_list.sort(foodTime);
        int pretime = 0;
        int number=0;
        long diff = 0, spend = 0;

        for(Food_info f : food_list){
            diff = f.food_time - pretime;
            if(diff != 0){
                spend = diff * n;
                if(spend <= k){
                    k-=spend;
                    pretime = f.food_time;
                }else{
                    k%=n;
                    food_list.subList(number,food_times.length).sort(foodIndex);
                    return food_list.get(number+(int)k).index;
                }
            }
            ++number;
            --n;
        }

        return -1;
    }

    public String toString() {
        String food_list_toString="";
        for(Food_info f : food_list){
            food_list_toString =+ f.food_time+"  "+f.index+"\n";
        }
        return food_list_toString;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] testCase = {3, 1, 2};
        int[] testCase2 = {1, 1, 1};
        System.out.println(solution.solution(testCase, 5));

        System.out.println(solution);

    }
}
