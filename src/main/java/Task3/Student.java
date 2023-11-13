package Task3;

import java.util.ArrayList;
import java.util.List;

public class Student implements Comparable<Student>{
    private String name;
    private String surname;
    private String patronymic;
    private List<Integer> score = new ArrayList<>();

    public Student(String name, String surname, String patronymic, List<Integer> score) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.score = score;
    }

    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public String getPatronymic() {
        return patronymic;
    }
    public List<Integer> getScore() {
        return score;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }
    public void setScore(List<Integer> score) {
        this.score = score;
    }
    public double average() {
        double sum = 0;

        for (int value : this.score) {
            sum += value;
        }

        return sum / this.score.size();
    }

    @Override
    public int compareTo(Student o) {
        return Double.compare(average(), o.average());
    }
}
