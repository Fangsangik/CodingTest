package string.stringReview;

import java.util.Scanner;

public class 문자검색Re2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String word = sc.nextLine();

        int cnt = 0;
        int idx = -1;

        while (true) {
            int findIdx = str.indexOf(word, idx);
            if (findIdx < 0) {
                break;
            }

            cnt++;
            idx = findIdx + word.length();
        }
        System.out.println(cnt);
    }
}
