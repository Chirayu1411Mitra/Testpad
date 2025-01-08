import java.util.Scanner;
public class kaprekar{
	 public static void main(String[] args)
    {
         Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        for (int i = 0; i < N; i++) {
            int n = input.nextInt();
            System.out.println(isKaprekar(n));
        }
    }
     static int isKaprekar(int n) {
        int square = n * n;
        String squareStr = Integer.toString(square);
        String nStr = Integer.toString(n);
        int len = nStr.length();
        String rightPart = squareStr.substring(squareStr.length() - len);
        String leftPart = squareStr.substring(0, squareStr.length() - len);
        int right = rightPart.isEmpty() ? 0 : Integer.parseInt(rightPart);
        int left = leftPart.isEmpty() ? 0 : Integer.parseInt(leftPart);
        if (left + right == n) {
            return 1;
        } else {
            return 0;
        }
    }
}
