import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int num1 = Integer.parseInt(input);

        System.out.println("시급 : " + num1 + "원");

        int daily = num1 * 8;

        System.out.println("일급 : " + daily + "원");

        int salary = daily * 20;

        System.out.println("당신의 급여는 " + salary + "원 입니다.");

        scanner.close();
    }

}
