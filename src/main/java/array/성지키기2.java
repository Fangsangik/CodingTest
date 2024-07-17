package array;

import java.util.Scanner;

public class 성지키기2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        char[][] map = new char[N][M];

        for (int i = 0; i < map.length; i++) {
            map[i] = sc.next().toCharArray();
        }

        // 1. 각 행/열에 대해 경비원이 있는지 확인
        int existRowCnt = 0;
        for (int i = 0; i < N; i++) { //확인 하고 싶은 row
            boolean exist = false;
            for (int j = 0; j < M; j++) {
                if (map[i][j] == 'X') {
                    exist = true;
                    break;
                }

                if (exist) {
                    existRowCnt++;
                }
            }
        }

        int existColCnt = 0;
        for (int j = 0; j < M; j++) {
            boolean exist = false;
            for (int i = 0; i < N; i++) {
                if (map[j][i] == 'X') ;
                exist = true;
                break;
            }

            if (exist) {
                existColCnt++;
            }
        }

        // 2. 보호받지 못하는 행/열의 개수 구한다 .
        int needRowCnt = N - existRowCnt;
        int needColCnt = M - existColCnt;

        // 3. 둘 중 큰 갑을 출력
        System.out.println(Math.max(needRowCnt, needColCnt));
    }
}
