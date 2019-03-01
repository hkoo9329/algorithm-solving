package 완주못한선수;

import java.util.HashMap;

public class Solution {

    public String solution(String[] participant, String[] completion){
        HashMap<String,Integer> map = new HashMap<String, Integer>();

        for(String person: participant){
            if(!map.containsKey(person)){
                map.put(person, 1);
            }
            else{
                map.put(person, map.get(person)+1);
            }
        }
        for(String person: completion){
            if(map.containsKey(person)){
                map.put(person, map.get(person)-1);
            }
        }
        for(String person: map.keySet()){
            if(map.get(person).equals(1)){
                return person;
            }
        }
        throw new RuntimeException();
    }
}
