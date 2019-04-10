package 배열.중복확인;

import org.junit.Test;

public class PermutationTest {

    private Permutation permutation = new Permutation();

    @Test
    public void 두개의_문자열_순열관계_확인() {
        String s = "123456789";
        String t = "987654321";
        if (permutation.permutationV1(s, t)) {
            System.out.println("순열관계");
        } else{
            System.out.println("순열관계아님");
        }
        s = "asdwert";
        t = "bvfrwqs";
        if (permutation.permutationV1(s, t)) {
            System.out.println("순열관계");
        } else{
            System.out.println("순열관계아님");
        }

    }

}