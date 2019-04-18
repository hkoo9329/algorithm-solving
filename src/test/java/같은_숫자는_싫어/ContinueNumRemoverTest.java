package 같은_숫자는_싫어;

import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Scanner;

import static org.junit.Assert.*;

@Slf4j
public class ContinueNumRemoverTest {

    private ContinueNumRemover remover;

    @Before
    public void setRemover(){
    remover = new ContinueNumRemover();
    }


    @Test
    public void 테스트_케이스() {
        int[] arr = {1, 1};
        int[] caseOne = {1,1,3,3,0,1,1};
        int[] answer = remover.solution(caseOne);
        Arrays.stream(answer).forEach(i->{
            log.info(i+"");
        });
    }
}