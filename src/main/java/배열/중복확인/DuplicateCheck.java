package 배열.중복확인;

//문자열이 주어졌을 때, 이 문자열에 같은 문자가 중복되어 등장하는지 확인하는 알고리즘을 작성하라
// 자료구조를 추가로 사용하지 않고 풀 수 있는 알고리즘 또한 고민하라.
public class DuplicateCheck {

    public boolean inASCIIChars(String str) {
        if (str.length() > 128)
            return false;
        boolean[] char_set = new boolean[128];
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            if (char_set[val]) {
                return false;
            }
            char_set[val] = true;
        }
        return true;
    }

    public boolean inUnicodeChars(String str) {
        if (str.length() > 256)
            return false;
        boolean[] char_set = new boolean[256];
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            if (char_set[val]) {
                return false;
            }
            char_set[val] = true;
        }
        return true;
    }

    public boolean isUniqueChars(String str) {
        int checker = 0;
        for(int i=0;i<str.length();i++){
            int val = str.charAt(i) - 'a';
            if((checker & (1 << val)) > 0)
                return false;
            checker |= (1<<val);
        }
        return true;
    }
}
