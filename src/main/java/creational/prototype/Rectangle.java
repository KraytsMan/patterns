package creational.prototype;

import static java.lang.String.format;

public class Rectangle extends Shape {

    public Rectangle() {
        type = "Rectangle";
    }

    void draw() {
        System.out.println(format("Draw $s", type));
    }
}
