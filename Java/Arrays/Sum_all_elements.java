import java.util.Scanner;

public class Sum_all_elements{
	public static void main(String[] args){
		 Scanner input=new Scanner(System.in);
  		  int sum=0;
		    int[] arr=new int[10];
 		   for(int i=0;i<10;i++){
  		      arr[i]=input.nextInt();
  		  }
   		   for(int i=0;i<10;i++){
    		      sum+=arr[i];
    		  }
    		  System.out.println(sum);
		
}

}
