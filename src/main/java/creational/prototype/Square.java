package creational.prototype;

import static java.lang.String.format;

public class Square extends Shape {

    public Square() {
        type = "Square";
    }

    void draw() {
        System.out.println(format("Draw $s", type));
    }
}
