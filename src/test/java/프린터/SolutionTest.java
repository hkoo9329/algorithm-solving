package 프린터;

import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
@Slf4j
public class SolutionTest {
    int [][] priorities = {{2,1,3,2},{1,1,9,1,1,1}};
    int []corrects = {1,5};
    int []locations = {2,0};
    Solution solution;
    @Before
    public void SolutionBefore(){
        solution = new Solution();
    }


    @Test
    public void solutionTest() throws IllegalAccessException {
        int answer =0;
        for(int i=0;i<priorities.length;i++) {
            answer = solution.solution(priorities[i], locations[i]);
            assertEquals(answer, corrects[i]);
        }
    }

}