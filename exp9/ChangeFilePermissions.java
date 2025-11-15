import java.io.File;

public class ChangeFilePermissions {
    public static void main(String[] args) {
        System.out.println("Priyal Singhal 24csu161");
        File file = new File("test.txt");

        if (file.exists()) {
            // Remove write permission and make read-only
            file.setWritable(false);
            file.setReadable(true);

            System.out.println("File permissions changed successfully!");
            System.out.println("Readable: " + file.canRead());
            System.out.println("Writable: " + file.canWrite());
        } else {
            System.out.println("File does not exist!");
        }
    }
}
