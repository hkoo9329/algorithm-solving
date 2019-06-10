import lombok.extern.slf4j.Slf4j;
import org.junit.Test;


import static org.junit.Assert.*;

@Slf4j
public class 기능개발 {


    @Test
    public void 사각형_좌표() {
//        int [][] v ; //테스트 케이스
//        int[] answer = new int[2];
//        for(int i=0;i<answer.length;i++){
//            if(v[0][i]==v[1][i]){
//                answer[i] = v[2][i];
//            }else if(v[0][i]==v[2][i]){
//                answer[i] = v[1][i];
//            }else if(v[1][i]==v[2][i]){
//                answer[i] = v[0][i];
//            }
//        }

        //return answer;
    }

    @Test
    public void 스트링_태스트() {
        String s = "ASDSDS";
        String answer = "";
        s = s.toLowerCase();
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i) - 97;
            count[index]++;
        }
        int max = 0;
        for (int i = 0; i < count.length; i++) {
            if (count[i] > max) {
                max = count[i];
            }
        }
        for (int i = 0; i < count.length; i++) {
            if (count[i] == max) {
                answer += String.valueOf((char) (i + 97));
            }
        }

        System.out.println(answer);
    }

    @Test
    public void time() {
        String end = "AM 00:00:00".replace(":", " ");
        String start = "AM 00:00:00".replace(":", " ");
        String answer = "";
        String[] starts = start.split(" ");
        String[] ends = end.split(" ");
        int a = timesum(starts);
        int b = timesum(ends);
        int time = Math.abs(b - a);
        System.out.println(timetoString(time));
    }

    public int timesum(String[] time) {
        int sum = 0;
        boolean isPM = false;
        int h = 0, m = 0, s = 0;
        if (time[0].equals("PM")) {
            isPM = true;
        }

        h = Integer.valueOf(time[1]);
        m = Integer.valueOf(time[2]);
        s = Integer.valueOf(time[3]);
        if (isPM) {
            h += 12;
        }

        sum += (h * 3600) + (m * 60) + s;


        return sum;
    }

    public String timetoString(int time) {
        int t = time;
        int s = t % 60;
        t /= 60;
        int m = t % 60;
        t /= 60;
        int h = t;
        return String.format("%02d", h) + ":" + String.format("%02d", m) + ":" + String.format("%02d", s);
    }


    @Test
    public void 테스트코드() {
        int[] bricks = {0, 2, 0, 1, 3, 1, 2, 0, 1, 0, 2, 0};
        int temp = bricks[0];
        int answer =0;
        int water = 0;
        Loop:
        for (int i = 0;i<bricks.length;i++){
            if (bricks[i]>=temp){
                temp = bricks[i];
                while (maxCheck(temp,bricks,i)){
                    temp--;
                    if (temp<=0){
                        break Loop;
                    }
                }
                answer+=water;
                water = 0;
            }else if(bricks[i]<temp){
                water+=temp-bricks[i];
            }
        }
        System.out.println(answer);
    }
    public boolean maxCheck(int value, int[] bricks,int index){
        for (int i=0;i<bricks.length;i++){
            if (i == index){
                continue;
            }
            if (bricks[i]>=value){
                return false;
            }
        }

        return true;
    }

}
