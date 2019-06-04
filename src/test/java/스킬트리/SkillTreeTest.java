package 스킬트리;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SkillTreeTest {

    private SkillTree skillTree;
    @Before
    public void init(){
        skillTree = new SkillTree();
    }

    @Test
    public void 케이스_테스트(){
        String  skill1 = "CBD";
        String[] skill_trees1 = {"BACDE", "CBADF", "AECB", "BDA"};

        assertEquals(2,skillTree.solution(skill1,skill_trees1));

    }
}