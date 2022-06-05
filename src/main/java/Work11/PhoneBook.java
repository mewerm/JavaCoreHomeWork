package Work11;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PhoneBook {

    private Map<String, HashSet<Long>> map;

    protected PhoneBook() {
        this.map = new HashMap<>();
    }

    protected void add(String lastName, long phoneNumber) {
        HashSet<Long> numbers;

        if (map.containsKey(lastName)) {
            numbers = map.get(lastName);
        } else {
            numbers = new HashSet<>();
        }
        numbers.add(phoneNumber);
        map.put(lastName, numbers);
    }

    Set<Long> get(String lastName) {
        System.out.printf("Все возможные номера товарища %sа", lastName);
        return map.get(lastName);
    }
}
