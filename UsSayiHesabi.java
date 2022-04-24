import java.util.Scanner;

public class Java{

    static int us (int a, int b){

        int total = 1;

        for(int i = 1; i <= b; i++){

            total *= a;


        }

        return total;
    }
    public static void main(String[] args) {

        int a, b;

        Scanner value = new Scanner(System.in);

        System.out.print("birinci sayi : ");

        a = value.nextInt();

        System.out.print("ikinci sayi : ");

        b = value.nextInt();


        System.out.println("Result : " + us(a, b));

    }
}
