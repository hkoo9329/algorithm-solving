package 전화번호_목록;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PrefixStringChanger {
    class LengthComparator implements Comparator<String> {

        @Override
        public int compare(String s1, String s2) {
            if (s1.length() > s2.length()) {
                return 1;
            } else {
                return -1;
            }
        }
    }

    // 내 코드
    public boolean solution(String[] phone_book) {
        List<String> list = new ArrayList<>();
        for (String s : phone_book) {
            list.add(s);
        }

        LengthComparator comparator = new LengthComparator();
        // 길이별로 정렬
        Collections.sort(list, comparator);

        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j).startsWith(list.get(i))) {
                    return false;
                }
            }
        }
        return true;
    }

    // 다른 사람 좋은 코드
    public boolean solution_v2(String[] phone_book) {
        for (int i = 0; i < phone_book.length; i++) {
            for (int j = i + 1; j < phone_book.length; j++) {
                if (phone_book[i].startsWith(phone_book[j]))
                    return false;
                if (phone_book[j].startsWith(phone_book[i]))
                    return false;
            }
        }
        return true;
    }
}
