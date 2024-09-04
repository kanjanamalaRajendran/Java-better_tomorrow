class ToFindSecondMaxArrayValue{
    public static void main(String[] args) {
        int array[]={12,23,99,45,56,67};
        int max = 0;
        int temp = max;
        int max2=0;
        for(int i=1;i<array.length;i++){
           if(max<array[i]){
               max=array[i];
           }
        }
        for(int i=1;i<array.length;i++){
            if((max2<array[i]) && max>array[i]){
                max2=array[i];
            }
        }
         System.out.println("largest value in array :"+max);
         System.out.println("Second largest value in array :"+max2);
    }
}