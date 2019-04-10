package 연속된_숫자_제거;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public int[] solution(int[] arr){
        int[] answer = {};
        int temp = arr[0];
        List<Integer> tempArray = new ArrayList<Integer>();
        for (int i : arr){
            if(temp==i){
                continue;
            }else {
                tempArray.add(temp);
                temp = i;
            }
        }
        if(tempArray.get(tempArray.size()-1)!=temp||
        tempArray.size()==0){
            tempArray.add(temp);
        }
        answer = new int[tempArray.size()];
        for (int i=0;i<answer.length;i++){
            answer[i] = tempArray.get(i);
        }
        return answer;
    }
}
