
public class Hero {
    String name;

    public Hero(String name) {
        this.name = name;
    }

    public void attack() {
        // System.out.println("공격!");
    }

    public static void main(String[] args) {
        Hero[] heros = new Hero[3];

        heros[0] = new Warrior("전사");
        heros[1] = new Warrior("궁수");
        heros[2] = new Warrior("마법사");
        // 배열 생성 후 작업을 넣어준다.

        for (int i = 0; i < heros.length; i++) {
            heros[i].attack();

            if (heros[i] instanceof Warrior) {// 접근하고 있는 인스턴스가 전사가 맞는 지 확인
                Warrior temp = (Warrior) heros[i]; // 형변환 후 temp에 담아서 만듦.
                temp.groundCutting();
            } else if (heros[i] instanceof Archer) {
                Archer temp = (Archer) heros[i];
                temp.fire();
            } else if (heros[i] instanceof Wizard) {
                Wizard temp = (Wizard) heros[i];
                temp.freezing();
            } // 배열이 돌면서 해당 인덱스에 해당하는 캐릭터의 속성을 실행
        }
    }

}

class Warrior extends Hero {
    public Warrior(String name) {
        super(name);

    }

    public void groundCutting() {
        System.out.println("대지가르기!");
    }
}

class Wizard extends Hero {
    public Wizard(String name) {
        super(name);

    }

    public void freezing() {
        System.out.println("얼어붙어라!");
    }
}

class Archer extends Hero {
    public Archer(String name) {
        super(name);

    }

    public void fire() {
        System.out.println("불화살!");
    }
}
