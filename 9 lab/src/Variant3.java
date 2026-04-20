class Employee {
    String name;
    double salary;

    void work() {
        System.out.println(name + " is working");
    }
}

class Manager extends Employee {
    void work() {
        System.out.println("Manager manages the team");
    }
}

class Developer extends Employee {
    void work() {
        System.out.println("Developer writes code");
    }
}

class Designer extends Employee {
    void work() {
        System.out.println("Designer creates design");
    }
}