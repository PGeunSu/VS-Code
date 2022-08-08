import java.util.Scanner;

public class Rocksp {
    public static void main(String[] args) {

        int input;
        char com;
        int comNumer = 0;

        System.out.println("바위 : 1\n가위 : 2\n  보 : 3\n중에 알파벳 하나를 입력해라");

        Scanner scanner = new Scanner(System.in);

        String temp = scanner.nextLine();

        input = Integer.parseInt(temp);

        comNumer = (int) (Math.random() * 10) + 1;

        if (comNumer > 3) {
            com = 'A';
        } else if (comNumer > 6) {
            com = 'B';
        } else {
            com = 'C';
        }

        switch (input) {
            case 1: // 사용자가 바위일 떄
                switch (com) {
                    case 'A':
                        System.out.println("컴퓨터 : 바위 \n플레이어 : 바위 \n비겼습니다");
                        break;
                    case 'B':
                        System.out.println("컴퓨터 : 가위 \n플레이어 : 바위 \n이겼습니다");
                        break;
                    case 'C':
                        System.out.println("컴퓨터 : 보 \n플레이어 : 바위 \n졌습니다");
                        break;
                }
                break;
            case 2: // 사용자가 가위일 때
                switch (com) {
                    case 'A':
                        System.out.println("컴퓨터 : 바위 \n플레이어 : 가위 \n졌습니다");
                        break;
                    case 'B':
                        System.out.println("컴퓨터 : 가위 \n플레이어 : 가위 \n비겼습니다");
                        break;
                    case 'C':
                        System.out.println("컴퓨터 : 보 \n플레이어 : 가위 \n이겼습니다");
                        break;
                }
                break;
            case 3: // 사용자가 보일 때
                switch (com) {
                    case 'A':
                        System.out.println("컴퓨터 : 바위 \n플레이어 : 보 \n이겼습니다");
                        break;
                    case 'B':
                        System.out.println("컴퓨터 : 가위 \n플레이어 : 보 \n졌습니다");
                        break;
                    case 'C':
                        System.out.println("컴퓨터 : 보 \n플레이어 : 보 \n비겼습니다");
                        break;
                }
        }
        scanner.close();
    }

}
