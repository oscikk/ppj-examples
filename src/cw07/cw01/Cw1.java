package cw07.cw01;

import java.util.Random;

public class Cw1 {
    private void method() {
        Random random = new Random();
        int[] fist = random.ints(random.nextInt(10), 0, 100).toArray();
        int[] second = random.ints(random.nextInt(10), 0, 100).toArray();
        int[] third = random.ints(random.nextInt(10), 0, 100).toArray();
        int[][] array = {fist, second, third};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println(array[i][j]);
            }
        }
    }
}
