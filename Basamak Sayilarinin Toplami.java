import java.util.Scanner;

public class java {
    public static void main(String[] args) {
        int sayi;
        int basamak;
        int toplam = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayi Girin:");
        sayi = scan.nextInt();

        while (sayi != 0) {
            basamak = sayi % 10;
            toplam += basamak;
            sayi = sayi / 10;
            System.out.println(basamak);
        }
        System.out.print(" basamklari toplami: " + toplam);
    }
}
