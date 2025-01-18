import java.util.Scanner;
// Other imports go here
// Do NOT change the class name
class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
        int sum=0;
        int n=input.nextInt();
        for(int i =0;i<=n;i++){
            sum=sum+i;
        }
        System.out.println(sum);
    }
}
