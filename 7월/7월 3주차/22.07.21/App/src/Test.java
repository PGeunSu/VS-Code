
class Student {

    String name;
    int height;
    int weight;
    int age;

    void weightTest() {

        weight = (int) (Math.random() * 40) + 50;
    }

    void heightTest() {

        height = (int) (Math.random() * 20) + 160;

    }

    void ageTest() {
        age = (int) (Math.random() * 10) + 20;
    }

}

public class Test {
    public static void main(String[] args) {

        Student[] infor = new Student[20];

        for (int i = 0; i < infor.length; i++) {
            infor[i] = new Student();
        }

        System.out.println("========================================================");
        System.out.println("번호\t이름\t나이\t키\t몸무게");
        for (int i = 0; i < infor.length; i++) {
            infor[i].weightTest();
            infor[i].heightTest();
            infor[i].ageTest();
            System.out.printf("%d\t학생%d\t%d살\t%dcm\t%dkg%n", i + 1, i + 1, infor[i].age, infor[i].height,
                    infor[i].weight);

        }
    }
}
