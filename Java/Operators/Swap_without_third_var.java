import java.util.Scanner;
public class Swap_without_third_var{
public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int a;
    int b;
    a=input.nextInt();
    b=input.nextInt();
    
     a=a+b;
      b=a-b;
      a=a-b;
      System.out.println(a);
      System.out.println(b);
}
}
