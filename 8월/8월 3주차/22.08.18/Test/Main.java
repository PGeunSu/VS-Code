import java.util.*;

public class Main {
    public static void main(String[] args) {

        Student st1 = new Student("학생1", "1234");
        Student st2 = new Student("학생2", "4321");
        Student st3 = new Student("학생3", "5678");
        Student st4 = new Student("학생4", "8765");

        ArrayList<Student> list = new ArrayList<Student>();

        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);

        for (Student e : list) { // 이름, 학번 출력
            System.out.print("이름 : " + e.getName() + " ");
            System.out.println("학번 : " + e.getNo() + " ");
        }

        Scanner sc = new Scanner(System.in);
        boolean flag = false;

        while (true) {
            System.out.println("계속 검색을 하고싶으시면 y, 종료하고 싶으시면 n을 누르시오");
            String input = sc.next();

            if (input.equals("y")) {
                System.out.println("검색을 시작합니다");
                String name = sc.next();

                for (Student e : list) {
                    if (e.getName().equals(name)) {
                        System.out.println("해당하는 학생의 학번은 : " + e.getNo());
                        flag = true;
                    }

                }
                if (!flag) { // !flag = !false : true
                    System.out.println("해당하는 학생의 이름이 없습니다.");
                }
            } else if (input.equals("n")) {
                break;
            }

        }
        System.out.println("프로그램이 종료되었습니다");
    }
}
