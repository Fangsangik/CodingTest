package string;

/*
철수는 화학 시험을 망치고, 애꿎은 화학 선생님에게 복수를하기로 한다.

철수는 집에서 만든 자동 로봇팔을 선생님의 책상에 숨겨, 선생님이 수업을 시작하려 들어온 순간 숨겨놓은 로봇팔을 이용해 선생님을 혼내주려고한다. 철수는 선생님이 늘 애용하는 물컵에 시간이 되면 로봇팔이 소금을 잔뜩 집어넣도록 프로그램을 짜려고한다.

철수는 현재시각과 선생님이 언제 컵을 사용할지 시간을 알고있지만, 수 계산에 정말 약해서 로봇팔에 입력해야할 시간 계산을 못한다. 철수가 로봇팔에 알맞은 시간을 입력할수 있도록 도와주자.

입력
첫째 줄에는 현재 시각이 hh:mm:ss로 주어진다. 시간의 경우 0≤h≤23 이며, 분과 초는 각각 0≤m≤59, 0≤s≤59 이다.

두 번째 줄에는 소금 투하의 시간이 hh:mm:ss로 주어진다.

출력
로봇팔이 소금을 투하할때까지 필요한 시간을 hh:mm:ss로 출력한다. 이 시간은 1초보다 크거나 같고, 24시간보다 작거나 같다
 */

import java.util.Scanner;

public class 소금폭탄2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //":" 문자를 기준으로 시간, 분, 초를 쪼갠다.
        String input = sc.next();
        String drop = sc.next();

        //아스키코드 활용
        int curHour = (input.charAt(0) - '0') * 10 + input.charAt(1) - '0';
        int curMinute = (input.charAt(3) - '0') * 10 + input.charAt(4) - '0';
        int curSecond =(input.charAt(6) - '0') * 10 + input.charAt(7) - '0';

        int curSecondAmount = curHour * 3600 + curMinute * 60 + curSecond;


        int dropHour = (drop.charAt(0) - '0') * 10 + drop.charAt(1) - '0';
        int dropMinute = (drop.charAt(3) - '0') * 10 + drop.charAt(4) - '0';
        int dropSecond =(drop.charAt(6) - '0') * 10 + drop.charAt(7) - '0';

        int dropSecondAmount = dropHour * 3600 + dropMinute * 60 + dropSecond;


        int needSecondAmount = dropSecondAmount - curSecondAmount;
        if (needSecondAmount <= 0) { //00:00:00가 나오면 안됨 문제 조건을 보면 확인 할 수 있다.
            needSecondAmount += 24 * 3600;
        }

        int needHour = needSecondAmount / 3600;
        int needMinute = (needSecondAmount % 3600) / 60;
        int needSecond = needSecondAmount % 60;

        System.out.printf("%02d:%02d:%02d", needHour, needMinute, needSecond);

        //두 시간, 분, 초의 차이를 계산

    }
}
