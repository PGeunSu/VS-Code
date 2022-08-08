public class App {
    public static void main(String[] args) throws Exception {

        // 배열
        /*
         * 같은 타입의 여러 변수를 하나로 묶음.
         * 여기서 중요한 건 반드시 같은 타입이어야 한다.
         */
        // 배열을 선언하는 방법

        /*
         * 원하는 타입의 변수를 선언하고 변수 또는 타입에 배열일음 의미하는 대괄호[]를 붙히면 된다.
         * []는 타입 뒤에 붙혀도 되고 변수 이름 뒤에 붙혀도 된다.
         * 
         * 타입[] 변수이름; ex) int[] score;
         * 타입 변수이름[]; ex) int score[] ;
         */

        // 배열을 선언 후 -> 생성 (선언하는 것은 단지 생선된 배열을 다루기 위한 참조변수를 위한 공간이 만들어 질뿐,
        // 생성을 해야만 값을 저장할 수 있다.)

        /*
         * 타입[] 변수이름; ==> 배열 선언
         * 변수이름 = new 타입[length]; ==> 배열 생성(실제 저장공간 생성)
         */
        // int[] score; // int타입의 배열을 다루기 위한 참조변수인 score선언
        // score = new int[5]; // int타입의 값 5개를 저장할 수 있는 배열 생성

        // int[] score1 = new int[5]; // 배열의 선언과 생성을 동시에 하면 간략히 한 줄로 가능(이 방법을 더 선호함)
        // int array : default = 0
        // string array : default = null

        // 배열을 다룰 시 주의점 :
        // index의 범위를 벗어난 값을 index로 사용하지 않아야 한다.
        // 배열의 index로 변수를 많이 사용하는데 변수의 값은 실행 시 대입이 된다.
        // 컴파일러는 이 값의 범위를 확인할 수 없기 떄문이다.

        int[] score = new int[5];
        int k = 1;

        score[0] = 50;
        score[1] = 60;
        score[k + 1] = 70; // == score[2]
        score[3] = 80;
        score[4] = 90;

        for (int i = 0; i < 5; i++) {
            System.out.printf("score[%d]:%d%n", i, score[i]);
        }
        int temp = score[k + 2] + score[4]; // == score[3] + score[4];

        System.out.printf("temp : %d%n", temp);

        // System.out.printf("score[%d]:%d%n", 7, score[7]);
        // error :.ArrayIndexOutOfBoundsException: Index 7 out of bounds for length 5
        // (배열의 인덱스가 유요한 범위를 넘음)

    }
}
