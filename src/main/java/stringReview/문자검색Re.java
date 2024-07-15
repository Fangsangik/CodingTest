package stringReview;

/*
세준이는 영어로만 이루어진 어떤 문서를 검색하는
함수를 만들려고 한다. 이 함수는 어떤 단어가 총 몇 번 등장하는지 세려고 한다.
그러나, 세준이의 함수는 중복되어 세는 것은 빼고 세야 한다.
예를 들어, 문서가 abababa이고, 그리고 찾으려는 단어가 ababa라면,
세준이의 이 함수는 이 단어를 0번부터 찾을 수 있고, 2번부터도 찾을 수 있다. 그러나 동시에 셀 수는 없다.

세준이는 문서와 검색하려는 단어가 주어졌을 때, 그 단어가 최대 몇 번 중복되지 않게 등장하는지 구하는 프로그램을 작성하시오.

입력
첫째 줄에 문서가 주어진다. 문서의 길이는 최대 2500이다. 둘째 줄에 검색하고 싶은 단어가 주어진다. 이 길이는 최대 50이다.
문서와 단어는 알파벳 소문자와 공백으로 이루어져 있다.

출력
첫째 줄에 중복되지 않게 최대 몇 번 등장하는지 출력한다.
 */

import java.util.HashMap;
import java.util.Scanner;

public class 문자검색Re {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        System.out.println(getStr(str1, str2));
    }

    private static int getStr(String str1, String str2) {
        int cnt = 0;
        int idx = -1;

        while ((idx = str1.indexOf(str2, idx)) != -1) {
            cnt++;
            idx += str2.length();
        }

        return cnt;
    }
}
