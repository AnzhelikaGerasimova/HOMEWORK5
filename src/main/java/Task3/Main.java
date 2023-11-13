package Task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void winnerList(List<Student> studentList) {
        studentList.sort(Comparator.reverseOrder());

        int count = 0;

        while (count < 3) {
            System.out.println(count + 1 + " место: " +
                    studentList.get(count).getSurname() + " " +
                    studentList.get(count).getName() + " " +
                    studentList.get(count).getPatronymic());
            count++;
        }
    }
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>(Arrays.asList(
                new Student("Иван",
                          "Иванов",
                        "Иванович",
                                  new ArrayList<>(Arrays.asList(5, 5, 4))),
                new Student("Борис",
                          "Иванов",
                        "Борисович",
                                  new ArrayList<>(Arrays.asList(3, 3, 4))),
                new Student("Марина",
                          "Иванова",
                        "Николаевна",
                                  new ArrayList<>(Arrays.asList(4, 5, 4))),
                new Student("Владимир",
                          "Соколов",
                        "Дмитриевич",
                                  new ArrayList<>(Arrays.asList(5, 5, 5)))));

        winnerList(students);
    }
}
