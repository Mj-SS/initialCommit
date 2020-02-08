package fwbeurary.secondWeek.Saturday;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App {


    public static void main(String[] args) {


        List<String> words = WordsProvider.provide();

        thirdTask(words);
    }

    private static void firstTask(List<String> words) {
        List<String> wordsOnLetterD = words.stream()
                .filter(singleWord -> singleWord.startsWith("d"))
                .collect(Collectors.toList());
        System.out.println(wordsOnLetterD);
    }

    private static void secondTask(List<String> words) {
        List<String> shortWordsOnLetterA = words.stream()
                .filter(word -> word.startsWith("a") && word.length() <= 4)
                .collect(Collectors.toList());
        System.out.println(shortWordsOnLetterA);
    }

    private static void thirdTask(List<String> words) {
        List<String> uppercaseWords = words.stream()
                .map(s -> s.substring(0, 1).toUpperCase() + s.substring(1))
                .collect(Collectors.toList());
        System.out.println(uppercaseWords);
    }

//    Utwórz listę integerów. Dodaj do niej 20 wymyślonych wartości, także ujemnych. Wywołaj na niej następnie
//    metodę stream a następnie mapToInt. Zobacz jakie metody dalej podpowiada. Następnie zrób osobną
//    metodę w klasie gdzie masz metodę main i spraw aby przyjmowała listę integerów po
//    czym drukowała ich sumę oraz średnią do konsoli.


}



