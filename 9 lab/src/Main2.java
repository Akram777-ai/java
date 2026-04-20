class Animal {

    String name;

    Animal(String name) {
        this.name = name;
    }

    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {

    Dog(String name) {
        super(name);
    }

    void sound() {
        System.out.println(name + " says: Woof!");
    }
}

class Cat extends Animal {

    Cat(String name) {
        super(name);
    }

    void sound() {
        System.out.println(name + " says: Meow!");
    }
}

class Bird extends Animal {

    Bird(String name) {
        super(name);
    }

    void sound() {
        System.out.println(name + " says: Tweet!");
    }
}

public class Main2 {

    public static void main(String[] args) {

        Dog dog = new Dog("Buddy");
        Cat cat = new Cat("Tom");
        Bird bird = new Bird("Rio");

        dog.sound();
        cat.sound();
        bird.sound();
    }
}