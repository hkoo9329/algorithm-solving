package 섬연결하기;

import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

@Slf4j
public class IslandTest {
    private Island island;

    @Before
    public void init(){
        island = new Island();
    }

    @Test
    public void 케이스_테스트(){
        int n =4;
        int[][] costs ={{0,1,1},{0,2,2},{1,2,5},{1,3,1},{2,3,8}};

        assertEquals(4, island.solution(n,costs));

    }


    @Test
    public void 테스트(){
        int[] reserve = {1,3,5};
        int[] lost = {2,4};
        int answer = reserve.length;
        List<Integer> list = new LinkedList<>();
        for(int i : reserve){
            list.add(i);
        }
        for(int i=0;i<lost.length;i++){
            for(int j=0;j<list.size();j++){
                if(((list.get(j)-1)==lost[i])||((list.get(j)+1)==lost[i])){
                    list.remove(j);
                    break;
                }
            }
        }
        System.out.println(5-(lost.length-(answer-list.size())));
    }

}