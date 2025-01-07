import java.util.Scanner;
public class sum_of_first_n_terms{
	public static void main(String[] args){
	Scanner input = new Scanner (System.in);
        int sum=0;
        int n=input.nextInt();
        for(int i =0;i<=n;i++){
            sum=sum+i;
        }
        System.out.println(sum);
    }
}

