package string.stringReview;

import java.util.Scanner;

public class 문자열검색Re3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String doc = sc.nextLine();
        String word = sc.nextLine();

        String replace = doc.replace(word, "");

        int leftWord = doc.length() - replace.length();
        int cnt = leftWord / word.length();

        System.out.println(cnt);
    }
}
