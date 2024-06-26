package string;

import java.util.Scanner;

public class 애너그램만들기2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        int[] cntA = getAlpabet(a);
        int[] cntB = getAlpabet(b);


        int answer = 0;
        //a와 b의 개수의 차를 더해주면 됨
        for (int i = 0; i < 26; i++) {
            answer += Math.abs(cntA[i] - cntB[i]);
        }
        System.out.println(answer);
    }

    public static int[] getAlpabet(String s) {
        int[] cnt = new int[26];
        for (int i = 0; i < s.length(); i++) {
            cnt[s.charAt(i) - 'a']++;
        }
        return cnt;
    }
}
