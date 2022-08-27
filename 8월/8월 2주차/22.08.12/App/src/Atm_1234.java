import java.util.*;

public class Atm_1234 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] ids = new int[5];
        // int[] ids= {1001, 1002, 1003, 1004, 1005};
        int[] pws = new int[5];
        // int[] pws= {1111, 2222, 3333, 4444, 5555};
        int[] moneys = new int[5];
        // int[] moneys= {1, 10, 100, 1000, 10000};
        int[] places = new int[5];
        int[] placesids = new int[5];
        int[] placespws = new int[5];

        int count = 0;
        int index = -1;
        int tranIdx = -1;
        int login = 0;
        boolean work = true;

        while (work) {
            int end = 0;
            int check = 0;

            while (login == 1) {
                System.out.println("ID(" + ids[index] + ")| " + moneys[index] + "원");
                System.out.println("============ ATM MENU ============");
                System.out.println("| 1.입금      |5.로그아웃    |");
                System.out.println("| 2.출금      |6.회원수정    |");
                System.out.println("| 3.이체      |7.회원탈퇴    |");
                System.out.println("| 4.종료      |             |");
                System.out.println("===================================");
                System.out.println("-----------------------------------");
                System.out.println("[회원수] : " + count + "명,    [현재접속자] : " + ids[index]);
                System.out.println("-----------------------------------");
                System.out.print("**메뉴를 입력하세요 : ");
                int selectL = scan.nextInt();

                if (selectL == 1) {
                    System.out.print("[입력]입금할 금액을 입력해주세요 : ");
                    int inputMoney = scan.nextInt();
                    moneys[index] += inputMoney;
                    System.out.println("[메세지]계좌에 " + moneys[index] + "원이 있습니다.");
                }

                else if (selectL == 2) {
                    while (true) {
                        System.out.print("[입력]출금할 금액을 입력해주세요 : ");
                        int outputMoney = scan.nextInt();
                        if (outputMoney > moneys[index]) {
                            System.out.println("[메세지]금액이 부족합니다!");
                            continue;
                        }
                        moneys[index] -= outputMoney;
                        System.out.println("[메세지]계좌에 " + moneys[index] + "원이 있습니다.");
                        break;
                    }
                }

                else if (selectL == 3) {
                    System.out.print("[입력]이체할 ID를 선택해주세요 :");
                    int transId = scan.nextInt();
                    for (int i = 0; i < ids.length; i++) {
                        if (transId == ids[i]) {
                            tranIdx = i;
                            check = 2;
                        }
                    }
                    if (check != 2) {
                        System.out.println("[메세지]이체할 ID를 확인해주세요.");
                        continue;
                    }
                    System.out.print("[입력]이체할 금액을 선택해주세요 : ");
                    int transMoney = scan.nextInt();
                    if (transMoney > moneys[index]) {
                        System.out.println("[메세지] 금액이 부족합니다!");
                        continue;
                    }
                    moneys[index] -= transMoney;
                    moneys[tranIdx] += transMoney;

                    System.out.println("[메세지]현 계좌에는 " + moneys[index] + "원이 있습니다.");
                    System.out.println("[메세지]입금된 계좌에는 " + moneys[tranIdx] + "원이 있습니다.");
                }

                else if (selectL == 4) {
                    end = 1;
                    break;
                } else if (selectL == 5) {
                    login = 0;
                } else if (selectL == 6) {
                    System.out.print("[입력]새로운 비밀번호를 입력해주세요 : ");
                    int changePW = scan.nextInt();
                    pws[index] = changePW;
                    System.out.println("[메세지]비밀번호가 변경되었습니다!");
                } else if (selectL == 7) {
                    if (index == 4) {
                        ids[index] = 0;
                        pws[index] = 0;
                        moneys[index] = 0;
                    }
                    for (int i = index; i < ids.length - 1; i++) {
                        ids[index] = ids[index + 1];
                        pws[index] = pws[index + 1];
                        moneys[index] = moneys[index + 1];
                        ids[index + 1] = 0;
                        pws[index + 1] = 0;
                        moneys[index + 1] = 0;
                    }
                    count--;
                    login = 0;
                    System.out.println("[메세지]회원탈퇴 되었습니다.");
                } else {
                    System.out.println("[메세지]올바른 메뉴를 선택해주세요.");
                }
            }
            if (end == 1) {
                System.out.println("[메세지]ATM 사용을 종료합니다.");
                work = false;
                break;
            }

            System.out.println("============ ATM MENU ============");
            System.out.println("| 1.회원가임    |");
            System.out.println("| 2.로그인   |");
            System.out.println("| 3.전체회원목록   |");
            System.out.println("| 4.종료      |");
            System.out.println("===================================");
            System.out.print("**메뉴를 입력하세요 : ");
            int select = scan.nextInt();

            if (select == 1) {
                if (count == 5) {
                    System.out.println("[메세지]계정 생성 불가 : 데이터베이스가 가득 찼습니다.");
                    continue;
                }
                System.out.print("[입력]사용하실 ID를 입력해주세요 : ");
                int newID = scan.nextInt();
                for (int i = 0; i < ids.length; i++) {
                    if (newID == ids[i]) {
                        check = -1;
                    }
                }
                if (check == -1) {
                    System.out.println("[메세지]이미 사용되고 있는 ID입니다.");
                    continue;
                }
                ids[count] = newID;

                System.out.print("[입력]사용하실 비밀번호를 입력해주세요 : ");
                int newPW = scan.nextInt();
                pws[count] = newPW;

                System.out.println("[메세지]가입이 완료되었습니다.");

                moneys[count] = 1000;
                count++;
            }

            else if (select == 2) {
                System.out.print("[입력]ID를 입력하세요 : ");
                int inputID = scan.nextInt();
                for (int i = 0; i < ids.length; i++) {
                    if (ids[i] == inputID) {
                        check = 1;
                        index = i;
                    }
                }
                if (check != 1) {
                    System.out.println("[메세지]아이디를 찾을 수 없습니다.");
                    continue;
                }
                System.out.print("[입력]비밀번호를 입력하세요 : ");
                int inputPW = scan.nextInt();
                if (inputPW != pws[index]) {
                    System.out.println("[메세지]비밀번호를 확인해주세요.");
                    continue;
                }
                login = 1;
                System.out.println("[메세지]로그인 되었습니다.");
            }

            else if (select == 3) {
                for (int j = 0; j < count; j++) {
                    int moneyplace = 4;
                    for (int i = 0; i < count; i++) {
                        if (moneys[j] > moneys[i]) {
                            moneyplace--;
                        } else if (moneys[j] == moneys[i]) {
                            if (j > i) {
                                moneyplace--;
                            }
                        }
                    }
                    places[moneyplace] = moneys[j];
                    placesids[moneyplace] = ids[j];
                    placespws[moneyplace] = pws[j];
                }
                for (int i = 0; i < moneys.length; i++) {
                    System.out.println(placesids[i] + " / " + placespws[i] + " / " + places[i] + "원");
                }
                System.out.println();
            }

            else if (select == 4) {
                System.out.println("[메세지]ATM 사용을 종료합니다.");
                work = false;
            }

            else {
                System.out.println("[메세지]올바른 메뉴를 선택해주세요.");
            }
        }

    }

}