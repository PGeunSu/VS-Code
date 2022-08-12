import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {

        long deposit = 0;

        while (true) {

            System.out.println("<< ATM >>");
            System.out.println("1.  입금");
            System.out.println("2.  출금");
            System.out.println("3.  조회");
            System.out.println("4.  종료");
            System.out.print(">>");

            Scanner sc = new Scanner(System.in);

            int select = sc.nextInt();

            switch (select) {

                case 1:
                    while (true) {
                        System.out.print("\n입금할 금액을 입력하세요 : ");
                        long currentDepsit = sc.nextInt();

                        if (currentDepsit >= 1) {
                            deposit += currentDepsit;
                            break;
                        } else {
                            System.out.println("(경고) 1원 이상의 금액을 입력하세요\n");
                        }
                    }
                    System.out.println("입금이 완료 되었습니다");

                    // 현재 잔액 표시
                    System.out.println("\n현재 잔액 : " + deposit + "원\n");
                    break;

                case 2:

                    System.out.println("\n현재 잔액 : " + deposit + "원\n");

                    // 잔액이 없을 시
                    if (deposit == 0) {
                        System.out.println("(경고) 잔액이 없습니다. \n");
                    } else {
                        while (true) {
                            System.out.print("\n 출금할 금액을 입력하세요 (0 : 빠져나가기) : ");
                            long currentWidthdraw = sc.nextLong();

                            if (currentWidthdraw < 0) {
                                System.out.println("(경고) 마이너스 단위는 출금할 수 없습니다.\n");
                            } else if (currentWidthdraw == 0) {
                                System.out.println("(경고) 출금 절차를 종료합니다.\n");
                                break;
                            } else if (currentWidthdraw > deposit) {
                                System.out.println("(경고) 잔액보다 많은 액수를 출금할 수 없습니다.");
                            } else {
                                deposit -= currentWidthdraw;
                                System.out.println(currentWidthdraw + "원의 출금을 완료하였습니다.");
                                System.out.println("\n현재 잔액 : " + deposit + "원\n");
                                break;
                            }
                        } // while 끝
                    }
                    break;

                case 3:

                    System.out.println("\n현재 잔액 : " + deposit + "원\n");
                    break;

                case 4:

                    System.out.println("\nATM을 종료합니다. 두고가시는 물건이 없는 지 확인해주세요");
                    System.exit(0);

                default:
                    System.out.println("올바른 메뉴 번호를 입력하세요. (1~4)");

                    sc.close();
            }

        }

    }
}
