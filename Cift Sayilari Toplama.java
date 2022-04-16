import java.util.Scanner;

public class java {
    public static void main(String[] args) {
        int k, total = 0;

        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Sayi giriniz:");
            k = input.nextInt();
            if (k % 4 == 0) {
                total += k;
            }
        } while (k > 0);
        System.out.println("Girilen Sayilarin Toplami:" + total);
    }
}
