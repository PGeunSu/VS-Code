import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("바나나 : 1, 복숭아 : 2 ");
        System.out.println("둘 중에 하나를 선택해라");

        int input = sc.nextInt();

        Fruit fruit;

        if (input == 1) {
            fruit = new Banana();
            fruit.show();

        } else if (input == 2) {
            fruit = new Peach();
            fruit.show();
        }

    }
}
