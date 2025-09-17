import java.util.Scanner;

class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Priyal Singhal 24csu161");

        System.out.print("Enter number of terms (n): ");
        int n = scan.nextInt();

        int first = 0, second = 1;

        System.out.println("Fibonacci Series up to " + n + " terms:");

        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
        } 
        else if (n == 1) {
            System.out.print(first);
        } 
        else {
            System.out.print(first + " " + second);

            for (int i = 3; i <= n; i++) {
                int next = first + second;
                System.out.print(" " + next);
                first = second;
                second = next;
            }
        }
    }
}


