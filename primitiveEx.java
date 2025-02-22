import java.util.*;

public class primitiveEx {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = 10;
        int b = 8;


        System.out.println("a: " + a + " & b: " + b);

        System.out.println("Before mutation -> a: " + System.identityHashCode(a) + " & b: " + System.identityHashCode(b));

        a = 8;

        System.out.println("a: " + a + " & b: " + b);

        System.out.println("After mutation -> a: " + System.identityHashCode(a) + " & b: " + System.identityHashCode(b));
    }
    
}
