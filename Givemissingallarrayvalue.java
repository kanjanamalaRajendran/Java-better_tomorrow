class GiveMissingAllArrayValue{
    public static void main(String [] srgs){
        int arr[] = {1,2,3,5,6,8,9,10,11,13};
        int count=1;
        for (int i=0;i<arr.length;i++){
            if(arr[i] !=count){
                System.out.println(count);
                i=i-1;
            }
            count++;
        }
    }
}