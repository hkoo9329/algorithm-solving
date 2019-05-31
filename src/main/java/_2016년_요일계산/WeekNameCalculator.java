package _2016년_요일계산;

public class WeekNameCalculator {
    public String solution(int a, int b) {
        int[] months = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String answer = "";
        int sum = 0;
        for (int i = 0; i < a - 1; i++) {
            sum += months[i];
        }
        sum += b;
        switch (sum % 7) {
            case 0:
                return "THU";
            case 1:
                return "FRI";
            case 2:
                return "SAT";
            case 3:
                return "SUN";
            case 4:
                return "MON";
            case 5:
                return "TUE";
            case 6:
                return "WED";
        }

        return answer;
    }
}
