public class OpenOrClosePrinciple {
    //As classes devem estar abertas para extensão, mas fechadas para modificação.


    abstract class Shape {
        abstract double area();
    }

    class Circle extends Shape {
        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        @Override
        double area() {
            return Math.PI * radius * radius;
        }
    }

    class Rectangle extends Shape {
        private double width;
        private double height;

        public Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }

        @Override
        double area() {
            return width * height;
        }
    }

    class AreaCalculator {
        public double totalArea(Shape[] shapes) {
            double total = 0;
            for (Shape shape : shapes) {
                total += shape.area();
            }
            return total;
        }
    }

}
