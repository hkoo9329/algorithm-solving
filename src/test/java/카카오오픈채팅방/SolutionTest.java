package 카카오오픈채팅방;

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
        String[] testCase = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
        String[] correctCase = {"Prodo님이 들어왔습니다.", "Ryan님이 들어왔습니다.", "Prodo님이 나갔습니다.", "Prodo님이 들어왔습니다."};

        assertArrayEquals(solution.solution(testCase), correctCase);
    }

}