class Transport {
    String name;
    int speed;

    Transport(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    void move() {
        System.out.println(name + " is moving");
    }
}

class Car extends Transport {
    Car(String name, int speed) {
        super(name, speed);
    }

    void move() {
        System.out.println(name + " drives on the road");
    }
}

class Train extends Transport {
    Train(String name, int speed) {
        super(name, speed);
    }

    void move() {
        System.out.println(name + " moves on rails");
    }
}

class Airplane extends Transport {
    Airplane(String name, int speed) {
        super(name, speed);
    }

    void move() {
        System.out.println(name + " flies in the sky");
    }
}