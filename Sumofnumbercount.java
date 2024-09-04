class SumOfNumberCount{
    public static void main(String[] args) {
        int array[]={1,5,7,1,1,6,0,4,2,2,6,0};
        int count=0;
        int k=6;
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if((array[i]+array[j])==k){
                    count+=1;
                }
            }
        }
        System.out.println(count);
    }
}