import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class problem_1037 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int result = 0;
        int arraySize = s.nextInt();
        Integer[] divisors = new Integer[arraySize];

        for(int i=0; i<arraySize; i++){
            divisors[i] = s.nextInt();
        }

        Arrays.sort(divisors, Collections.reverseOrder()); //정렬 내림 차순
        if(divisors.length > 1)
            result = divisors[0] * divisors[arraySize-1];
        else
            result = divisors[0] * divisors[0];

        System.out.println(result);
    }
}
