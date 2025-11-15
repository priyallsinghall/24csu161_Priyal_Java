import java.io.File;
import java.util.Scanner;

public class CheckFileOrDirectory {
    public static void main(String[] args) {
        System.out.println("Priyal Singhal 24csu161");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the path of file or directory: ");
        String path = scanner.nextLine();

        File file = new File(path);

        if (!file.exists()) {
            System.out.println("The specified path does not exist.");
        } else if (file.isFile()) {
            System.out.println("The path points to a FILE.");
        } else if (file.isDirectory()) {
            System.out.println("The path points to a DIRECTORY.");
        }

        scanner.close();
    }
}
