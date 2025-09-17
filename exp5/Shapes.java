import java.util.Scanner;

class Shape {
    public void printShape() {
        System.out.println("This is shape");
    }
}

class Rectangle extends Shape {
    public void printRectangle() {
        System.out.println("This is rectangular shape");
    }
}

class Circle extends Shape {
    public void printCircle() {
        System.out.println("This is circular shape");
    }
}

class Square extends Rectangle {
    public void printSquare() {
        System.out.println("Square is a rectangle");
    }
}

class Shapes_JAVA {
    public static void main(String[] args) {
        System.out.print("Priyal Singhal 24csu161");

        Scanner sc = new Scanner(System.in);

        System.out.println("\nChoose a class to test:");
        System.out.println("1. Shape");
        System.out.println("2. Rectangle");
        System.out.println("3. Circle");
        System.out.println("4. Square");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                Shape s = new Shape();
                s.printShape();
                break;
            case 2:
                Rectangle r = new Rectangle();
                r.printRectangle();
                break;
            case 3:
                Circle c = new Circle();
                c.printCircle();
                break;
            case 4:
                Square sq = new Square();
                sq.printSquare();
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
