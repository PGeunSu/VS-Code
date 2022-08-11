import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
        int[] arr = new int[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        System.out.println(Arrays.binarySearch(arr, 437)); // 437

        int[] arr1 = { 1, 2, 3, 4, 5 };
        int[] arr2 = Arrays.copyOf(arr1, 3);

        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " "); // 1 2 3
        }

        System.out.println("\n=========================================");

        int[] arr3 = Arrays.copyOf(arr1, 10);

        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " "); // 1 2 3 4 5 0 0 0 0 0
        }

        System.out.println("\n=========================================");

        int[] arr4 = Arrays.copyOfRange(arr1, 2, 4);

        for (int i = 0; i < arr4.length; i++) {
            System.out.print(arr4[i] + " "); // 3 4
        }

        System.out.println("\n=========================================");

        int[] arr5 = new int[10];

        Arrays.fill(arr5, 7);
        for (int i = 0; i < arr5.length; i++) {
            System.out.print(arr5[i] + " "); // 7 7 7 7 7 7 7 7 7 7 7
        }

        System.out.println("\n=========================================");

        int[] arr6 = { 5, 3, 4, 1, 2 };

        Arrays.sort(arr6); // 정렬

        for (int i = 0; i < arr6.length; i++) {
            System.out.print(arr6[i] + " "); // 1 2 3 4 5
        }
    }
}
