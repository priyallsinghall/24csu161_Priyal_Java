
class MyCustomException extends Exception {
    private String message;  

    public MyCustomException(String message) {
        this.message = message;
    }

    public void printMessage() {
        System.out.println("Custom Exception Message: " + message);
    }
}

public class CustomExceptionExample {
    public static void main(String[] args) {
        System.out.println("Priyal Singhal 24csu161");
        try {
            throw new MyCustomException("This is my custom exception!");
        } 
        catch (MyCustomException e) {
            System.out.println(e);
        }
        finally {
            System.out.println("Finally block executed successfully.");
        }
    }
}
