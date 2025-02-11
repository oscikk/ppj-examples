package cw07.cw03;

public class Cw3 {

    public void method() {
        char[][] tab = {
                {'S', 'a', 'm', 's', 'u', 'n', 'g'},
                {'N', 'o', 'k', 'i', 'a'},
                {'A', 'p', 'p', 'l', 'e'},
                {'B', 'l', 'a', 'c', 'k', 'B', 'e', 'r', 'r', 'y'},
                {'A', 'l', 'c', 'a', 't', 'e', 'l'},
                {'S', 'o', 'n', 'y'},
                {'J', 'o', 'l', 'l', 'a'}
        };

        for (char[] name : tab) {
            int sameLetters = 0;
            int asciiSum = 0;
            boolean hasI = false;

            for (int i = 0; i < name.length; i++) {
                asciiSum += name[i];
                if (Character.toLowerCase(name[i]) == 'i') {
                    hasI = true;
                }

                for (int j = i + 1; j < name.length; j++) {
                    if (Character.toLowerCase(name[i]) == Character.toLowerCase(name[j])) {
                        sameLetters++;
                        break;
                    }
                }
            }
            if (sameLetters > 0 && asciiSum > 255 && hasI) {
                System.out.println(new String(name) + " spełnia przynajmniej 3 warunki.");
            }
        }
    }

}
