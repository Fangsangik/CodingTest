package string;

import java.util.Scanner;

public class 단어공부2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine().toUpperCase();

        int[] cnt = getAlphabetCnt(str);

        int maxCnt = -1;
        char maxIndex = '?'; //알파벳이 뭔지 인식

        //1번째 방법
        for (int i = 0; i < 26; i++) {
            if (cnt[i] > maxCnt) {
                maxCnt = cnt[i]; //항상 최대 값이 들어 있다.
                maxIndex =(char) ('A' + i); //maxCnt가 갱신이 될때 마다 maxIndex도 i로 갱신

            } else if (cnt[i] == maxCnt) { //maxCnt에는 가장 많이 등장한 알파벳의 개수가 들어있음
                maxIndex = '?';
            }
        }

        //2번째 방법
        for (char i = 'A'; i < 'Z'; i++) {
            int cnt1 = getAlphabetCnt(str, i);
            if (cnt1 > maxCnt) {
                maxCnt = cnt1;
                maxIndex = i;
            }else if (cnt[i] == maxCnt) { //maxCnt에는 가장 많이 등장한 알파벳의 개수가 들어있음
                maxIndex = '?';
            }
        }
        
        System.out.println(maxIndex); //대문자 출력
    }

    private static int[] getAlphabetCnt(String str) {
        int[] cnt = new int[26];
        for (int i = 0; i < str.length(); i++) {
            cnt[str.charAt(i) - 'A']++;
        }
        return cnt;
    }

    private static int getAlphabetCnt(String str, char alp) {
        int cnt = 0;
        for (int i = 0; i < str.length(); i++) {
            if (alp == str.charAt(i)){
                cnt++;
            }
        }
        return cnt;
    }
}
