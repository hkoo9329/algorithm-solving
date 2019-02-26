package 숫자124의나라;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class SolutionTest {

    Solution solution;

    @Before
    public void SolutionBefore(){
        solution = new Solution();

    }

    @Test
    public void Test() {
        int[] TestNumber ={1,5,10,50};
        String[] correctNumber = {"1","12","41","1212"};
        for(int i=0;i<TestNumber.length;i++){
            Assert.assertEquals(solution.solution(TestNumber[i]),correctNumber[i]);
        }
    }
}