public class PersonPro {

    private String name;
    private int age;
    private int height;
    private int weight;

    public PersonPro(String name, int age, int height, int weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

}

class Student extends PersonPro {

    private String studentID;
    private int grade;
    private double score;

    public Student(String name, int age, int height, int weight, String studentID, int grade, double score) {

        super(name, age, height, weight);
        this.studentID = studentID;
        this.grade = grade;
        this.score = score;
    }

    public String getStudentID() {
        return studentID;
    }

    public int getGrade() {
        return grade;
    }

    public double getScore() {
        return score;
    }

    public void show() {
        System.out.println("====================");
        System.out.println("이름:" + this.getName());
        System.out.println("나이:" + this.getAge());
        System.out.println("키:" + this.getHeight());
        System.out.println("몸무게:" + this.getWeight());
        System.out.println("학번:" + this.getStudentID());
        System.out.println("학년:" + this.getGrade());
        System.out.println("학점:" + this.getScore());
        System.out.println("====================");

    }
}

class Teacher extends PersonPro {

    private int teacherID;
    private int Salary; // 월급
    private int Annual; // 연차

    public Teacher(String name, int age, int height, int weight, int teacherID, int salary, int annual) {
        super(name, age, height, weight);
        this.teacherID = teacherID;
        Salary = salary;
        Annual = annual;
    }

    public int getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(int teacherID) {
        this.teacherID = teacherID;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }

    public int getAnnual() {
        return Annual;
    }

    public void setAnnual(int annual) {
        Annual = annual;
    }

    public static void main(String[] args) {

        Student st1 = new Student("박근수", 23, 176, 73, "20001013", 2, 4);
        Student st2 = new Student("박근수1", 22, 186, 71, 20001013 + "", 3, 4); // String 형태로 변환 20001013 + ""

        st1.show();
        st2.show();

    }

}