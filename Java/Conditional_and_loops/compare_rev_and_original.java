import java.util.Scanner;
// Other imports go here// Do NOT change the class name
class Main
{
    public static void main(String[] args)
    {
          Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        for(int i=0;i<n;i++){
        int m;
        m=input.nextInt();
        int Rev=rev(m);
        if(Rev==m){
            System.out.println("Equal");
        }
        else{
            System.out.println("Not Equal");  
        }
        }
    }
    static int rev(int n){
        int rev=0;
        int digit;
        while(n!=0){
            digit=n%10;
            rev=rev*10+digit;
            n=n/10;
        }
        return rev;
    }
}
