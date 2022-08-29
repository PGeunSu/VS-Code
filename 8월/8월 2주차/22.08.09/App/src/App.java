abstract class App { // 추상 클래스
    // 미완성 설계도, 인스턴스 생성불가.
    // 미완성 메서드(추상 메서드)를 포함하고 있는 클래스

    // abstract class 클래스이름{....}

    // 실생활에서 예를 들자면, 같은 크기의 TV라도 기능의 차이에 따라 여러 종류의 모델이 있지만, 사실 이들의 설계도는 90퍼는 동일할
    // 것이다.
    // 공통 부분만을 그린 미완성 설계도를 만들어 놓고, 이 미완성 설계도(추상화 클래스)를 이용하여 각각의 설계도를 완성하는 것이 효율적이다.

    abstract void play(String songName); // 추상 메서드

    abstract void pause();

    abstract void stop();

    public static void main(String[] args) {

    }
}
