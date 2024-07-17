package string.stringReview;

import java.util.Scanner;

public class 단어공부re2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine().toUpperCase();

        int maxCnt = -1;
        char maxIdx = '?';

        for (char i = 'A'; i < 'z'; i++) {
            int cnt = getAlphabet(str, i);
            if (cnt > maxCnt) {
                maxCnt = cnt;
                maxIdx = i;
            } else if (maxCnt == cnt) {
                maxIdx = '?';
            }
        }
        System.out.println(maxIdx);
    }

    private static int getAlphabet(String str, char alp) {
        int cnt = 0;
        for (int i = 0; i < str.length(); i++) {
            if (alp == str.charAt(i)) {
                cnt++;
            }
        }
        return cnt;
    }
}
