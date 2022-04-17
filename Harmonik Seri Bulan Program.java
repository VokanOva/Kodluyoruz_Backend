import java.util.Scanner;

public class java {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Sayi girin: ");
        double M = input.nextDouble();

        double result = 0.0;
        for (double i=1; i<=M; i++) {
            result += (1/i);
        }

        System.out.println("Sonuc: " + result);
    }
}
