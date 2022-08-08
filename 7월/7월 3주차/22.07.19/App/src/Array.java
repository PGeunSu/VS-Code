// import java.util.Arrays;

// public class Array {
//     public static void main(String[] args) {
//         // 배열의 길이
//         // int범위의 양의정수(0포함)이어야한다.
//         // 배열은 한 번 생성하면 길이 변경을 할 수 없기 떄문에 이미 생성된 배열의 길이는 변하지 않는다.

//         int[] score = new int[6];
//         score.length = 10;

//         for (int i = 0; i < 7; i++) {
//         System.out.println(score[i]);
//         // } error 배열의 길이를 벗어남

//         /*
//          * 배열의 길이 변경 방법
//          * 1. 더 큰 배열을 새로 만든다.
//          * 2. 기존 배열의 내용을 새로운 배열에 복사한다.
//          */

//         // 배열 초기화
//         int[] score1 = new int[5];
//         score1[0] = 10;
//         score1[1] = 20;
//         score1[2] = 30;
//         score1[3] = 40;
//         score1[4] = 50;

//         int[] score2 = new int[5];
//         for (int i = 0; i < score2.length; i++) {
//             score2[i] = i * 10 + 50;
//             System.out.println(score2[i]);
//         }
//         /////////////////////////////////////////////////////
//         int[] score3 = new int[] { 10, 20, 30, 40, 50 };
//         for (int i = 0; i < score3.length; i++) {
//             System.out.println(score3[i]);
//         }
//         /////////////////////////////////////////////////////
//         int[] score4 = { 1, 2, 3, 4, 5 };
//         for (int i = 0; i < score4.length; i++) {
//             System.out.println(score4[i]);
//         }
//         /////////////////////////////////////////////////////
//         // Arrays.toString() : 배열의 모든 요소가 출력된다.
//         // [첫번 째 요소, 두번 쨰 요소....] 와 같은 형식의 문자열로 만들어서 출력
//         int[] arr = { 1, 2, 3, 4, 5 };
//         // System.out.println(Arrays.toString(arr));

//         int[] iArr = new int[10];
//         int[] iArr1 = new int[10];
//         int[] iArr2 = new int[] { 100, 200, 300, 90 };
//         int[] iArr3 = { 11, 50, 30, 90 };

//         char[] chArr = { 'a', 'b', 'c', 'd' };

//         for (int i = 0; i < iArr.length; i++) {
//             iArr[i] = i + 1; // 1~10의 숫자 배열에 넣는다.
//         }
//         for (int i = 0; i < iArr1.length; i++) {
//             iArr1[i] = (int) (Math.random() * 10) + 1; // 1~10 랜덤출력
//         }

//         for (int i = 0; i < iArr.length; i++) {
//             System.out.print(iArr[i] + ",");
//         }
//         System.out.println();

//         System.out.println(Arrays.toString(iArr1));
//         System.out.println(Arrays.toString(iArr2));
//         System.out.println(Arrays.toString(iArr3));
//         System.out.println(Arrays.toString(chArr));

//         System.out.println(iArr3);
//         System.out.println(chArr);
//     }
// }
