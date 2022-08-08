import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {

        int num = 0;
        int sum = 0;
        System.out.println("더할 숫자를 입력해라");

        Scanner scanner = new Scanner(System.in);

        String temp = scanner.nextLine();
        num = Integer.parseInt(temp);

        while (num != 0) {
            sum = sum + num % 10;
            num = num / 10;
        }
        System.out.println(sum);
        scanner.close();
    }

}
