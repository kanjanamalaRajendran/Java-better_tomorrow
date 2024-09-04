class Student {
  static  int roll_no;
  /*  arr[0]=68;
    arr[1]=67;
    arr[2]=70;
    arr[3]=89;
    arr[4]=90;*/
    static int sum_mark;
    static float average;
    int count=0;
    static int mark []={50,60,70,80,90};
    void setrollno( int roll_no){
        this.roll_no=roll_no;
         System.out.println("roll_number:"+this.roll_no);
    }
    void mark(){
     
           for (int i=0;i<mark.length;i++){
            count+=mark[i];
        }
         System.out.println("total mark:"+count);
    }
    void details(){
        average=count/5;
        System.out.println("the average value is:"+average);
        if(average >90){
            System.out.println(" the grade is :O");
        }
        else if(average > 80){
            System.out.println(" the grade is ; A");
        }
        else if (average  > 70){
            System.out.println("the grade is B");
        }
        else if(average > 50){
            System.out.println("the grade is C");
        }
        else
        {
            System.out.println("fail");
        }
    }
    
    public static void main(String[] args) {
        Student stu = new Student();
        stu.setrollno(50);
        stu.mark();
        stu.details();
    }
}