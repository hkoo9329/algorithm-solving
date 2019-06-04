package 스킬트리;

public class SkillTree {
//나의 코드
    public int solution(String skill, String[] skill_trees) {

        int answer = 0;

        for (int i = 0; i < skill_trees.length; i++) {

            String temp = "";
            for (int j = 0; j < skill_trees[i].length(); j++) {

                if (skill.contains(String.valueOf(skill_trees[i].charAt(j)))) {
                    temp += String.valueOf(skill_trees[i].charAt(j));
                }
            }
            if (skill.startsWith(temp)) {
                answer++;
            }
        }
        return answer;
    }


    // 다른 사람 코드
    /*
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        ArrayList<String> skillTrees = new ArrayList<String>(Arrays.asList(skill_trees));
        //ArrayList<String> skillTrees = new ArrayList<String>();
        Iterator<String> it = skillTrees.iterator();

        while (it.hasNext()) {
            if (skill.indexOf(it.next().replaceAll("[^" + skill + "]", "")) != 0) {
                it.remove();
            }
        }
        answer = skillTrees.size();
        return answer;
    }

     */
}
