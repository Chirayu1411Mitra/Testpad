import java.util.Scanner;
class Main
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    int n;
    n=input.nextInt();
    int thousand = n/1000;
    int hundred = (n/100)%10;
    int tens = (n/10)%10;
    int ones = n%10;
    thousand=(thousand+1)%10;
    hundred=(hundred+1)%10;
    tens=(tens+1)%10;
    ones=(ones+1)%10;
    int result= thousand*1000+hundred*100+tens*10+ones;
    System.out.println(result);
  }
}
