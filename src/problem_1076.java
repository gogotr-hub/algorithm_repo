import java.math.BigInteger;
import java.util.Arrays;
import java.util.Optional;
import java.util.Scanner;

public class problem_1076 {
    public static Color[] palette = new Color[10];

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String[] inputColors = new String[3];
        inputColors[0] = s.next();
        inputColors[1] = s.next();
        inputColors[2] = s.next();

        Palette palette = new Palette();

        System.out.println(calculate(inputColors, palette));
    }

    public static long calculate(String[] inputs, Palette palette){
        long returnValue = 0;
        for(int i=0; i<inputs.length; i++){
            //마지막 값일 경우
            if(i == inputs.length-1){
                returnValue *= palette.getColor(inputs[i]).get().getMulti();
            }else{
                if(i>0)
                    returnValue *= 10;
                returnValue += palette.getColor(inputs[i]).get().getVal();
            }
        }
        return returnValue;
    }
}

class Color{
    String color;
    int val;
    int multi;

    public String getColor() {
        return color;
    }

    public int getVal() {
        return val;
    }

    public int getMulti() {
        return multi;
    }

    public Color(String color, int val, int multi){
        this.color = color;
        this.val = val;
        this.multi = multi;
    }
}

class Palette {
    Color[] colorPalette = new Color[10];

    public Palette() {
        colorPalette[0] = new Color("black", 0, 1);
        colorPalette[1] = new Color("brown", 1, 10);
        colorPalette[2] = new Color("red", 2, 100);
        colorPalette[3] = new Color("orange", 3, 1000);
        colorPalette[4] = new Color("yellow", 4, 10000);
        colorPalette[5] = new Color("green", 5, 100000);
        colorPalette[6] = new Color("blue", 6, 1000000);
        colorPalette[7] = new Color("violet", 7, 10000000);
        colorPalette[8] = new Color("grey", 8, 100000000);
        colorPalette[9] = new Color("white", 9, 1000000000);
        this.colorPalette = colorPalette;
    }

    public Optional<Color> getColor(String colorName){
        return Arrays.stream(this.colorPalette).filter(x -> x.color.equals(colorName)).findFirst();
    }
}
