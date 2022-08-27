import java.util.Scanner;

public class CharatorInformation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("마법사 : 1, 암살자 : 2, 탱커 : 3");
        System.out.println("캐릭터의 능력치를 보고싶으시면 숫자를 입력하세요");

        int input = sc.nextInt();

        TestGame charator;

        if (input > 3) {
            System.out.println("1,2,3에 '숫자'로민 입력하실 수 있습니다.");
            return;
        }
        if (input == 1) {
            charator = new Wizard();
            charator.show();

        } else if (input == 2) {
            charator = new Assassin();
            charator.show();
        } else if (input == 3) {
            charator = new Tanker();
            charator.show();
        }

    }
}
