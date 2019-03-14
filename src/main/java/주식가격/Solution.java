package 주식가격;
import java.util.*;
public class Solution {

    public int[] solution(int[] prices){
        List<Integer> list =new ArrayList<>();
        Collections.sort(list);
        int[] answer = new int[prices.length];
        for(int i=0;i<prices.length;i++){
            int tmp = prices[i];
            int time_counter=0;
            for(int j=i+1;j<prices.length;j++){
                if(tmp<=prices[j]){
                    time_counter++;
                }else{
                    time_counter++;
                    break;
                }
            }
            answer[i] = time_counter;
        }
        return answer;
    }

}
