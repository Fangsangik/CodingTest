package string;

/*
문제
두 영어 단어가 철자의 순서를 뒤바꾸어 같아질 수 있을 때,
그러한 두 단어를 서로 애너그램 관계에 있다고 한다.
예를 들면 occurs 라는 영어 단어와 succor 는 서로 애너그램 관계에 있는데,
occurs의 각 문자들의 순서를 잘 바꾸면 succor이 되기 때문이다.

한 편, dared와 bread는 서로 애너그램 관계에 있지 않다.
하지만 dared에서 맨 앞의 d를 제거하고, bread에서 제일 앞의 b를 제거하면,
ared와 read라는 서로 애너그램 관계에 있는 단어가 남게 된다.

두 개의 영어 단어가 주어졌을 때, 두 단어가 서로 애너그램 관계에 있도록 만들기 위해서 제거해야 하는
최소 개수의 문자 수를 구하는 프로그램을 작성하시오. 문자를 제거할 때에는 아무 위치에 있는 문자든지 제거할 수 있다.

입력
첫째 줄과 둘째 줄에 영어 단어가 소문자로 주어진다.
각각의 길이는 1,000자를 넘지 않으며, 적어도 한 글자로 이루어진 단어가 주어진다.

출력
첫째 줄에 답을 출력한다.

어떤 문자들이 제거 되야 하는지 찾아야 한다.
 */

import java.util.HashMap;
import java.util.Scanner;

/*
getOrDefault 메소드를 사용하여 해시맵에서 키가 존재하지 않을 때 기본값을 반환하도록 하는 방식은 매우 유용
 */

public class 애너그램만들기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        for (char c : str1.toCharArray()) {
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }

        for (char c : str2.toCharArray()) {
            map2.put(c, map2.getOrDefault(c, 0) + 1);
        }

        int rst = 0;

        for (char c : map1.keySet()) {
            int cnt = map1.get(c); // 첫 번째 문자열의 현재 문자의 빈도를 가져옴
            int cnt2 = map2.getOrDefault(c, 0); // 두번째 문자열의 헌재 빈도를 가져옴
            rst += Math.abs(cnt - cnt2); // 두빈도의 차이를 절대값으로 반환
        }

        for (char c : map2.keySet()) {
            if (!map1.containsKey(c)){
                rst += map2.get(c);
            }
        }

        System.out.println(rst);
    }
}
