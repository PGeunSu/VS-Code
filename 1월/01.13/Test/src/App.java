import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);

       System.out.print("숫자를 입력하세여 : ");
       int c = sc.nextInt();

       System.out.println(c);

       sc.close();
    }
}
