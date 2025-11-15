import java.io.*;

public class BufferedFileExample {
    public static void main(String[] args) {
        System.out.println("Priyal Singhal 24csu161");
        String fileName = "students.txt";

        // Writing data using BufferedWriter
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
            bw.write("1 Priya 8.7 A");
            bw.newLine();
            bw.write("2 Rohan 9.1 A");
            bw.newLine();
            bw.write("3 Meena 7.8 B");
            System.out.println("Data written successfully using BufferedWriter.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Reading data using BufferedReader
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            System.out.println("\nContents of file:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
