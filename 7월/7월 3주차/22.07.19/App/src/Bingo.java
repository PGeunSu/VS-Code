import java.util.Scanner;

public class Bingo{

    private static int num;

    public static void main(String[] args) {

        int[] bingoNum = new int[25];
        int[][] bingoArr = new int[5][5];
        int[][] bingoChk = new int[5][5];
        int[][] bingo2 = new int[5][5];

        // int temp = 0;
        int bingoCnt = 0; 
        int toCnt = 0; //빙고 갯수

        Scanner sc = new Scanner(System.in);

        // 1부터 50의 값으로 채운다.
        for(int i=0; i < bingoNum.length; i++) {
            bingoNum[i] = i+1;
        }

        // suffle
        for(int i=0; i < 50; i++) {
              int value1 = (int)(Math.random() * 25);
              int value2 = (int)(Math.random() * 25);

              int tmp = bingoNum[value1];
              bingoNum[value1] = bingoNum[value2];
              bingoNum[value2] = tmp;
        }

        // 배열에 있는 내용을 bingoArr에 채운다.
        for(int i=0, n=0; i < bingoArr.length; i++) {
              for(int j=0; j < bingoArr[i].length; j++, n++) {
                bingoArr[i][j] = bingoNum[n];
                    System.out.print((bingoArr[i][j] < 10 ? " " : "") + bingoArr[i][j] + " ");
              }
              System.out.println();
        }

        do{
         for(int i =0; i<5; i++){
            for(int j =0; j<5; j++){
                if(bingoChk[i][j]==0){
                    bingoCnt++;
                }
                if(bingoCnt ==5){
                    ++toCnt;
                    bingoCnt=0;
                }
               
            }
            for(int j=0; j<5; j++){
                if(bingoChk[j][i]==0){
                    bingoCnt++;
                }
                if(bingoCnt ==5){
                    ++toCnt;
                    bingoCnt=0;
                }
            }
            
         }
         if(bingoChk[0][0]==0 && bingoChk[1][1]==0 && bingoChk[2][2]==0  && bingoChk[3][3]==0
            && bingoChk[4][4]==0){
                ++toCnt;
            }
            if(bingoChk[0][4]==0 && bingoChk[1][3]==0 && bingoChk[2][2]==0  && bingoChk[3][1]==0
            && bingoChk[4][0]==0){
                ++toCnt;
            }
            if(toCnt ==1){
                System.out.println("1빙고");
                toCnt = 0;
            }
            else  if(toCnt ==2){
                System.out.println("2빙고");
                toCnt = 0;
            }
            else  if(toCnt ==3){
                System.out.println("3빙고");
                toCnt = 0;
            }
            else  if(toCnt ==4){
                System.out.println("4빙고");
                toCnt = 0;
            }
            else  if(toCnt ==5){
                System.out.println("5빙고 게임 끝");
                break;
            }
            System.out.print("숫자 입력");
            
            String input = sc.nextLine();

            int num = Integer.parseInt(input);

            num = sc.nextInt();

            for(int i =0; i<5; i++){
                for(int j=0; j<5; j++){
    
                    if(bingoArr[i][j]==num){
                        bingo2[i][j]=bingoArr[i][j];
                        bingoChk[i][j] = 0;
                    
                    for(int x=0;x<5;x++){
                        for(int y=0;y<5;y++){
                            if(bingo2[x][y]!=0){
                                System.out.printf("%4d",bingo2[x][y]);
                            }
                            else{
                                System.out.printf("[%d,%d]",x,y);
                            }
                        }
                        System.out.println();
                    }
                }
            }
        }
       
        }while(bingoCnt==5);
        sc.close();
     System.out.println("빙고 종료");
        

    }
}