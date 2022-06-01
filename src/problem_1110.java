import java.util.Scanner;

public class problem_1110{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println(getCycle(s.nextInt()));
    }

    public static int getCycle(int num){
        //입력 받은 값과 비교해서 아니면 ++1 같으면 종료하고 사이클 값을 리턴한다.
        int cycle = 1;
        int newSum = 0;

        while(true){
            if(cycle == 1){
                newSum = getNewSum(num);
            }else{
                newSum = getNewSum(newSum);
            }

            if(num == newSum)
                break;
            else
                cycle++;

        }
        return cycle;
    }

    public static int getNewSum(int number){
        //숫자의 범위는 0 ~ 99
        int forwardNum = number / 10;
        int backNum = number % 10;

        int sum = forwardNum + backNum;
        return (backNum * 10) + (sum % 10);
    }
}