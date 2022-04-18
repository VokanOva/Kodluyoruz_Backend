import java.util.Scanner;

public class java {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, Ma, Ksayi = 0, Bsayi = 0, toplam = 1;

        System.out.print(" sayi adeti :");
        Ma = input.nextInt();

        while (toplam <= Ma) {
            if (Ma > 1) {
                System.out.print(toplam + ". Sayiyi Giriniz:");
                n = input.nextInt();
                if (n > Ksayi && n > Bsayi) {
                    Bsayi = n;
                    if (Ksayi == 0) {
                        Ksayi = n;
                    }
                }
                if (n < Bsayi && n < Ksayi) {
                    Ksayi = n;
                    if (Bsayi == 0) {
                        Bsayi = n;
                    }
                }
            }
            else {
                System.out.print("Hata");
            }
            toplam++;
        }
        System.out.println("En Buyuk Sayi:" + Bsayi);
        System.out.print("En Kucuk Sayi:" + Ksayi);
    }
}
