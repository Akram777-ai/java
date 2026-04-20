class Device {
    String brand;
    int power;

    void turnOn() {
        System.out.println("Device is turning on");
    }
}

class Laptop extends Device {
}

class Smartphone extends Device {
}

class Tablet extends Device {
}