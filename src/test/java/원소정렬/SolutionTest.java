package 원소정렬;

import lombok.extern.java.Log;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
@Log
public class SolutionTest {
    private Solution solution;

    @Before
    public void SolutionBefore() {
        solution = new Solution();
    }

    @Test
    public void 원소정렬_케이스_테스트() {
        String answer = solution.solution("HSO214");
        log.info(answer);
        Assert.assertEquals(answer,"H2SO4");
    }


}