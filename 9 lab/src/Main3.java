class Person {

    String firstName;
    String lastName;

    Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    void displayInfo() {
        System.out.println("Name: " + firstName + " " + lastName);
    }
}

class Student extends Person {

    int studentId;

    Student(String firstName, String lastName, int studentId) {
        super(firstName,lastName);
        this.studentId = studentId;
    }

    void study() {
        System.out.println(firstName + " is studying");
    }
}

class Professor extends Person {

    String subject;

    Professor(String firstName,String lastName,String subject) {
        super(firstName,lastName);
        this.subject = subject;
    }

    void teach() {
        System.out.println(firstName + " teaches " + subject);
    }
}

public class Main3 {

    public static void main(String[] args) {

        Student student = new Student("Ali","Khan",12345);
        Professor professor = new Professor("John","Doe","Math");

        student.displayInfo();
        student.study();

        professor.displayInfo();
        professor.teach();
    }
}