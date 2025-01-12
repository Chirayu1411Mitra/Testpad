import java.util.Scanner;

class Copy_elements
{
  public static void main(String[] args)
  {
      Scanner input=new Scanner(System.in);
   int[] a=new int[10];
   int [] b= new int[10];
   for (int i=0;i<10;i++){
       a[i]=input.nextInt();
   }
   for(int i=0;i<10;i++){
       b[i]=a[10-i-1];
   }
      Print(b);
  }
    static void Print(int [] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}