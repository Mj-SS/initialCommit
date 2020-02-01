package LinkedList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TekstAnalyzer {

    private static Character letter;

    public static void main(String[] args) {
        Map<Character, List<String>> mapOfWords = groupWordsByLetter("ala ma kota a kot ma ale, ala wpierdala a kot nie je wcale");
        System.out.println(mapOfWords);



    }

    public static Map<Character, List<String>> groupWordsByLetter(String textToAnalyze) {
        Map<Character, List<String>> characterStringMap = new HashMap<>();
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        String[] textToAnalyzeArray = textToAnalyze.split(" ");

        for (char letter : alphabet) {
            characterStringMap.put(letter, new ArrayList<>());
        }


        for (int i = 0; i < textToAnalyzeArray.length; i++) {
            characterStringMap.get(textToAnalyzeArray[i].charAt(0)).add(textToAnalyzeArray[i]);

        }
        characterStringMap.put('a', new ArrayList<>());


        return characterStringMap;
    }
}