import java.util.Scanner;
public class Gross_salary_of_employee{
 public static void main(String[] args)
  {
   Scanner input = new Scanner(System.in);
      int BasicSalary;
      BasicSalary=input.nextInt();
      double HRA=0.1*BasicSalary;
      double DA=0.2*BasicSalary;
      int GrossSalary=(int)(BasicSalary+HRA+DA);
      System.out.println(GrossSalary);
  }
}
