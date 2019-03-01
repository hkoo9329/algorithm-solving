package 완주못한선수;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    Solution solution;
    @Before
    public void SolutionBefore(){
        solution = new Solution();
    }

    @Test
    public void TestCase(){
        String[] p1 = {"leo", "kiki", "eden"};
        String[] c1 = {"eden","kiki"};
        String answer =solution.solution(p1, c1);
        assertEquals(answer, "leo");
    }

}