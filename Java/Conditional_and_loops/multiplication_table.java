import java.util.Scanner;
public class multiplication_table{
	public static void main(String[] args){
	 Scanner input = new Scanner(System.in);
      	 int n = input.nextInt();
     	 int m= input.nextInt();
       	  for (int i=1;i<=m;i++){
         	 System.out.println(n*i);
      		}
 	}
}
