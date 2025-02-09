class JavaFirstProgram {
    public static void main(String a[]) {
        short z = 11;
        int b = 11;
        double c = 33.33;
        System.out.println(z == b); // true
        System.out.println(z + b + c);
        System.out.println("Hello World");
        byte x = 127;
        int y = 256;
        System.out.println(y == x); // comparison, not assignment
        x = (byte) y; // explicit casting
        System.out.println(x);

        int m = 2;

        while (m <= 4) {

            System.out.println("Hi " + m);
            m++;
        }
        m++;
        System.out.println("Bye " + m);
    }
}
