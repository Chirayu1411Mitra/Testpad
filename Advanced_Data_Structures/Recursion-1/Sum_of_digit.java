import java.util.Scanner;
// Other imports go here
// Do NOT change the class name
class Main{
     static int sumofDigit(int n){
    if(n==0){
        return 0;
    }
    return n%10+sumofDigit(n/10);
}
    public static void main(String[] args)
    {
 Scanner input=new Scanner(System.in);
  int test = input.nextInt();
    int sum;     
    while(test>0){
     sum= input.nextInt();
        System.out.println(sumofDigit(sum));
         test--;
        }
        input.close();
}
}
