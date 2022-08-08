public class Type {
    public static void main(String[] args) {

        // 형변환
        // 형변환 하고자 하는 변수나 리터럴 앞에 변환하고자 하는 타입을 괄호와 함꼐 붙여주면 됨. (괄호와 함께)
        double d = 12.3;
        int score = (int) d;
        System.out.println(score);// 12
        System.out.println(d);// 12.3
        // 결과만 리턴 하되 변수값은 변경되지 않음

        // 기본형 타입에서 boolean을 제외한 나머지 타입들은 서로 형변환이 가능
        // 참고로 기본형과 참조형 간의 형변환은 불가능하다.
        /*
         * int->char (char)65 'A'
         * char->int (int)'A' 65
         * float->int (int)1.4f 1(반올림 하지안호 버림)
         * int->float (float)int 10.0f
         * 
         */

        int charTypeCasting = 65;
        System.out.println((char) charTypeCasting); // A
        char intTypeCasting = 'A';
        System.out.println((int) intTypeCasting); // 65

        float floatToint = 3.6f;
        System.out.println((int) floatToint); // 3

        int intfloat = 10;
        System.out.println((float) intfloat); // 10.0

        // 자동 형변환
        // float f = 1234; //float f = (float)1234;
    }
}
    