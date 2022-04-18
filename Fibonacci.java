public class java {
    public static void main(String[] args) {
        int a1 = 0, a2 = 1, a3, i, total = 10;

        for (i = 2; i < total; ++i) {
            a3 = a1 + a2;
            System.out.println(a1 + " + " + a2 + " = " + a3);
            a1 = a2;
            a2 = a3;
        }
    }
}
