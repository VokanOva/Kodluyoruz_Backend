import java.util.Scanner;

public class java {
    public static void main(String[] args) {

        int n, r, total, sayiN = 1, sayiR= 1, sayiNR = 1;
        Scanner input = new Scanner(System.in);


        System.out.print(" n sayisi girin: ");
        n = input.nextInt();

        System.out.print(" r saysi girin: ");
        r = input.nextInt();

        for (int i = 1; i <= n; i++) {
            sayiN = sayiN * i;

        }

        for (int i = 1; i <= r; i++) {
            sayiR = sayiR * i;

        }

        for (int i = 1; i <= (n - r); i++) {
            sayiNR = sayiNR * i;

        }
        total = sayiN / (sayiR * sayiNR);
        System.out.println(n + "total: " + total);
    }
}
