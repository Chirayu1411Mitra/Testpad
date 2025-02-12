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
    static int gcd(int i, int j) {
        if (j == 0) return i;
        return gcd(j, i % j);
    }
}
