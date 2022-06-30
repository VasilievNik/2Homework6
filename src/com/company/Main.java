package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7, 2, 10, 40, 5));
        List<String> words = new ArrayList<>(List.of("g","a","g","asd","d","awf","a","a"));

        printEven(nums);
        printEvenUnique(nums);
        printUniqueWords(words);
        printDoubles(words);
    }

    public static void printEven(List<Integer> nums){
        for(Integer num : nums) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println("\n");
    }

    public static void printEvenUnique(List<Integer> nums){
        Map<Integer, Integer> map = new TreeMap<>();

        for(Integer num : nums) {
            if (num % 2 == 0) {
                map.put(num, num);
            }
        }
        Set<Integer> keys = map.keySet();
        System.out.println(keys + "\n");
    }

    public static void printUniqueWords(List<String> words){
        Map<String, Integer> map = new HashMap<>();

        for(int i=0; i<words.size(); i++){
            String a = String.valueOf(words.get(i));
            map.put(a, i);
        }
        Set<String> keys = map.keySet();
        System.out.println(keys + "\n");
    }

    public static void printDoubles(List<String> words){
        Map<String, Integer> map = new HashMap<>();
        int counter = 0;

        for(int i=0; i<words.size(); i++){
            String a = String.valueOf(words.get(i));
            if(map.containsKey(a)){
                counter++;
            }
            map.put(a, i);
        }
        System.out.println(counter + "\n");
    }


}
