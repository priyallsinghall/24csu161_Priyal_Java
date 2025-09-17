import java.util.Scanner;

class Vehicle {
    public void display() {
        System.out.println("This is a Vehicle");
    }
}

class Car extends Vehicle {
    @Override
    public void display() {
        System.out.println("This is a Car");
    }
}

class Bike extends Vehicle {
    @Override
    public void display() {
        System.out.println("This is a Bike");
    }
}

class Vehicle_exp5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Priyal Singhal 24csu161");

        System.out.print("Enter number of tyres: ");
        int N = sc.nextInt();

        Vehicle v;

        switch (N) {
            case 2:
                v = new Bike();
                break;
            case 4:
                v = new Car();
                break;
            default:
                v = new Vehicle();
        }

        v.display();
    }
}
