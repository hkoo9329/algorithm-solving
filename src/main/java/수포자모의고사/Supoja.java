package 수포자모의고사;

import java.util.ArrayList;

public class Supoja {
    public int[] solution(int[] answers){
        int[] n1 = {1,2,3,4,5};
        int[] n2 = {2,1,2,3,2,4,2,5};
        int[] n3 = {3,3,1,1,2,2,4,4,5,5};
        int[] score = new int[3];
        for (int i=0;i<answers.length;i++){
            if (answers[i] == n1[i%n1.length]){
                score[0]++;
            }
            if (answers[i] == n2[i%n2.length]){
                score[1]++;
            }
            if (answers[i] == n3[i%n3.length]){
                score[2]++;
            }
        }

        int max = Math.max(score[0],Math.max(score[1],score[2]));
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i=0;i<score.length;i++){
            if (max == score[i]){
                list.add(i+1);
            }
        }
       return list.stream().mapToInt(i-> i.intValue()).toArray();
    }
}
