class Shape {
    double area() {
        return 0;
    }
}

class Circle extends Shape {
    double radius = 5;

    double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    double width = 4;
    double height = 6;

    double area() {
        return width * height;
    }
}

class Triangle extends Shape {
    double base = 4;
    double height = 3;

    double area() {
        return (base * height) / 2;
    }
}