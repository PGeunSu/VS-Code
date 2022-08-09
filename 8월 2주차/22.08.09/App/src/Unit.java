
public abstract class Unit {

    // 필드
    int x;
    int y;
    String str;

    // 추상 메서드 선언(구현부가 없음)
    // 모든 유닛은 움직여야 하므로 move() 를 추상메서드로 사용함
    public abstract void move(int x, int y);

    public void stop(String str, int x, int y) {
        this.x = x;
        this.y = y;
        this.str = str;

        System.out.print("현재위치 : " + this.x + "," + this.y + this.str);
    }
}
