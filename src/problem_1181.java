import java.util.*;

public class problem_1181 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int count = s.nextInt();
        ArrayList<Word> words = new ArrayList<>();

        for(int i=0; i<count; i++){
            String item = s.next();
            if(words.stream().filter(x -> x.getWord().equals(item)).findAny().isEmpty())
                words.add(new Word(item, item.length()));
        }

        words.stream()
                .sorted(Comparator.comparing(Word::getWord))
                .sorted(Comparator.comparing(Word::getLength))
                .forEach(x -> System.out.println(x.getWord()));
    }
}

class Word{
    String word;
    int length;

    public Word(String word, int length) {
        this.word = word;
        this.length = length;
    }

    public String getWord() {
        return word;
    }

    public int getLength() {
        return length;
    }
}
