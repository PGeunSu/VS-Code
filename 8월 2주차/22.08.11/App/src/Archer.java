public class Archer {

    String name;
    String power;

    public Archer(String n, String p) {
        name = n;
        power = p;
    }

    public boolean equals(Object obj) {
        Archer temp = (Archer) obj;
        if (name == temp.name && power == temp.power) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        Archer archer1 = new Archer("궁수1", "상");
        Archer archer2 = new Archer("궁수1", "상");

        System.out.println(archer1 == archer2); // false
        System.out.println(archer1.equals(archer2)); // true

    }
}
