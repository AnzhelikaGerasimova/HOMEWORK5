package Task3;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private String surname;
    private String patronymic;
    private List<Integer> score = new ArrayList<>();

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

    public void winnerList(String winnerList) {

    }

}
