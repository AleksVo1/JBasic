package oop.homeWork11;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharacters {

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Введіть речення:");
        String sentence = sc.nextLine().toLowerCase();

        Map<Character, Integer> newSentence = new HashMap<>();

        for(int i = 0; i < sentence.length(); i++) {

            char letter = sentence.charAt(i);

                if (Character.isLetter(letter)){
                    newSentence.put(letter, newSentence.getOrDefault(letter, 0) +1);
                }
        }

        System.out.println("Кількість кожної літери в реченні:");

        for (char letter : newSentence.keySet()){

            System.out.println(letter + ": " + newSentence.get(letter));
        }
    }
}
