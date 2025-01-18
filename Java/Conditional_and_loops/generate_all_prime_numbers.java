import java.util.Scanner;
// Other imports go here
// Do NOT change the class name
class Main
{
    public static void main(String[] args)
    {
         Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        printPrimes(n, m);
    }
     static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
      static void printPrimes(int n, int m) {
        int count = 0; 
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.println(i);
                count++;
                if (count == m) {
                    break;
                }
            }
        }
    }
}
