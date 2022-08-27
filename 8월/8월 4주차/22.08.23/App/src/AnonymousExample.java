class Insect {
    void Attack() {
        System.out.println("곤총은 공격을 한다");
    }
}

class Anonymous {

    // 방법 1 : 필드에 익명자식 객체를 생성
    Insect spider1 = new Insect() {
        String name = "스파이더맨";

        @Override
        void Attack() {
            System.out.println(name + "이 독을 발사한다.");
        }

    };

    // 방법 2 : 로컬변수에 초기 값으로 대입
    void method1() {
        Insect spider2 = new Insect() {

            String name = "아기거미";

            @Override
            void Attack() {
                System.out.println(name + "가 앞니로 문다.");
            }
        };
        spider2.Attack();
    }

    // 방법 3 : 익명객체를 매개변수로 대입
    void method2(Insect spider) {
        spider.Attack();
    }
}

public class AnonymousExample {

    public static void main(String[] args) {
        Anonymous a = new Anonymous();

        a.spider1.Attack();

        a.method1();

        a.method2(new Insect() {
            String name = "타란툴라";

            @Override
            void Attack() {
                System.out.println(name + "가 도망간다.");
            }
        });
    }
}
