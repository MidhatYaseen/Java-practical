// Filename: WrapperDemo.java

public class WrapperDemo {
    public static void main(String[] args) {

        // Primitive to Wrapper (Boxing)
        int num = 10;
        Integer objInt = Integer.valueOf(num); // Explicit Boxing
        Double objDouble = 20.5;               // Auto-boxing

        // Wrapper to Primitive (Unboxing)
        int unboxedInt = objInt.intValue();   // Explicit Unboxing
        double unboxedDouble = objDouble;     // Auto-unboxing

        // Character and Boolean Wrappers
        char ch = 'A';
        Character objChar = ch;
        boolean flag = true;
        Boolean objBool = flag;

        // Print values
        System.out.println("Integer Object: " + objInt);
        System.out.println("Unboxed Integer: " + unboxedInt);
        System.out.println("Double Object: " + objDouble);
        System.out.println("Unboxed Double: " + unboxedDouble);
        System.out.println("Character Object: " + objChar);
        System.out.println("Boolean Object: " + objBool);
    }
}
