class ArrayReverse{
    public static void main(String []args){
       int arr[]={11,22,33,44,55,66,77,88,99,00};
       int n=arr.length;
       n=n-1;
       for(int i=0;n>=i;n--){
           System.out.println(arr[n]);
       }
    }
}