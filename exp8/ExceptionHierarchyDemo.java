

// Level 1
class BaseException extends Exception {
    public BaseException(String message) {
        super(message);
    }
}

// Level 2 exception
class LevelTwoException extends BaseException {
    public LevelTwoException(String message) {
        super(message);
    }
}

// Level 3 exception
class LevelThreeException extends LevelTwoException {
    public LevelThreeException(String message) {
        super(message);
    }
}


class A {
    
    void show() throws BaseException {
        throw new BaseException("BaseException thrown from class A");
    }
}


class B extends A {
    
    @Override
    void show() throws LevelTwoException {
        throw new LevelTwoException("LevelTwoException thrown from class B");
    }
}


class C extends B {
    
    @Override
    void show() throws LevelThreeException {
        throw new LevelThreeException("LevelThreeException thrown from class C");
    }
}


public class ExceptionHierarchyDemo {
    public static void main(String[] args) {
        System.out.println("Priyal Singhal 24csu161");
        A obj = new C();

        try {
            
            obj.show();
        } 
        catch (BaseException e) {
            
            System.out.println("Exception Caught: " + e);
        }

        System.out.println("Program executed successfully after handling exception.");
    }
}
