package cw06.cw04;

public class Cw04 {

    public void method() {
        double[] randomValues = generateArray();
        printArray(randomValues);
        printEvenIndexes(randomValues);
        printOddElements(randomValues);
    }

    private double[] generateArray() {
        double[] array = new double[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (Math.random() * 10);
        }
        return array;
    }

    private void printArray(double[] array) {
        for (double n : array) {
            System.out.println(n);
        }
    }

    private void printEvenIndexes(double[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                System.out.println(array[i]);
            }
        }
    }

    private void printOddElements(double[] array) {
        for (double n : array) {
            int buff = (int) n;
            if (buff % 2 != 0) {
                System.out.println(n);
            }
        }
    }
}
