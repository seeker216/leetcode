package a0151stringReverse;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class first0151 {
    public static String reverseWords(String s) {
        s=s.trim();
        List<String> wordLis= Arrays.asList(s.split(" +"));
        Collections.reverse(wordLis);
        return String.join(" ",wordLis);
    }

    public static void main(String[] args) {
        String s="  hello world!  ";
        System.out.println(reverseWords(s));;
    }
}
