package stringReview;

/*
문제
알파벳 대소문자로 된 단어가 주어지면,
이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오.
단, 대문자와 소문자를 구분하지 않는다.

입력
첫째 줄에 알파벳 대소문자로 이루어진 단어가 주어진다.
주어지는 단어의 길이는 1,000,000을 넘지 않는다.

출력
첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다. 단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다
 */

import java.util.HashMap;
import java.util.Scanner;

public class 단어공부re {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String src = sc.nextLine();

        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : src.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        char frequentMaxVal = ' ';
        int maxCnt = 0;
        boolean isTie = false;

        for (char c : map.keySet()) {
            int frequentVal = map.get(c);
            frequentMaxVal = c;
            maxCnt = frequentMaxVal;
            isTie = false;

            if (frequentVal == frequentMaxVal) {
                isTie = true;
            }
        }

        if (isTie) {
            System.out.println("?");
        } else {
            System.out.println(maxCnt);
        }
    }
}
