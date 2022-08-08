public class Array2 {
    public static void main(String[] args) {
        int[] score = { 79, 88, 91, 33, 10, 55, 95 };

        // 최대값 최소값 구하기
        int max = score[0];
        int min = score[0];

        for (int i = 0; i < score.length; i++) {
            // 배열에 담긴 max에 저장된 값보다 크면 이 값을 max에 저장
            if (score[i] > max) {
                max = score[i];
                // 반복을 하다보면 배열에 담긴 값 중에서 max에 최대값이 저장
            } else if (score[i] < min) {
                min = score[i];
            }
        }
        System.out.println("최대값 : " + max + " 최소값 : " + min);

        /////////////////////////////////////////////////////////

    }
}
