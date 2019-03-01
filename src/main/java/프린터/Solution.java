package 프린터;

import java.util.*;

public class Solution {


    public int solution(int[] priorities, int location) throws IllegalAccessException {
        int answer = 0;
        List<Integer> list = new ArrayList<Integer>();
        for (int priority : priorities) {
            list.add(priority);
        }
        int counter=1;
        while(!list.isEmpty()){
            int temp = list.get(0);
            if(list.stream().anyMatch(v->temp<v)){
                list.add(list.remove(0));
            }else {
                if(location==0){
                    return counter;
                }
                list.remove(0);
                counter++;
            }
            if (location>0){
                location--;
            }else{
                location = list.size()-1;
            }
        }
        throw new IllegalAccessException();
    }

}
