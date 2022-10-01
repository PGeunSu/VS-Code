import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Prog5 {
    public static void main(String[] args) {

        FileInputStream input = null;

        try {
            // 화면에 표시하고자 하는 파일을 선택한다.
            File file = new File("c:\\java\\java8.bat");

            // FileInputStream은 File object를 생성자 변수로 받을 수 있다.
            input = new FileInputStream(file);

            int i = 0;
            while ((i = input.read()) != -1) {
                System.out.write(i);
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            try {
                // 생성된 InputStream Object를 받아준다.
                input.close();
            } catch (IOException io) {
            }
        }

    }
}
