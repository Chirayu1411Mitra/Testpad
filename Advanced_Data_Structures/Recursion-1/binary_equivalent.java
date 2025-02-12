class Result {
    static long power(int base, int exp) {
        // Base case: If exponent is negative, return -1
        if (exp < 0) return -1;
        // Base case: Any number raised to 0 is 1
        if (exp == 0) return 1;
        // Recursive case: Exponentiation by squaring
        long halfPower = power(base, exp / 2);
        long result = halfPower * halfPower;
        // If exponent is odd, multiply one extra base
        if (exp % 2 != 0) result *= base;
        return result;
    }
    static int evenDigits(int n) {
        if (n == 0) return 0;
        int lastDigit = Math.abs(n % 10);
        int remaining = evenDigits(n / 10);
        if (lastDigit % 2 == 0) {
            return remaining * 10 + lastDigit;
        }
        return remaining;
    }
    static int decimalToBinary(int n) {
        if (n == 0) return 0;
        return decimalToBinary(n / 2) * 10 + (n % 2);
    }
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int T = scanner.nextInt(); // Number of test cases
        while (T-- > 0) {
            int base = scanner.nextInt();
            int exp = scanner.nextInt();
            System.out.println(power(base, exp));
        }
        // Example calls to evenDigits
        System.out.println(evenDigits(8342116)); // Output: 8426
        System.out.println(evenDigits(35179));   // Output: 0
        // Example calls to decimalToBinary
        System.out.println(decimalToBinary(43)); // Output: 101011
        scanner.close();
    }
}
