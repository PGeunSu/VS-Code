public class Node {

    // 외부에서 변경 못하도록 private로 지정
    private int x;
    private int y;


    //public 외부에서 사용가능하게 한다.
    //get은 값을 호출할 때 set는 값을 정할 때 사용.
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Node(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Node getCenter(Node other) {
        return new Node((this.x + other.getX()) / 2, (this.y + other.getY()) / 2);
    }

    public static void main(String[] args) {

        Node one = new Node(10, 20);
        Node two = new Node(30, 40);

        Node result = one.getCenter(two);
        System.out.println("x : " + result.getX() + ", y : " + result.getY()); // x : 20, y : 30

    }
}
