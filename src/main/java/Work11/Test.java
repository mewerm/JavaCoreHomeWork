package Work11;

import java.util.*;

public class Test {
    public static void main(String[] args) {

        testWords();
        testBook();
    }

    private static void testWords() {
        List<String> putWords = new ArrayList<>();
        putWords.add("Cat");
        putWords.add("Cat");
        putWords.add("Cat");
        putWords.add("Dog");
        putWords.add("Strigino");
        putWords.add("Strigino");
        putWords.add("Rule");
        putWords.add("Rick");
        putWords.add("Rule");
        putWords.add("Morthy");
        putWords.add("Cucumber");
        putWords.add("Morthy");
        putWords.add("Rule");

        System.out.print("Все слова: ");
        for (String s : putWords) {
            System.out.print(s + " ");
        }

        Set<String> runOnlyOne = new HashSet<>(putWords);

        System.out.print("\n\nСлова без повторений: ");
        for (String s : runOnlyOne) {
            System.out.print(s + " ");
        }

        System.out.println("\n\nКАЖДОЕ СЛОВО ВСТРЕЧАЕТСЯ ТАКОЕ КОЛИЧЕТСВО РАЗ: ");
        Map<String, Integer> wordsCount = new HashMap<>();
        for (String s : putWords) {
            wordsCount.put(s, wordsCount.getOrDefault(s, 0) + 1);
        }
        for (Map.Entry<String, Integer> stringIntegerEntry : wordsCount.entrySet()) {
            System.out.println(stringIntegerEntry);
        }
        System.out.println();
    }

    protected static void testBook() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Иванов", "+79290982365");
        phoneBook.add("Иванов", "+79298765487");
        phoneBook.add("Петров", "+792978788237");
        phoneBook.add("Петров", "+792978788237");
        phoneBook.add("Петров", "+792978777237");
        phoneBook.add("Сидоров", "+79298888888");
        phoneBook.add("Сидоров", "+79298888888");
        phoneBook.add("Петров", "+7929777777");
        phoneBook.add("Водочкин", "+7929765439765");
        phoneBook.add("Водочкин", "+7929765438765");
        phoneBook.add("Сидоров", "+79896888582");

        System.out.println(phoneBook.get("Петров"));
        System.out.println(phoneBook.get("Иванов"));
        System.out.println(phoneBook.get("Водочкин"));

    }
}


