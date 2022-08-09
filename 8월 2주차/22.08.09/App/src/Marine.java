public class Marine extends Unit {

    @Override
    public void move(int x, int y) {

        System.out.println("마린의 위치 : " + x + "," + y);

    }

    // Marine의 고유메서드

    public void stimPack() {

        System.out.println("공격모드 : 스팀팩 장전!");
    }

}
