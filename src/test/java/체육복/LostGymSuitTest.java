package 체육복;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LostGymSuitTest {
    private LostGymSuit lostGymSuit;
    @Before
    public void init(){
        lostGymSuit = new LostGymSuit();
    }

    @Test
    public void 케이스_테스트(){
        int n = 5;
        int[] lost = {2,4};
        int[] reserve = {1,3,5};

        int result = lostGymSuit.other_solution(n,lost,reserve);

        assertEquals(5,result);
    }

}