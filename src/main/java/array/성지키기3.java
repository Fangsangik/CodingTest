package array;

import java.util.Scanner;

public class 성지키기3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        char[][] map = new char[N][M];

        for (int i = 0; i < map.length; i++) {
            map[i] = sc.next().toCharArray();
        }

        // 1. 각 행/열에 대해 경비원이 있는지 확인
        // 체크 배열을 통해서 row, col을 한번만 돌면
        // 경비원이 어디 있는지 한번에 확인 가능
        boolean[] existRowCnt = new boolean[N];
        boolean[] existColCnt = new boolean[M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (map[i][j] == 'X') {
                    existRowCnt[i] = true;
                    existColCnt[j] = true;
                }
            }
        }

        // 2. 보호받지 못하는 행/열의 개수 구한다.
        int needRowCnt = 0;
        int needColCnt = 0;
        for (int i = 0; i < N; i++) {
            if (existRowCnt[i]) {
                needRowCnt--;
            }
        }
        for (int i = 0; i < M; i++) {
            if (existRowCnt[i]) {
                needColCnt--;
            }
        }

        // 3. 둘 중 큰 갑을 출력
        System.out.println(Math.max(needRowCnt, needColCnt));
    }
}
