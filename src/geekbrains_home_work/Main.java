package geekbrains_home_work;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("Audi","Alfa-Romeo","Toyota","Renault","Peugeot","Mini","Mazda",
                "Alfa-Romeo","Lincoln","Lancia","Isuzu","Infiniti","GMC",
                "Alfa-Romeo","Audi","Ford","Wiliams","Alpine","Wiliams",
                "Audi");
        Set<String> unique = new HashSet <> (words);


        System.out.println("Уникальные слова:");
        System.out.println(unique.toString());
        System.out.println();
        System.out.println("Сколько же раз, встречается каждое слово?:");

        for (String key : unique) {
            System.out.println(key + " - " + Collections.frequency(words, key));

        }

        System.out.println();

        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Иванов", "+3752912312312");
        phoneBook.add("Петров", "+37529123123455");
        phoneBook.add("Сидоров", "+3752912315421");
        phoneBook.add("Иванов", "+3752912317614");
        phoneBook.add("Сидоров", "+37529123176129");
        phoneBook.add("Петренко","+3752912314900");
        phoneBook.add("Иванько", "+37529123186666");
        phoneBook.add("Петренко", "+3752912778192");

        System.out.println();
        System.out.println("Номер Иванова: " + phoneBook.get("Иванов"));
    }

}