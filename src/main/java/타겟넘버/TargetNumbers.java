package 타겟넘버;

public class TargetNumbers {

    public int solution(int[] numbes, int target){

        int answer = 0;

        return answer;
    }
    public int DFS(int[] numbers, int target, int index, int sum){

        if (index == numbers.length){
            return target==sum ? 1:0;
        }else {
            return DFS(numbers,target,index+1,sum+numbers[index])
                    +DFS(numbers,target,index+1,sum+numbers[index]);
        }

    }

}
/*
//괜찮은 알고리즘
    public int solution(int[] numbers, int target) {
        return DFS(numbers,target,0,0);
    }

    public int DFS(int[] numbers, int target, int index, int num) {
        if (index == numbers.length) {
            return num == target ? 1 : 0;
        }else{
            return DFS(numbers,target,index+1,num+numbers[index])
                    +DFS(numbers,target,index+1,num-numbers[index]);
        }
    }

    public static void main(String[] args) {
        TargetNumbers targetNumbers = new TargetNumbers();
        int[] numbers ={1,1,1,1,1};
        int target = 3;
        System.out.println(targetNumbers.solution(numbers,target));

    }
 */