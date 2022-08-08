// import java.util.Scanner;

// public class Iterator {
// public static void main(String[] args) {

// for (int i = 0; i < 5; i++) {
// System.out.println(i);
// }
// for (int i = 0; i < 5; i++) {
// System.out.println(i);
// }
// int sum = 0;
// for (int i = 1; i <= 100; i++) {
// sum += i;
// }
// System.out.println(sum);

// int input;
// int input2 = 0;
// System.out.println("숫자하나를 입력해라");

// Scanner scanner = new Scanner(System.in);

// input = scanner.nextInt();

// for (int i = 1; i <= input; i++) {
// input2 += 1;
// for (int j = 1; j <= input2; j++) {
// System.out.print('*');
// }
// System.out.println();
// }

// for (int i = 1; i <= 10; i++) {
// for (int j = 1; j <= 10; j++) {
// if (i == j) {
// System.out.printf("[%d,%d]", i, j);
// } else {
// System.out.print("[' ']");
// }

// }
// System.out.println();
// }

// jdk 1.5부터 배열과 컬렉션에 저장된 요소에 접근할 때 기존 보다 편리한 방법으로 처리 가느
// for(타입 변수명:배열 or collection){
// 반복
// }

// int[] arr = { 10, 20, 30, 40, 50 };

// for (int i = 0; i < arr.length; i++) {
// System.out.println(arr[i]);
// }
// System.out.println("================================");

// for (int i : arr) {
// System.out.println(i);
// }

// int sum = 0;

// for (int i : arr) {
// sum += i;
// }
// System.out.println(sum);

//////////////////////////////////////////////////////////////////////////////////////////////////

// for (int i = 1; i <= 10; i++) {
// System.out.println(i);
// }

// 사용자로 부터 입력을 받는다. 이숫자와 각 자리에 합을 구해라
// 어떤 수를 10으로 나머지 연산을 하면 마지막 자리를 얻을 수 있다.
// 10으로 나누면 마지막 한자리가 제거된다.

////////////////////////////////////////////////////////////////////////////////////////////////// \

// do-while

/*
 * 기본적인 구조는 while과 비슷하지만 조건식이랑 블럭의 순서를 바꿔놓은 것.
 * while과 반대로 블럭을 먼저 수행을 한 후에 조건식을 검사
 * do-while은 최소한 한 번은 수행될 것을 보장한다.
 */

// do{

// }
// while(조건식);

// int input = 0;
// int answer = 0;

// answer = (int) (Math.random() * 100) + 1; // 1~100사이의 임의의 수를 answer에 저장

// Scanner scanner = new Scanner(System.in);

// do {
// System.out.println("1과 100사이의 정수를 입력해라");
// input = scanner.nextInt();
// if (input > answer) {
// System.out.println("더 작은 수를 입력해라");
// } else if (input < answer) {
// System.out.println("더 큰 수를 입력해라");
// }
// } while (input != answer);

// System.out.println("정답");

// }
// }