class SumOfArray {
    public static void main(String[] args) {
        int array[]={12,23,34,45,56,67};
        int sum = 0;
        for(int i=1;i<array.length;i++){
            sum=sum+array[i];
        }
         System.out.println(sum);
    }
}