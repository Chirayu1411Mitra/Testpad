import java.util.Scanner;
public class Aggregate_and_percentage{
	public static void main(String[] args){
     Scanner input=new Scanner(System.in);
    int M1;
    M1=input.nextInt();
    int M2;
    M2=input.nextInt();
    int M3;
    M3=input.nextInt();
    int M4;
    M4=input.nextInt();
    int M5;
    M5=input.nextInt();
      int Agg=M1+M2+M3+M4+M5;
      int percent=((Agg*100)/500);
      System.out.print(Agg+" ");
      System.out.print(percent); 
}

}
