import java.util.Scanner;

public class Person1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("학생수를 입력하세요 : ");

        int input = sc.nextInt();

        Student[] students = new Student[input];

        for (int i = 1; i < input + 1; i++) {
            String name;
            int age;
            int height;
            int weight;
            String studentID;
            int grade;
            Double score;

            System.out.println(i + "번째 학생의 이름을 입력하세요 : ");
            name = sc.next();
            System.out.println(i + "번째 학생의 나이를 입력하세요 : ");
            age = sc.nextInt();
            System.out.println(i + "번째 학생의 키를 입력하세요 : ");
            height = sc.nextInt();
            System.out.println(i + "번째 학생의 몸무게를 입력하세요 : ");
            weight = sc.nextInt();
            System.out.println(i + "번째 학생의 학번을 입력하세요 : ");
            studentID = sc.next();
            System.out.println(i + "번째 학생의 학년을 입력하세요 : ");
            grade = sc.nextInt();
            System.out.println(i + "번째 학생의 학점을 입력하세요 : ");
            score = sc.nextDouble();

            students[i] = new Student(name, age, height, weight, studentID, grade, score);

        }

        for (int i = 0; i < input; i++) {
            students[i].show();

        }
    }
}