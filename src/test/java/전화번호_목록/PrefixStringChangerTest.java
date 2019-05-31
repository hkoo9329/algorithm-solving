package 전화번호_목록;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PrefixStringChangerTest {

    private final String[] testCase1 = {"119", "97674223", "5524421","123333","1222222","1231241","119232343"};
    private final String[] testCase2 = {"123", "456", "789"};
    private final String[] testCase3 = {"12","123","1235","567","88"};
    PrefixStringChanger prefixStringChanger;
    @Before
    public void init(){
        prefixStringChanger = new PrefixStringChanger();
    }

    @Test
    public void 케이스_테스트_v1(){
        assertEquals(false,prefixStringChanger.solution(testCase1));
        assertEquals(true,prefixStringChanger.solution(testCase2));
        assertEquals(false,prefixStringChanger.solution(testCase3));
    }


    // v2의 실행 속도가 확실히 빠름
    @Test
    public void 케이스_테스트_v2(){
        assertEquals(false,prefixStringChanger.solution_v2(testCase1));
        assertEquals(true,prefixStringChanger.solution_v2(testCase2));
        assertEquals(false,prefixStringChanger.solution_v2(testCase3));
    }
}