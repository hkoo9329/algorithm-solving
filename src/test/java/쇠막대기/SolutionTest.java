package 쇠막대기;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    private Solution solution;

    @Before
    public void init(){
        solution = new Solution();
    }

    @Test
    public void 케이스_테스트(){
        String test_case = "()(((()())(())()))(())";
        int result = solution.solution(test_case);
        assertEquals(17, result);
    }

}