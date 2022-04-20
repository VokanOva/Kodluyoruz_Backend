public class java {

    static boolean isPalindrom(int num) {
        int temp = num, revNumber = 0, mod;

        while (temp != 0) {
            mod = temp % 10;
            revNumber = (revNumber * 10) + mod;
            temp /= 10;
        }
        return num == revNumber;
    }

    public static void main(String[] args) {

        System.out.println(isPalindrom(969));

    }
}
