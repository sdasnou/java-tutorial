package Assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Anagram {
    
     public static void main(String[] args) {
        String input = "abc";
        List<String> words = new ArrayList<>();
        words.add("bca");
        words.add("cab");
        words.add("cba");
        words.add("dab");
        words.add("def");
        words.add("abcd");
        // System.out.println(words);
        List<String> result = getAnagrams(input, words);
        System.out.println(result);
    }

    static List<String> getAnagrams(String word, List<String> candidates) {
        List<String> anagrams = new ArrayList<>();
        // Sort input word
        String sortedWord = sortString(word);

        for (String candidate : candidates) {
            if (candidate.length() == word.length() && sortString(candidate).equals(sortedWord)) {
                anagrams.add(candidate);
            }
        }
        return anagrams;
    }

    // sort characters in a string
    static String sortString(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}
