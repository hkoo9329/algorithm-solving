package 배열.중복확인;

import java.util.Arrays;

public class Permutation {

    public String sort(String str){
        char[] sortChar = str.toCharArray();
        Arrays.sort(sortChar);
        return new String(sortChar);
    }

    public boolean permutationV1(String s, String t){
        if (s.length() != t.length())
            return false;
        return sort(s).equals(sort(t));
    }
    public boolean permutationV2(String s, String t){
        if(s.length() != t.length())
            return false;
        int[] letters = new int[128]; // ASCII라고 가정
        char[] s_array = s.toCharArray();
        for(char c: s_array){
            letters[c]++;
        }
        for (int i=0;i<t.length();i++){
            int c= (int) t.charAt(i);
            letters[c]--;
            if(letters[c]<0){
                return false;
            }
        }
        return true;
    }
}
