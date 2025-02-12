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
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int T = scanner.nextInt(); // Number of test cases
        while (T-- > 0) {
            int base = scanner.nextInt();
            int exp = scanner.nextInt();
            System.out.println(power(base, exp));
        }
        scanner.close();
    }
}
