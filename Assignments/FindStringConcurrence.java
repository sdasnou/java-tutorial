package Assignments;

import java.util.List;
import java.util.ArrayList;

public class FindStringConcurrence {
    public static void main(String[] args) {
        // Example usage of the classes
        String mainString = "baannnnaaanna";
        char searchString = 'a';
        ArrayList<Integer> charList = stringToCharList(mainString, searchString);
        int maxOccurrence = findMaxFromArrayList(charList);

        System.out.println("String: " + mainString);
        System.out.println("Character to search: " + searchString);
        System.out.println("Occurrences of '" + searchString + "': " + maxOccurrence);
    }

    public static ArrayList<Integer> stringToCharList(String str, char searchString) {
        ArrayList<Integer> charList = new ArrayList<>();
        char[] charArray = str.toCharArray(); 
        int count = 0;
        for (char c : charArray) {
            if (c == searchString) {
                count++;
            } else {
                charList.add(count);
                count = 0;
            }
        }
        return charList;
    }

 public static int findMaxFromArrayList(ArrayList<Integer> list) {
        if (list == null || list.isEmpty()) {
            return 0;
        }
        int max = 0;
        for (int num : list) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}