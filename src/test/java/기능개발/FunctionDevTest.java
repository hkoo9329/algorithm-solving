package 기능개발;

import org.junit.Before;
import org.junit.Test;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

import static org.junit.Assert.*;

public class FunctionDevTest {

    private FunctionDev functionDev;

    @Before
    public void init(){
        functionDev = new FunctionDev();
    }



    @Test
    public void 케이스_테스트(){
        int [] progresses = {93,30,55};
        int [] speeds = {1,30,5};
        int [] answer =functionDev.solution(progresses,speeds);
        int [] expe = {2,1};
        assertArrayEquals(expe,answer);

    }

    @Test
    public void iterator_테스트(){
        Queue<Integer> queue = new LinkedList<>();
        for (int i=0;i<3;i++){
            queue.add(i);
        }
        Iterator it = queue.iterator();

        while (it.hasNext()){

        }
    }
}