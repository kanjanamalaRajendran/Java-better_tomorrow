import java.util.Scanner;
class Sorted_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a=0;
        int[] array=new int[10];
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        System.out.println();
        for(int i=0;i<n;i++){
            /*a=array[i]
            for (int j =0;j<=i;j++){
                array[j]=a;*/
              // System.out.print(array[i]+" ");
                if(a !=array[i]){
                    a=array[i];
                    System.out.print(a+" ");
                }
            }
            
        }
    
    }