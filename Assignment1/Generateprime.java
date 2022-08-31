public class Generateprime {
    static boolean checkprime(int num)
    {
        for(int i=2;i<=num/2;i++)
        {
            if(num%i==0)
                return false;
        }
        return true;
    }
    public static void main(String args[])
    {
        System.out.println("The prime numbers are: \n");
        for(int i=2;i<=100;i++)
        {
            if(checkprime(i))
                System.out.print(i+" ");
        }
    }
    
}
