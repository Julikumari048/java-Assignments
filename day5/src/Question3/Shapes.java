package Question3;

public class Shapes {
    public void area(Circle circle) {

        System.out.println("Area of the Circle is: " + Math.PI * circle.radius * circle.radius);
    }

    public void area(Rectangle rectangle) {
        System.out.println("Area of the Rectangle is: " + rectangle.length * rectangle.breadth);
    }

    public void area(Square square) {
        System.out.println("Area of the Square is: " + square.side * square.side);
    }
}

class Circle{
    int radius;
    Circle(int rad){
        this.radius = rad;
    }
}

class Rectangle{
    int length;
    int breadth;
    Rectangle(int len, int bread){
        this.length = len;
        this.breadth = bread;
    }

}
     class Square {
         int side;

         Square(int si) {
             this.side = si;
         }

         public static void main(String[] args) {
             Shapes s = new Shapes();
             s.area(new Circle(10));
             s.area(new Rectangle(10, 5));
             s.area(new Square(10));
         }

     }