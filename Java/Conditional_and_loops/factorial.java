import java.util.Scanner;
public class factorial{
	static long fact(int n){
	long fact=1;
	 for(int i =1;i<=n;i++){
       	 fact=fact*i;
	  }
	    return fact;

}

	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	int n=input.nextInt();
	long fact=fact(n);
	System.out.println(fact);
	}

}
