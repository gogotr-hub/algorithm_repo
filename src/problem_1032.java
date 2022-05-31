import java.util.Scanner;

public class problem_1032 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int inputCount = s.nextInt();
        String[] files = new String[inputCount];

        for(int i=0; i<inputCount; i++){
            files[i] = s.next();
        }

        System.out.println(compareFileNames(files));
    }

    public static String compareFileNames(String[] files){
        char[] diffChars = files[0].toCharArray();
        char[] diffCharOrigin = diffChars;
        if(files.length > 1) {
            for (int j = 1; j < files.length; j++) {
                char[] anotherChar = files[j].toCharArray();
                //files count
                for (int i = 0; i < diffChars.length; i++) {
                    //char count
                    if (diffChars[i] != anotherChar[i]) {
                        diffCharOrigin[i] = '?';
                    }
                }
            }
        }
        return new String(diffCharOrigin);
    }
}
