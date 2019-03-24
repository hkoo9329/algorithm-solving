package 다리를지나는트럭;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

@Slf4j
public class SolutionTest {


    @Data
    class tables {
        private int id;
        private String name;
        private String occupation;
        private String city;
        private String zip;

        public tables(int id) {
            this.id = id;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setOccupation(String occupation) {
            this.occupation = occupation;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public void setZip(String zip) {
            this.zip = zip;
        }


    }

    private Solution solutionTest;

    @Before
    public void setSolutionTest() {
        solutionTest = new Solution();
    }

    @Test
    public void solutionTestCase() {
        int[][] array = {{1, 4}, {3, 4}, {3, 10}};
        int a = array[0][0];
        int b = array[0][1];
        for (int i = 1; i < array.length; i++) {
            a ^= array[i][0];
            b ^= array[i][1];
        }
        log.info(a + "  " + b);

        assertEquals(solutionTest.solution(2, 10, new int[]{7, 4, 5, 6}), 8);
        assertEquals(solutionTest.solution(100, 100, new int[]{10}), 101);
        assertEquals(solutionTest.solution(100, 100, new int[]{10, 10, 10, 10, 10, 10, 10, 10, 10, 10}), 110);
    }

    @Test
    public void Soull() {




    }

}