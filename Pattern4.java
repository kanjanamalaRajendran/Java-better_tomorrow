class Pattern4{
    public static void main(String[] args) {
        int k=1;
        int d=1;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                if(i==j){
                    System.out.print(k+"  ");
                }
                else{
                    System.out.print(d+"  ");
                }
            }
            k++;
             System.out.println();
        }
       
    }
}