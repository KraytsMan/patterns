package creational.prototype;

import static java.lang.String.format;

public class Circle extends Shape {

    public Circle() {
        type = "Circle";
    }

    void draw() {
        System.out.println(format("Draw $s", type));
    }
}
