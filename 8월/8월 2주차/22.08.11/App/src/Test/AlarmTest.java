package Test;

import java.util.*;

public class AlarmTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("시간을 입력하세요 시 : 0~23, 분 : 0~60");

        int hour = sc.nextInt();
        int minute1 = sc.nextInt();

        sc.close();

        int minute = 0; // 분 결과값 저장

        if (hour < 0 && hour > 23) {
            if (minute1 < 0 && minute1 > 60) {
                System.out.println("범위는 시 : 0~23, 분 : 0~60으로만 입력 가능합니다.");
                return;
            }
        }
        if (minute1 - 45 < 0) {
            hour--;
            int input = minute1 - 45; // 결과값 저장
            minute = 60 + input;
            if (hour < 0) {
                hour = 23;
            }
        } else if (minute1 - 45 > 0) {
            minute = minute1 - 45;
        }

        System.out.println("자동알람이 " + hour + "시 " + minute + "분으로 설정 되었습니다");

    }
}
