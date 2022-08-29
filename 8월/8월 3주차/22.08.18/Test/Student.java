public class Student {

    private String name; // 학생 이름
    private String no; // 학생 학번

    public String getName() {
        return name;
    }

    public String getNo() {
        return no;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public Student(String name, String no) { // 생성자 함수
        this.name = name;
        this.no = no;
    }
}
