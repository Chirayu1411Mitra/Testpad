import java.util.Scanner;
public class largest_of_3_numbers{
public static void main(String [] args){
     Scanner input = new Scanner(System.in);
    int max;
    int a;
    int b;
    int c;
    a=input.nextInt();
    b=input.nextInt();
    c=input.nextInt();
    if(a>b &&a>c){
        max=a;
    }
    else if(b>a &&b>c){
        max=b;
    }
     else{
         max=c;
     }
        System.out.println(max);
	}
}
