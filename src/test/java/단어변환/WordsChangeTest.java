package 단어변환;


import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

@Slf4j
public class WordsChangeTest {

    @Test
    public void 단어변환(){
        String begin = "hit";
        String target = "cog";
        String[] words = {"hot","dot","dog","lot","log","cog"};

        String[] beginWords = begin.split("");
        String[] targetWords = target.split("");

    }

}
