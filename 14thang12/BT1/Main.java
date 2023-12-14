import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();

        Shape circle = new Circle();
        Shape square = new Square();
        Shape triangle = new Triangle();

        shapes.add(circle);
        shapes.add(square);
        shapes.add(triangle);

        for (Shape shape : shapes ) {
            shape.draw();
        }
    }
}
