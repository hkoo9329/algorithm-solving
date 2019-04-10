package 연속된_숫자_제거;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;
@Slf4j
public class SolutionTest {
    private Solution solution = new Solution();
    @Test
    public void 테스트_케이스(){
        int[] arr ={1,1,3,3,0,1,1};
        int[] answer =solution.solution(arr);

        Arrays.stream(answer).forEach(i->{
            log.info(i+"");
        });
    }


}