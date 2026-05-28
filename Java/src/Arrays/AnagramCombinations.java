package Arrays;


import java.util.*;

//Given an array of strings, group all strings that are anagrams of each other.
//
// Two strings are considered anagrams if one string can be rearranged to form the other.
public class AnagramCombinations {


    public static void getAnagramCombinations(String [] inputArr){

        // Key = sorted string
        // Value = list of original strings
        Map<String, List<String>> map = new LinkedHashMap<>();

        for(String currentWord: inputArr){

            char[] chars= currentWord.toCharArray();
            Arrays.sort(chars);

            String key= new String(chars);

            map.putIfAbsent(key,new ArrayList<>());
            map.get(key).add(currentWord);
        }

        // Number of unique groups
        System.out.println("Unique Groups Count: " + map.size());
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {

            List<String> words = entry.getValue();

            System.out.println(words + " -> Count: " + words.size());
        }
    }

    public static void main(String[] args) {
        String[] arr = {"abc", "def", "cab", "baa", "efd", "aab", "fed"};

        AnagramCombinations.getAnagramCombinations(arr);

    }
}
