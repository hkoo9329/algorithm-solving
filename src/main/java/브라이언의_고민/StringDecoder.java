package 브라이언의_고민;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StringDecoder {

    private final String ERROR = "invalid";

    public String solution(String sentence) {
        Queue<Character> queue = new LinkedList<>();
        String answer = "";
        if (sentence.length() == 0 || sentence.contains(" ")) {
            return ERROR;
        }
        char splitchar = ' ';
        int counter = 0;
        for (char ch : sentence.toCharArray()){
            queue.add(ch);
        }
//
//        for (int i = 0; i < sentence.length(); i++) {
//            char tempCh = sentence.charAt(i);
//            if (isLowCase(tempCh)) {
//                if (counter == 0) {
//                    splitchar = tempCh;
//                    counter++;
//                } else if (splitchar == tempCh) {
//                    counter++;
//                } else if (splitchar != tempCh) {
//                    if (counter == 2)
//                        answer += queue.toString();
//                    else if (counter > 2) {
//                        while (queue.size() > 1) {
//                            answer += queue.poll();
//                        }
//                    }
//                    counter = 0;
//                }
//            } else {
//                queue.add(tempCh);
//            }
//
//        }
        return answer;
    }

    public boolean isLowCase(char ch) {
        return (ch >= 97 && ch <= 122);
    }

}
