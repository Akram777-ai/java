class Person {
    String name;
}

class Student extends Person {
    void study() {
        System.out.println(name + " is studying");
    }
}

class Teacher extends Person {
    void teach() {
        System.out.println(name + " is teaching");
    }
}

class Administrator extends Person {
    void manage() {
        System.out.println(name + " manages the institution");
    }
}