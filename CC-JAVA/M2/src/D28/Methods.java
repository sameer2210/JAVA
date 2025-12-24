package D28;

public class Methods {
    static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    static boolean isStrong(int n) {
        int sum = 0;
        int temp = n;
        while (temp > 0) {
            int d = temp % 10;
            sum += factorial(d);
            temp /= 10;
        }
        return (sum == n);
    }

    public static void main(String[] args) {

        System.out.println(factorial(5));
        System.out.println(isStrong(145) ? "Strong number " : " not a strong number ");


    }
}
