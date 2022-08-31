public class Generateodd {
    public static void main(String args[])
    {
        System.out.print("All the odds between 1 to 100: \n");
        for(int i=1;i<=100;i++)
        {
            if(i%2!=0)
                System.out.print(i+" ");
        }
    }
    
}
