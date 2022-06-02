import java.util.Scanner;

public class problem_1075 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int F = s. nextInt();
        System.out.println(printFormat(findMinDivisor(N, F)));
    }

    public static int findMinDivisor(int numN, int numF){
        int preNum = numN / 100;
        preNum *= 100;

        int returnValue = 0;
        for(int i=0; i<100; i++){
            int checkNum = preNum + i;
            if(checkNum % numF == 0){
                returnValue = i;
                break;
            }
        }
        return returnValue;
    }

    public static String printFormat(int result){
        String returnValue = Integer.toString(result);
        if(result < 10)
            returnValue = "0"+returnValue;
        return returnValue;
    }
}
