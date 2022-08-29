public class Main extends App {

    @Override
    void pause() { // 추상 메서드 구현
        System.out.println("곡을 일시정지 합니다.");
    }

    @Override
    void play(String songName) {
        System.out.println(songName + "곡을 재생합니다");
    }

    @Override
    void stop() {
        System.out.println("곡을 정지합니다.");
    }

    public static void main(String[] args) {

        Main main = new Main();
        main.play("펭수 - 펭하");
        main.pause();
        main.stop();

    }
}
