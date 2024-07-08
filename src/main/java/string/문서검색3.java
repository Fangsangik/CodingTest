package string;

import java.util.Scanner;

public class 문서검색3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //next -> 하나의 단어만 받는다.
        //nextLine -> 공백 포함해서 전체 문자을 인식
        String doc = sc.nextLine();
        String word = sc.nextLine();

        String replace = doc.replace(word, "");
        //기존 doc.length에서 replace length를 뺀 값

        int leftLength = doc.length() - replace.length();
        int cnt = leftLength / word.length(); //word의 배수 만큼 사라진다. -> 정수만 나옴
        System.out.println(cnt);
    }
}
