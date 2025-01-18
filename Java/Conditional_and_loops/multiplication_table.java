import java.util.Scanner;
// Other imports go here
// Do NOT change the class name
class Main
{
  public static void main(String[] args)
  {
   Scanner input = new Scanner(System.in);
      int n = input.nextInt();
      int m= input.nextInt();
      for (int i=1;i<=m;i++){
          System.out.println(n*i);
      }
  }
}
