public class App {
    public static void main(String[] args) {

        String[] name = new String[3];

        name[0] = "우영우";
        name[1] = "동그라미";
        name[2] = "변호사";

        String[] name1 = { "우영우", "동그라미", "변호사" };

        for (String string : name1) {
            System.out.print(string);
        }

        /*
         * charAt(int index) : 문자열에서 해당위치(index)에 있는 문자를 반환한다.
         * Substring(int from, int to) : 문자열에서 해당 범위에 있는 문자열을 반환한다.
         * equals(Object obj) : 문자열의 내용이 obj와 같나 (같으면 true 아니면 false)
         * char[] toCharArray() : 문자열을 문자배열(char[])로 변환해서 리턴
         * 
         */
        String str = "ABCDE";
        char ch = str.charAt(3);
        // 문자열 str의 4번 째 문자인 D를 ch에 저장
        System.out.println(ch); // D

        String str1 = "012345";
        String temp = str1.substring(1, 4);
        System.out.println(temp); // 123

        String str2 = "abc";
        if (str2.equals("abc")) {

        }

        // char 배열과 string클래스의 변환 방법
        char[] chArr = { 'a', 'b', 'c' };

        String str3 = new String(chArr); // char -> String 변환

        char[] str4 = str3.toCharArray(); // String -> char 변환

    }
}
