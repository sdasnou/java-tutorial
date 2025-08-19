package Assignments;

import java.util.ArrayList;
import java.util.HashSet;

public class FindStringConcurrence {
    public static void main(String[] args) {
        String mainString = "baannnnaaanna";
        char searchChar = 'a';
        ArrayList<Integer> occurrenceList = stringToCharList(mainString, searchChar);
        int maxOccurrence = findMaxFromArrayList(occurrenceList);

        System.out.println("String: " + mainString);
        System.out.println("Character to search: " + searchChar);
        System.out.println("Max consecutive occurrences of '" + searchChar + "': " + maxOccurrence);

        int[] array = {1, 5, 6, 7, 3, 9, 10, 23, 45};
        int value = 16;
        System.out.println("Pairs with sum " + value + ":");
        printPairsWithSum(array, value);
    }

    // Returns a list of counts of consecutive occurrences of searchChar in str
    public static ArrayList<Integer> stringToCharList(String str, char searchChar) {
        ArrayList<Integer> charList = new ArrayList<>();
        int count = 0;
        for (char c : str.toCharArray()) {
            if (c == searchChar) {
                count++;
            } else {
                if (count > 0) {
                    charList.add(count);
                    count = 0;
                }
            }
        }
        if (count > 0) {
            charList.add(count);
        }
        return charList;
    }

    // Returns the maximum value from an ArrayList of Integers
    public static int findMaxFromArrayList(ArrayList<Integer> list) {
        if (list == null || list.isEmpty()) {
            return 0;
        }
        int max = list.get(0);
        for (int num : list) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    // Prints all unique pairs in arr that sum to value using a HashSet (single loop)
    public static void printPairsWithSum(int[] arr, int value) {
        HashSet<Integer> seen = new HashSet<>();
        HashSet<String> printed = new HashSet<>();
        for (int num : arr) {
            int complement = value - num;
            if (seen.contains(complement)) {
                String pair = "(" + Math.min(num, complement) + ", " + Math.max(num, complement) + ")";
                if (!printed.contains(pair)) {
                    System.out.println(pair);
                    printed.add(pair);
                }
            }
            seen.add(num);
        }
    }
}