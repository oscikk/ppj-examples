package cw07.cw04;

import java.util.Arrays;
import java.util.Random;

public class Cw4 {

    public void method() {
        int[][] array = new int[10][10];
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                array[i][j] = random.nextInt(101);
            }
        }

        for (int i = 0; i < 10; i++) {
            Arrays.sort(array[i]);
        }
    }


}
