import java.util.Scanner;

public class problem_1094 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int stickLength = s.nextInt();

        System.out.println(getStickCount(stickLength));
    }

    public static int getStickCount(int stickLength){
        int remainStickCount = 0;
        int remainStickTotalLength = 0;
        int nowStick = 64;

        while(true){
            if((nowStick + remainStickTotalLength) == stickLength) {
                break;
            }
            nowStick /= 2;
            if(nowStick + remainStickTotalLength <= stickLength){
                remainStickCount ++;
                remainStickTotalLength += nowStick;
            }
        }
        if(remainStickCount-1 <= 1)
            return 1;
        else
            return remainStickCount-1;
    }
}
