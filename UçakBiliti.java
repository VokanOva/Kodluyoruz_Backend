import java.util.Scanner;
public class Java {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mesafe,yas,tarife;
        String yazi = "Toplam =";
        double yasIndirimi,ucret,tarifeIndirimi;
        boolean isError = false;

        System.out.print("Mesafe Km :");
        mesafe = input.nextInt();
        if (mesafe <= 0){isError = true;}

        System.out.print("Yasinizi Girinz:");
        yas = input.nextInt();
        if (yas <= 0){isError = true;}

        System.out.print("Yolculuk Tipini Girin (1-Tek Yon, 2-Gidis Donus):");
        tarife = input.nextInt();
        if (tarife !=1 && tarife !=2){isError = true;}

        if (isError){
            System.out.print("Hatali Veri Girdiniz.");
            System.exit(0);
        }

        if (yas < 12 && tarife == 1){
            ucret = mesafe*0.10;
            yasIndirimi = (ucret/100)*50;
            ucret = ucret-yasIndirimi;
            System.out.print(yazi+ucret);
        }
        else if (yas < 12){
            ucret = mesafe*0.10;
            yasIndirimi = (ucret/100)*50;
            ucret = ucret-yasIndirimi;
            tarifeIndirimi = (ucret/100)*20;
            System.out.print(yazi+(ucret-tarifeIndirimi));
        }

        if (yas > 12 && yas <=24 && tarife == 1){
            ucret = mesafe*0.10;
            yasIndirimi = (ucret/100)*10;
            ucret = ucret-yasIndirimi;
            System.out.print(yazi+ucret);
        }
        else if (yas > 12 && yas <=24){
            ucret = mesafe*0.10;
            yasIndirimi = (ucret/100)*10;
            ucret = ucret-yasIndirimi;
            tarifeIndirimi = (ucret/100)*20;
            System.out.print(yazi+(ucret-tarifeIndirimi));
        }

        if (yas > 24 && yas < 65 && tarife == 1){
            ucret = mesafe*0.10;
            System.out.print(yazi+ucret);
        }
        else if (yas > 24 && yas < 65){
            ucret = mesafe*0.10;
            tarifeIndirimi = (ucret/100)*20;
            System.out.print(yazi+(ucret-tarifeIndirimi));
        }

        if (yas > 65 && tarife == 1){
            ucret = mesafe*0.10;
            yasIndirimi = (ucret/100)*30;
            ucret = ucret-yasIndirimi;
            System.out.print(yazi+ucret);
        }
        else if (yas > 65){
            ucret = mesafe*0.10;
            yasIndirimi = (ucret/100)*30;
            ucret = ucret-yasIndirimi;
            tarifeIndirimi = (ucret/100)*20;
            System.out.print(yazi+(ucret-tarifeIndirimi));
        }
    }
}
