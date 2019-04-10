package 배열.중복확인;

import org.junit.Test;

import static org.junit.Assert.*;

public class CharChangeTest {

    private CharChange charChange = new CharChange();

    @Test
    public void 문자열_공백을_변경_테스트(){
        String s = "Mr John Smith";
        System.out.println(charChange.chage(s));
        //문자열 배열 테스트
        System.out.println(charChange.replaceSpaces(s.toCharArray(),13));
    }



}