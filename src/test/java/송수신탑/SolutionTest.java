package 송수신탑;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class SolutionTest {

    private Solution solution;

    @Before
    public void SolutionBefore() {
        solution = new Solution();
    }

    @Test
    public void test() {
        int[][] testNumber = {{6, 9, 5, 7, 4}, {3, 9, 9, 3, 5, 7, 2}, {1, 5, 3, 6, 7, 6, 5}};
        int[][] correct = {{0, 0, 2, 2, 4}, {0, 0, 0, 3, 3, 3, 6}, {0, 0, 2, 0, 0, 5, 6}};
        for (int i = 0; i < 3; i++) {
            Assert.assertArrayEquals(solution.solution(testNumber[i]),correct[i] );
        }
    }

}