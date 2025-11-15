public class ExceptionExample {
    public static void main(String[] args) {
        System.out.println("Priyal Singhal 24csu161");
        try {
            throw new Exception("This is a custom exception message!");
        } 
        catch (Exception e) {
            
            System.out.println("Caught Exception: " + e);
        } 
        finally {
            System.out.println("Finally block executed — program ended properly.");
        }
    }
}
