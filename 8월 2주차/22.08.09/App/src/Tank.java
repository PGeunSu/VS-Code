public class Tank extends Unit {

    public Tank() {

    }

    @Override
    public void move(int x, int y) {

        System.out.println("탱크의 위치 : " + x + "," + y);

    }

    public void sizeMode() {

        System.out.println("공격 모드 : 시즈모드로 변환");
    }

}
