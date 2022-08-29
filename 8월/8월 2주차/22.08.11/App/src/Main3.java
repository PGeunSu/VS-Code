import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        File file = new File("text.txt");

        Scanner sc;

        try {
            sc = new Scanner(file);

            while (sc.hasNext()) {
                System.out.println(sc.next());
            }

        } catch (FileNotFoundException e) {

            e.printStackTrace();
        }

    }
}// text 파일은 반드시 이클립스의 프로젝트를 폴더 최상위에 생성해야함 (src, 패지기 폴더 X)
 // File 클래스를 이용해 특정 파일을 읽을 수 있도록 스트립 생성
 // File 객체를 scanner 클래스의 생성자 인자로 전달
 // 파일로부터 데이터가 있을 때 까지 읽어서 출력
