import java.util.Scanner;
public class calculator {
    int a;
    int b;
    void add()
    {
        System.out.println("The sum is: "+(a+b));
    }
    void sub()
    {
        System.out.println("The difference is: "+(a-b));
    }
    void mul()
    {
        System.out.println("The product is: "+(a*b));
    }
    void div()
    {
        System.out.println("The quotient is: "+(a/b));
    }

    void show()
    {
        add();
        sub();
        mul();
        div();
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int x=sc.nextInt();
        int y=sc.nextInt();

        calculator c1=new calculator();
        c1.a=x;
        c1.b=y;
        c1.show();

    }

    
}
