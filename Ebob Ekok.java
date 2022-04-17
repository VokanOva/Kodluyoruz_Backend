import java.util.Scanner;

public class java {
    public static void main(String[] args) {

        int ebob = 1, ekok = 1;
        int n1, n2;
        Scanner input = new Scanner(System.in);

        System.out.print("n1 Sayisi: ");
        n1 = input.nextInt();

        System.out.print("n2 Sayisi: ");
        n2 = input.nextInt();

        int i = 1;
        while(i <= n1){
            if (n1 % i == 0 && n2 % i == 0) {
                ebob = i;
            }
            i++;
        }

        int j = 1;
        while(j <= (n1*n2)){
            j++;
            if (j % n1 == 0 && j % n2 == 0) {
                ekok = j;
                break;
            }
        }

        System.out.println("Highest Common Factor: " + ebob);
        System.out.println("Least Common Multiple: " + ekok);
    }
}
