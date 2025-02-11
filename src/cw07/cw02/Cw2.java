package cw07.cw02;

import java.util.Random;

public class Cw2 {
    private void method() {
        int[][] array = new int[8][8];
        Random random = new Random();

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                array[i][j] = random.nextInt(11);
            }
        }
        checkDiagonal(array);
    }

    public void checkDiagonal(int[][] array) {
        int[] counts = new int[11];

        for (int i = 0; i < array.length; i++) {
            counts[array[i][i]]++;
            if (i != array.length - 1 - i) {
                counts[array[i][array.length - 1 - i]]++;
            }
        }

        boolean hasAtLeastThreeSame = false;
        for (int count : counts) {
            if (count >= 3) {
                hasAtLeastThreeSame = true;
                break;
            }
        }

        System.out.println("Na przekątnych występują co najmniej 3 takie same liczby: " + hasAtLeastThreeSame);
    }

}
