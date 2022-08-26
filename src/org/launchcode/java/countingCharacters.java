package org.launchcode.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class countingCharacters {
    public static void main(String[] args) {
        System.out.println("Please enter a String: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().toLowerCase().trim().replaceAll("[^a-zA-Z]", "");
        char[] charactersInString = input.toCharArray();
        HashMap<Character, Integer> characterCounts = new HashMap<Character, Integer>();

        for(char c: charactersInString){
            if(characterCounts.containsKey(c)) {
                characterCounts.replace(c, characterCounts.get(c)+1);
            }
            else{
                characterCounts.put(c, 1);
            }
        }
        for (Map.Entry<Character, Integer> entry: characterCounts.entrySet()) {
            Character key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + ", " + value);
        }
    }
}
