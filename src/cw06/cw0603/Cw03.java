package cw06.cw0603;

public class Cw03 {

    public void method() {
        int[] randomNumbers = generateArray();
        int zero = 0;
        int one = 0;
        for (int randomNumber : randomNumbers) {
            if (randomNumber == 1) {
                one++;
            } else {
                zero++;
            }
        }
    }

    private int[] generateArray() {
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            int number = (int) (Math.random() * 2);
            array[i] = number;
        }
        return array;
    }

}
