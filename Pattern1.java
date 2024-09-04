class Pattern1{
    public static void main (String args[])
    { char a = 65;
        for(int i=0;i<4;i++)
         {
            for(int j=3;j>i;j--)
            {
                System.out.print(" ");
            }
          
            for(int k=0;k<i;k++)
            {
            System.out.print(a+" ");
            a++;
            }
          System.out.println();  
         }
    }
}

OUTPUT:
   A 
 B C 
D E F