package code401challenges.repeatedWord;

import java.util.HashSet;

public class RepeatedWord {
    public static String repeatedWord(String sentence){
        HashSet<String> container = new HashSet<>();
        for(String word : sentence.split(" ")){
            word = word.toLowerCase();
            if(container.contains(word)){
                return word;
            }
            container.add(word);
        }
        return "Empty String, please try again";
    }
}
