package 쇠막대기;

import java.util.Stack;

public class Solution {

    // 나의 풀이
    public int solution(String arrangement) {
        int answer = 0;
        Stack<String> st = new Stack<String>();

        for (int i = 0; i < arrangement.length(); i++) {
            String token = String.valueOf(arrangement.charAt(i));
            if (token.equals("(")){
                st.push("(");
                if(arrangement.charAt(i+1)==')' ){
                    st.pop();
                    i++;
                    answer+=st.size();
                }
            }else if(token.equals(")")){
                st.pop();
                answer++;
            }
        }

        return answer;
    }

    //다른 사람 풀이

    //public int solution(String arrangement) {
    //        int answer = 0;
    //        Stack<Integer> st = new Stack<>();
    //        for (int i = 0; i < arrangement.length(); i++) {
    //            if (arrangement.charAt(i) == '(') {
    //                st.push(i);
    //            } else if (arrangement.charAt(i) == ')') {
    //                if (st.peek() + 1 == i) {
    //                    st.pop();
    //                    answer += st.size();
    //                } else {
    //                    st.pop();
    //                    answer += 1;
    //                }
    //            }
    //        }
    //        return answer;
    //    }
}
