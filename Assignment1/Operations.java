import java.util.Scanner;
public class Operations
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the two operands: ");
        int a=sc.nextInt();
        int b=sc.nextInt();

        System.out.println("The Addition is: "+(a+b));
        System.out.println("The Substraction is: "+(a-b));
        System.out.println("The Multiplication is: "+(a*b));
        System.out.println("The Division is: "+(a/b));
    }
}