package 원소정렬;

import lombok.extern.java.Log;

import java.util.EmptyStackException;
import java.util.Stack;


@Log
public class Solution {

    public String solution(String index_list) {
        String answer = "";
        Stack<String> element = new Stack<String>();
        Stack<Integer> number = new Stack<Integer>();
        for (int i = 0; i < index_list.length(); i++) {
            int index = index_list.charAt(i);
            if (index >= 65 && index < 97) {
                element.push(Character.toString(index_list.charAt(i)));
            } else if (index >= 97) {
                String tmp = element.pop();
                element.push(tmp + index_list.charAt(i));
            } else {
                int getNumber = Character.getNumericValue(index_list.charAt(i));
                number.push(getNumber);

            }
        }

        try {
            while (!element.isEmpty() || !number.isEmpty()) {

                if (number.peek() == 1) {
                    number.pop();
                    answer = element.pop() + answer;
                } else {
                    answer = element.pop() + number.pop() + answer;
                }
            }
        } catch (EmptyStackException e) {
            answer = "error";
        }
        return answer;
    }
}
