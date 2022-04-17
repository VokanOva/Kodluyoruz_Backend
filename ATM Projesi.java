import java.util.Scanner;

public class java {
    public static void main(String[] args) {
        String userName, password;
        Scanner inp = new Scanner(System.in);

        int right = 3, select = 0, bakiye = 10461, istek;


        while (right != 0) {
            System.out.print("Ad girin : ");
            userName = inp.nextLine();
            System.out.print("Sifre girin : ");
            password = inp.nextLine();

            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Giris yaptiniz ");
                System.out.println("Merhaba X bankasina hosgeldiniz");
                System.out.println("yapmak istediginiz islemi seciniz :");
                while (select != 4) {
                    System.out.println(" 1- Para Yatirma \n 2- Para Cekme \n 3- Bakiye Sorgula \n 4- Cikis Yap ");
                    select = inp.nextInt();
                    switch (select) {
                        case 1:
                            System.out.print("Yatirmak istediginiz rakam giriniz : ");
                            istek = inp.nextInt();
                            bakiye += istek;
                            break;
                        case 2:
                            System.out.print("Cekmek istediginiz rakam giriniz : ");
                            istek = inp.nextInt();
                            if (bakiye >= istek) {
                                bakiye -= istek;
                            } else {
                                System.out.println("Bakiye Yetersiz ! ");
                            }
                            break;
                        case 3:
                            System.out.println("Mevcut Bakiyeniz : " + bakiye);
                            break;
                        default:
                            System.out.print("Hatali Giris Yaptiniz");
                            break;
                    }
                }
                System.out.print("Hose kaliniz..");
                break;
            } else {
                System.out.println("Hatali Giris Yaptiniz, Tekrar Deneyiniz ");
                System.out.println("Kalan Hakkiniz : " + --right);
                if (right == 0) {
                    System.out.println("Kartiniz Bloke Olmustur,Lutfen Bankanizla Iletisime Geciniz ");
                }
            }

        }
    }
}
