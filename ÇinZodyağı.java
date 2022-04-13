import java.util.Scanner;
public class java {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

         int birthDate;

        String text = "Cin Zodyagi Burcunuz:";

        System.out.print("Dogum tarihi:");
        birthDate = input.nextInt();


        if (birthDate %12 == 0){
            System.out.print(text + "Maymun");

         } else if (birthDate % 12 == 1){
            System.out.print(text + "Horoz");

         } else if (birthDate % 12 == 2){
            System.out.print(text + "Kopek");

         } else if (birthDate % 12 == 3){
            System.out.print(text + "Domuz");

         } else if (birthDate % 12 == 4){
            System.out.print(text + "Fare");

         } else if (birthDate % 12 == 5){
            System.out.print(text + "Okuz");

         } else if (birthDate % 12 == 6){
            System.out.print(text + "Kaplan");

        } else if (birthDate % 12 == 7){
            System.out.print(text + "Tavsan");

        } else if (birthDate % 12 == 8){
            System.out.print(text + "Ejderha");

        } else if (birthDate % 12 == 9){
            System.out.print(text + "Yilan");

        } else if (birthDate % 12 == 10){
            System.out.print(text + "At");

        } else if (birthDate % 12 == 11){
            System.out.print(text + "Koyun");

        } else {
            System.out.println("Error");
        }
    }
}
