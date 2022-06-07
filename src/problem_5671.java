import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class problem_5671 {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        List<Integer> inputList = new LinkedList<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = "";

        while((input=br.readLine())!=null) {
            String[] str = input.split(" ");
            int first = Integer.parseInt(str[0]);
            int second = Integer.parseInt(str[1]);

            int[] range = {first, second};
            System.out.println(getDuplicationNums(range));
        }
    }
    public static int getDuplicationNums(int[] range){
        int notDupNumCount = 0;
        for(int i=range[0]; i<=range[1]; i++){
            if(!isDuplicate(i))
                notDupNumCount++;
        }
        return notDupNumCount;
    }

    public static boolean isDuplicate(int num){
        boolean hasDup = false;
        List<Integer> list = new LinkedList<>();

        char[] numArrays = Integer.toString(num).toCharArray();
        for(var item : numArrays){
            int convertedValue = Character.getNumericValue(item);
            if(list.contains(convertedValue)) {
                hasDup = true;
                break;
            }else {
                list.add(convertedValue);
            }
        }

        return hasDup;
    }
}
