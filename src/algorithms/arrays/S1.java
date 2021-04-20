package algorithms.arrays;

import static java.lang.System.identityHashCode;

public class S1 {
    public static void main(String[] args) {
        myMethod();
    }
    public static void myMethod() {
        String a, b, c;
        a = new String("mystring");
        b = a;
        c = a + b;
        System.out.println(a==b);
        System.out.println(a==c);
        System.out.println(b==c);

        System.out.printf("a: %d | %d\n", identityHashCode(a), identityHashCode(a.intern()));
        System.out.printf("b: %d | %d\n", identityHashCode(b), identityHashCode(b.intern()));
        System.out.printf("c: %d | %d\n", identityHashCode(c), identityHashCode(c.intern()));

        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        System.out.println(c.hashCode());

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        System.out.println("a hashcode: " + a.hashCode());
        System.out.println("b hashcode: " + b.hashCode());
        System.out.println("c hashcode: " + c.hashCode());

        System.out.println("a.equals(b): " + a.equals(b));
    }
}
