package 수포자모의고사;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SupojaTest {

    private Supoja solution;

    @Before
    public void init() {
        solution = new Supoja();
    }

    @Test
    public void 테스트_케이스() {
        int[] testCase1 = {1, 2, 3, 4, 5};
        int[] answer1 = {1};
        int[] testCase2 = {1, 3, 2, 4, 2};
        int[] answer2 = {1, 2, 3};
        assertArrayEquals(solution.solution(testCase1), answer1);
        assertArrayEquals(solution.solution(testCase2), answer2);
    }

}