package string;

import java.util.Scanner;

public class 문서검색2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //next -> 하나의 단어만 받는다.
        //nextLine -> 공백 포함해서 전체 문자을 인식
        String doc = sc.nextLine();
        String word = sc.nextLine();

        int cnt = 0;
        int startIdx = 0;
        while (true) {
            int findIdx = doc.indexOf(word, startIdx);
            if (findIdx < 0) {
                break;
            }
            cnt++;
            //i의 값이 증가하지 않기 때문에 -> word.length -1 X
            startIdx = findIdx + word.length();
        }
        System.out.println(cnt);
    }
}
