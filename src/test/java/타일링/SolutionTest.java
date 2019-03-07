package 타일링;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    private Solution solution;
    @Before
    public void SolutionBefore(){
        solution = new Solution();
    }

    @Test
    public void solutionTestCase(){
        assertEquals(solution.solution2N(1), 1);
        assertEquals(solution.solution2N(2), 2);
        assertEquals(solution.solution2N(3), 3);
        assertEquals(solution.solution2N(4), 5);
        assertEquals(solution.solution2N(5), 8);
        assertEquals(solution.solution2N(6), 13);
        assertEquals(solution.solution2N(7), 21);

    }


}