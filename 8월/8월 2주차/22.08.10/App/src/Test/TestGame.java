public class TestGame {

    String name;
    int hp;
    int mp;
    int atk;
    int def;

    public void show() {
        System.out.println("이름 : " + name);
        System.out.println(name + "의 체력 : " + hp);
        System.out.println(name + "의 마나 : " + mp);
        System.out.println(name + "의 공격력 : " + atk);
        System.out.println(name + "의 방어력: " + def);
        System.out.println("===============================");
    }

    public static void main(String[] args) {

        // TestGame wizard = new Wizard();
        // TestGame assassin = new Assassin();
        // TestGame tanker = new Tanker();

        // wizard.show();
        // assassin.show();
        // tanker.show();

    }
}

class Wizard extends TestGame {

    public Wizard() {
        name = "마법사";
        hp = 2000;
        mp = 800;
        atk = 150;
        def = 60;

    }
}

class Assassin extends TestGame {

    public Assassin() {
        name = "암살자";
        hp = 2200;
        mp = 600;
        atk = 200;
        def = 40;

    }
}

class Tanker extends TestGame {

    public Tanker() {
        name = "탱커";
        hp = 4000;
        mp = 500;
        atk = 100;
        def = 120;

    }
}
