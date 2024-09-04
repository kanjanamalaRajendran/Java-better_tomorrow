class FreqencyArray{
    public static void main(String[] args){
        int arr[]={1,1,2,3,1,2,1};
        int freq[] = new int[115];
        for(int i=0;i<arr.length;i++){
            freq[arr[i]]=freq[arr[i]]+1;
        }
        
        for(int j=0;j<arr.length;j++){
            if(freq[j]>0){
                System.out.println("freq "+j+" count: "+freq[j]);
            }
        }
    }
}