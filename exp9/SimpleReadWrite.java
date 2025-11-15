import java.io.*;

public class SimpleReadWrite {
    public static void main(String[] args) {
        System.out.println("Priyal Singhal 24csu161");
        String fileName = "sample.txt";

        // Write to file
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write("Hello, this is a simple file write example!");
            System.out.println("Data written to file successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Read from file
        try (FileReader reader = new FileReader(fileName)) {
            int ch;
            System.out.println("File contents:");
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
