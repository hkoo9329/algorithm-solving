package 브라이언의_고민;

import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;
import java.util.Queue;

import static org.junit.Assert.*;

@Slf4j
public class StringDecoderTest {

    private StringDecoder stringDecoder;
    @Before
    public void init(){
        stringDecoder = new StringDecoder();
    }

    @Test
    public void 케이스_테스트(){
        String sentence = "HaEaLaLaObWORLDb";
        String sentence2 = "SpIpGpOpNpGJqOqA";
        String result=stringDecoder.solution(sentence);
        assertEquals("HELLO WORLD",result);
        result = stringDecoder.solution(sentence2);
        assertEquals("SIGONG JOA",result);
    }


    @Test
    public void 큐_스트링_테스트(){
        Queue<Character> queue = new LinkedList<>();
        String st = "abddewws";
        for (char c : st.toCharArray()){
            queue.add(c);
        }
        log.info(queue.toString());
    }

}