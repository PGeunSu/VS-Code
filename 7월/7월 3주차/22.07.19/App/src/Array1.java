import java.util.Arrays;

public class Array1 {

  public static void main(String[] args) {
    // 배열 복사

    // for문을 이용한 방법
    int[] arr = new int[5];
    int[] temp = new int[arr.length * 2]; // 기존 배열보다 길이가 2배인 배열 생성

    for (int i = 0; i < arr.length; i++) {
      temp[i] = arr[i]; // arr[i]의 값을 temp[i]에 저장
    }
    arr = temp; // 참조변수 arr 새로운 배열을 가르기케 한다.

    int[] arr = new int[5];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = i + 1;
    }
    System.out.println("[변경 전]");
    System.out.println("arr의 길이:" + arr.length); // arr의 길이:5

    for (int i = 0; i < arr.length; i++) {
      System.out.println("arr[" + i + "]:" + arr[i]);
    }
    int[] temp = new int[arr.length * 2];

    for (int i = 0; i < arr.length; i++) {
      temp[i] = arr[i];
    }
    arr = temp;

    System.out.println("[변경 후]");
    System.out.println("arr의 길이:" + arr.length); // arr의 길이:10

    for (int i = 0; i < arr.length; i++) {
      System.out.println("arr[" + i + "]:" + arr[i]);
    }

    // num;
    // newNum; ////////num num[0]에서 newNum newNum[0] 으로 num.length개의 데이터를 복사
    // System.arraycopy(scr, scrPos, dest, destPos, length);

    // System.arraycopy() : 간단하고 빠르다.

    char[] abc = { 'A', 'B', 'C', 'D' };
    char[] num = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    System.out.println(abc); // ABCD
    System.out.println(num); // 0123456789

    char[] result = new char[abc.length + num.length];
    System.arraycopy(abc, 0, result, 0, abc.length);
    System.arraycopy(num, 0, result, abc.length, num.length);

    System.out.println(result); // ABCD0123456789

    // shuffle
    int[] numArr = new int[10];
    for (int i = 0; i < numArr.length; i++) {
      numArr[i] = i;
      System.out.println(i);
    }
    System.out.println();
    for (int i = 0; i < 100; i++) {
      int n = (int) (Math.random() * 10);

      int temp1 = numArr[0];
      numArr[0] = numArr[n];
      numArr[n] = temp1;
    }
    for (int i = 0; i < numArr.length; i++) {
      System.out.print(numArr[i] + ","); // 6075298431 (랜덤 숫자)
    }
  }
}
