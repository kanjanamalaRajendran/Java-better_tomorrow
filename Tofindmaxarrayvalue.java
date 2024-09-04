class ToFindMaxArrayValue {
    public static void main(String[] args) {
        int array[]={12,23,99,45,56,67};
        int max = 0;
        for(int i=1;i<array.length;i++){
           if(max<array[i]){
               max=array[i];
           }
        }
         System.out.println(max);
    }
}