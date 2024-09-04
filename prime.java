public class prime{
 public static void main(String[] args)
{
    int num = 29;
    boolean isprime = true;
    for(int i=2;i<num;i++)
    {
    if(num%i==0)
    {
      isprime=false;
      break;
    } 
    }
    if(isprime)
    {
      System.out.println(num+"this is prime number");
    }
    else
    { 
       System.out.println(num+" this is not in prime number");
    }
}
}