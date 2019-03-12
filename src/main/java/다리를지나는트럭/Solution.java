package 다리를지나는트럭;

import lombok.extern.slf4j.Slf4j;

import java.util.*;

@Slf4j
public class Solution {
    class Truck {
        int weight;
        int time;

        public Truck(int weight, int time) {
            this.weight = weight;
            this.time = time;
        }
    }

    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Truck> bridge_list = new LinkedList<Truck>();
        Queue<Integer> truck_list = new LinkedList<Integer>();
        for(int i : truck_weights){
            truck_list.add(i);
        }
        int totalTime = 1;
        int bridge_weight = truck_list.peek();
        bridge_list.add(new Truck(truck_list.poll(), bridge_length));
        while (!bridge_list.isEmpty()) {
            for(Truck t : bridge_list){
                t.time--;
            }
            if(bridge_list.peek().time<=0){
                bridge_weight-=bridge_list.peek().weight;
                bridge_list.poll();
            }

            if(!truck_list.isEmpty() && bridge_weight+truck_list.peek()<=weight){
                bridge_weight+=truck_list.peek();
                bridge_list.add(new Truck(truck_list.poll(),bridge_length));
            }
            ++totalTime;
        }
        return totalTime;
    }
}
