package string.stringReview;

/*
문제
영어 소문자와 대문자로 이루어진 단어를 입력받은 뒤,
대문자는 소문자로, 소문자는 대문자로 바꾸어 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 영어 소문자와 대문자로만 이루어진 단어가 주어진다.
단어의 길이는 최대 100이다.

출력
첫째 줄에 입력으로 주어진 단어에서 대문자는 소문자로,
소문자는 대문자로 바꾼 단어를 출력한다.

각 문자가 소문자 대문자 판별?
소문자를 대문자로, 대문자를 소문자로
 */

import java.util.Scanner;

public class 대소문자비교Re2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        System.out.println(changeWord(str));
    }

    static String changeWord(String str){
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if ('A' <= c && c <= 'Z') {
                sb.append((char) ('a' + c - 'A'));
            } else if ('a' <= c && c <= 'z'){
                sb.append((char) ('A' + c - 'a'));
            } else {
                sb.append(c);
            }
        }

        return sb.toString();
    }
}
