package _2016년_요일계산;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WeekNameCalculatorTest {

    private WeekNameCalculator calculator;

    @Before
    public void init(){
        calculator = new WeekNameCalculator();
    }

    @Test
    public void 케이스_테스트(){
        assertEquals("TUE",calculator.solution(5,24));
        assertEquals("MON",calculator.solution(2,29));
    }

}