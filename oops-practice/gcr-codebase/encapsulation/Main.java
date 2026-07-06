public class Main {

    public static void main(String[] args) {

        Shape[] shapes = {
                new Circle(7),
                new Rectangle(10,5),
                new Triangle(3,4,5)
        };

        System.out.println("Shape\t\tArea\t\tPerimeter");

        for(Shape s : shapes){
            System.out.printf("%s\t%.2f\t\t%.2f%n",
                    s.getClass().getSimpleName(),
                    s.area(),
                    s.perimeter());
        }
    }
}