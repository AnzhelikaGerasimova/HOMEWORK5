package Task2;

import java.util.*;

public class House {
    public static void main(String[] args) {
        HashMap<String, Integer> namesAndAge = new HashMap<>();

        namesAndAge.put("Иван Иванович Иванов", 54);
        namesAndAge.put("Борис Борисович Иванов", 34);
        namesAndAge.put("Марина Николаевна Иванова", 18);
        namesAndAge.put("Ольга Борисовна Иванова", 15);
        namesAndAge.put("Владимир Дмитриевич Соколов", 13);

        List<String> age = new ArrayList<String>();

        for (Map.Entry entry : namesAndAge.entrySet()) {
            if ((int)entry.getValue() > 18) {

                age.add(entry.getKey().toString());
            }
        }
        age.sort(Comparator.<String>naturalOrder());

        System.out.println(age);
    }
}
