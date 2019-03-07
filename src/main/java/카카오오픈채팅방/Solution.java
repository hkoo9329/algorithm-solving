package 카카오오픈채팅방;

import java.util.HashMap;

public class Solution {

    public String[] solution(String[] record){
        HashMap<String,String> map = new HashMap<String,String>();
        int count=0;
        for(String log : record){
            String[] s=log.split(" ");
            switch (s[0]){
                case "Enter":
                    map.put(s[1],s[2]);
                    count++;
                    break;
                case "Change":
                    map.put(s[1],s[2]);
                    break;
                case "Leave":
                    count++;
                    break;
            }
        }
        String[] answer =new String[count];
        count=0;
        for(String s : record){
            String[] st = s.split(" ");

            switch (st[0]){
                case "Enter":
                    if(map.containsKey(st[1])){
                        answer[count++] = map.get(st[1])+"님이 들어왔습니다.";
                    }
                    break;
                case "Leave":
                    if(map.containsKey(st[1])){
                        answer[count++] = map.get(st[1])+"님이 나갔습니다.";
                    }
            }
        }
        return answer;
    }
}
