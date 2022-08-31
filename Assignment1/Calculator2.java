import java.util.Scanner;
class Calculator2 
{
    int x,y;
    Calculator2(int x, int y)
    {
     	this.x=x;
	this.y=y;
    }
    int add()
    {
        return (x+y);
    }
    int sub()
    {
        return (x-y);
    }
    int multi()
    {
        return (x*y);
    }
    int div()
    {
        return (x/y);
    }
    void show()
    {
        System.out.println("The sum is: "+add());
        System.out.println("The differnce is: "+sub());
        System.out.println("The product is: "+multi());
        System.out.println("The quotient is: "+div());
    }
}
 class calc
    {
        public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter two numbers: ");
            int num1=sc.nextInt();
            int num2=sc.nextInt();
            Calculator2 c=new Calculator2(num1,num2);
            c.show();
        }
    }
    