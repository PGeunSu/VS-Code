public class App1 {

  public static void main(String[] args) throws Exception {
    // 배열

    // 1차원 배열
    // int[] arr = new int[5];

    // 2차원 배열
    // int[][] arr = new int[5][5]; //5행5열의 2차원 배열을 생성한다.

    // 2차원 배열은 행과 열로 구성되어 있기 떄문에 index도 행과 열에 각각 하나씩 존재한다.

    // 초기화

    // int[][] arr = new int[][] { { 1, 2, 3 }, { 4, 5, 6 } };
    // int[][] arr1 = { { 1, 2, 3 }, { 4, 5, 6 } }; // 생략 가능

    // int[][] arr3 = {
    // { 1, 2, 3, 4, 5, 6 }, // 배열의 길이가 길어지면 가독성이 떨어지기 때문에 행과 열을 구분해준다.
    // { 4, 5, 6, 7, 8, 9 } };

    // int[][] result = new int[][] {
    //   { 100, 100, 100 },
    //   { 20, 20, 20 },
    //   { 30, 30, 30 },
    //   { 40, 40, 40 },
    //   { 50, 50, 50 },
    // };
    // for (int i = 0; i < result.length; i++) {
    //   for (int j = 0; j < result[i].length; j++) {
    //     System.out.print(result[i][j] + " ");
    //   }
    //   System.out.println();
    // }
    // System.out.println();

    // for (int is : score) {} //error 2차원 배열의 result의 각 요소는 1차원

    // int sum = 0;
    // for (int[] temp : result) { // result의 각요소(1차원 배열주소)를 temp에 저장
    //   for (int i : temp) { // temp 1차원 배열을 가리키는 참조변수
    //     sum += i;
    //   }
    //   System.out.println(sum);
    // }

    // System.out.println(sum);
    //2차원 배열을 이용하여 학생의 세 과목점수를 더해서 각 학생의 총점과 평균을 계산하고 총점을 계산

    int[][] result = new int[][] {
      { 100, 100, 100 },
      { 20, 20, 20 },
      { 30, 30, 30 },
      { 40, 40, 40 },
      { 50, 50, 50 },
    };
    int koreaT = 0;
    int englishT = 0;
    int mathT = 0;

    System.out.println("번호 국어 영어 수학 총점 평균");
    System.out.println("===========================");

    for (int i = 0; i < result.length; i++) {
      int sum = 0;
      float average = 0.0f;
      koreaT += result[i][0];
      englishT += result[i][1];
      mathT += result[i][2];

      System.out.printf("%3d", i + 1);

      for (int j = 0; j < result[i].length; j++) {
        sum += result[i][j];
        System.out.printf("%5d", result[i][j]);
      }
      average = sum / (float) result[i].length;

      System.out.printf("%5d %5.1f%n", sum, average);
    }
    System.out.println("===========================");

    System.out.printf("총점: %3d %4d %d%n", koreaT, englishT, mathT);
  }
}
