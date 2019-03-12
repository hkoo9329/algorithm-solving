package 다리를지나는트럭;

import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
@Slf4j
public class SolutionTest {

    private Solution solutionTest;
    @Before
    public void setSolutionTest(){
        solutionTest = new Solution();
    }

    @Test
    public void solutionTestCase(){
        assertEquals(solutionTest.solution(2,10, new int[]{7, 4, 5, 6}),8);
        assertEquals(solutionTest.solution(100,100,new int[]{10}),101);
        assertEquals(solutionTest.solution(100,100,new int[]{10,10,10,10,10,10,10,10,10,10}),110);
    }

}