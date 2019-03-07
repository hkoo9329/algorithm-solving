package 타일링;

public class Solution {


    public int solution2N(int n) {
        int[] answers = new int[n];

        if (n > 1) {
            answers[0] = 1;
            answers[1] = 2;
        } else
            answers[0] = 1;
        for (int i = 2; i < n; i++) {
            answers[i] = (answers[i - 1] + answers[i - 2]) % 1000000007;
        }

        return answers[n - 1];
    }

    public int solution3N(int n) {
        int[] answer = new int[n + 1];
        answer[0] = 1;
        answer[1] = 0;
        answer[2] = 3;

        for (int i = 3; i <= n; i++) {
            if (i % 2 == 1)
                continue;
            answer[i] = 3 * answer[i - 2];
            for (int j = 4; i - j >= 0; j += 2) {
                answer[i] += 2 * answer[i - j];
            }
            answer[i]%=1000000007;
        }

        return answer[n];
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        for (int i = 4; i <= 5000; i++)
            System.out.println(i + ":   " + solution.solution3N(i));

    }
}
