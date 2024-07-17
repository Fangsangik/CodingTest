package string.stringReview;

import java.util.Scanner;

public class 단어공부re1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine().toUpperCase();

        int[] cnt = getAlphabet(str);
        int maxCnt = -1;
        char maxIdx = '?';

        for (int i = 0; i < 26; i++) {
            if (cnt[i] > maxCnt) {
                maxCnt = cnt[i];
                maxIdx = (char) ('A' + i);
            } else if (cnt[i] == maxCnt) {
                maxIdx = '?';
            }
        }
        System.out.println(maxIdx);
    }

    private static int[] getAlphabet(String str) {
        int[] num = new int[26];
        for (int i = 0; i < str.length(); i++) {
            num[str.charAt(i) - 'A']++;
        }
        return num;
    }
}
