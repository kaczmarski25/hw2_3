package geekbrains_home_work;

import java.util.*;

public class PhoneBook {
    private HashMap<String, ArrayList<String>> phoneBook = new HashMap<>();

    public void add(String name, String phone) {
        ArrayList<String> phoneList = phoneBook.get(name);
        if (phoneList == null) phoneList = new ArrayList<>();
        phoneList.add(phone);
        phoneBook.put(name, phoneList);
    }

    public ArrayList<String> get(String name) {
        return phoneBook.get(name);
    }

}