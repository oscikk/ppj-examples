package cw06.cw0608;

public class Cw08 {
    private char[] reverseArray(char[] chars) {
        char[] reverse = new char[chars.length];
        for (int i = 0; i < reverse.length; i++) {
            reverse[i] = chars[reverse.length - i - 1];
        }
        return reverse;
    }
}
