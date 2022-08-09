public class UnitEx {
    public static void main(String[] args) {

        // Unit unit = new Unit();
        // Unit 추상클래스 이므로 인스턴스를 생성할 수 없어서 예외가 발생한다.

        System.out.println("==================");

        Tank tank = new Tank();
        tank.move(100, 300);
        tank.sizeMode();
        tank.stop("탱크", 300, 400);

        System.out.println("==================");

        Marine marine = new Marine();
        marine.move(200, 500);
        marine.stimPack();
        marine.stop("마린", 300, 400);

        System.out.println("==================");

        DropShip dp = new DropShip();
        dp.move(500, 600);
        dp.load();
        dp.unload();
        dp.stop("드랍쉽", 300, 400);

    }
}
