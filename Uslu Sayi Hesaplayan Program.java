import java.util.Scanner;

public class java {
    public static void main(String[] args) {
        int m, a;

        int total = 1;
        Scanner inp = new Scanner(System.in);

        System.out.print("uslu sayi:");
        m = inp.nextInt();
        System.out.print("us olacak sayi:");
        a = inp.nextInt();

        for (int i = 1; i <= a; i++) {
            total *= m;
        }
        System.out.print("Cevap:" + total);
    }
}
