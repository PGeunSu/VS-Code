import java.util.Arrays;

public class Test {

  public static void main(String[] args) {
    //////////////////////////////////////////////////////////////////////////////////////////
    // 1. 배열의 모든요소를 더해서 총합과 평균구하기

    int[] arr = { 10, 30, 50, 20, 40 };
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
    }
    int average = sum / arr.length;

    System.out.println("합계 : " + sum + " 평균 : " + average); // 150 (10+30+50+20+40) // 30 (sum(150)/arr.length(5))

    //////////////////////////////////////////////////////////////////////////////////////////
    // 2. 로또번호

    int[] lottoNum = new int[6];
    for (int i = 0; i < 6; i++) {
      lottoNum[i] = (int) (Math.random() * 45 + 1);
    }

    Arrays.sort(lottoNum); // 정렬

    System.out.print("로또 번호 : ");
    System.out.println(Arrays.toString(lottoNum));

    //////////////////////////////////////////////////////////////////////////////////////////
    // 3. 배열에 어떤 값이 몇 개 저장되어 있는지 세어서 보여주자.

    int[] numArr1 = new int[50];

    System.out.print("랜덤 번호 : ");
    for (int i = 0; i < numArr1.length; i++) {
      numArr1[i] = (int) (Math.random() * 10);
      System.out.print(numArr1[i] + ",");
    }
    System.out.println();

    int[] count = new int[10];

    for (int i = 0; i < numArr1.length; i++) {
      count[numArr1[i]] += 1;
    }

    for (int i = 0; i < count.length; i++) {
      System.out.print("(" + i + ")" + " : " + count[i] + "번, ");
    }
  }
}
