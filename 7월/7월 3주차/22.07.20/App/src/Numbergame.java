import java.util.Scanner;

public class Numbergame {

  public static void main(String[] args) {
    int[] number = new int[25];

    int value1, value2, temp;

    int changeArr = 24;

    Scanner sc = new Scanner(System.in);

    for (int i = 0; i < number.length; i++) {
      number[i] = i + 1;
    }
    for (int i = 0; i < number.length; i++) {
      value1 = (int) (Math.random() * 24);
      value2 = (int) (Math.random() * 24);

      temp = number[value1];
      number[value1] = number[value2];
      number[value2] = temp;
    }

    number[24] = 35;

    while (true) {
      for (int i = 0; i < number.length; i++) {
        if (number[i] == 35) {
          System.out.print((char) number[i] + "\t");
        } else {
          System.out.print(number[i] + "\t");
        }
        if ((i + 1) % 5 == 0) {
          System.out.printf("%n%n");
        }
      }

      System.out.print(
        "방향키를 이용하여 움직이세요.↑ : w, ← : a, → : d, ↓ : s \n"
      );
      char input = sc.next().charAt(0);

      if (input == 'w') {
        if (
          changeArr == 0 ||
          changeArr == 1 ||
          changeArr == 2 ||
          changeArr == 3 ||
          changeArr == 4
        ) {
          System.out.println("영역을 벗어날 수 없습니다.");
          continue;
        }
        int up = number[changeArr];
        number[changeArr] = number[changeArr - 5];
        number[changeArr - 5] = up;
        changeArr -= 5;
      } else if (input == 'a') {
        if (changeArr == 0) {
          System.out.println("영역을 벗어날 수 없습니다.");
          continue;
        }
        int left = number[changeArr];
        number[changeArr] = number[changeArr - 1];
        number[changeArr - 1] = left;
        changeArr--;
      } else if (input == 'd') {
        if (changeArr == 24) {
          System.out.println("영역을 벗어날 수 없습니다.");
          continue;
        }
        int right = number[changeArr];
        number[changeArr] = number[changeArr + 1];
        number[changeArr + 1] = right;
        changeArr++;
      } else if (input == 's') {
        if (
          changeArr == 20 ||
          changeArr == 21 ||
          changeArr == 22 ||
          changeArr == 23 ||
          changeArr == 24
        ) {
          System.out.println("영역을 벗어날 수 없습니다.");
          continue;
        }
        int down = number[changeArr];
        number[changeArr] = number[changeArr + 5];
        number[changeArr + 5] = down;
        changeArr += 5;
      }
    }
  }
}
