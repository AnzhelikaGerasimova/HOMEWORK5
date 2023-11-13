package Task1;

import java.util.Arrays;
import java.util.Random;

public class Lottery {

    public static void main(String[] args) {
        int[] ballNumber = new int[100];

        for (int number = 0; number < 100; number++) {
            ballNumber[number] = number;
        }

        mix(ballNumber);

        for (int number = 0; number < 10; number++) {
            System.out.println(ballNumber[number]);
        }
    }

    static void mix(int[] mixArray) {
        Random index = new Random();

        for (int number = mixArray.length - 1; number > 0; number--) {
            int digit = index.nextInt(number + 1);
            int numeric = mixArray[digit];

            mixArray[digit] = mixArray[number];
            mixArray[number] = numeric;
        }
    }
}
