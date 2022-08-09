class Cat extends Animal {

    @Override
    void crying() {

        System.out.println("냐옹~");
    }
}

public class Dog extends Animal {

    @Override
    void crying() {

        System.out.println("왈 왈");

    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.crying();
        cat.crying();
    }
}
