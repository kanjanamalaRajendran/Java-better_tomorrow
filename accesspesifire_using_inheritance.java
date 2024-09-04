class Student extends Advisor{
    private int stuIdPassword=700;
    protected int stuclgcode;
    public String stuname;
    public int stuclgcode(int a){
        //super.advclgcode(a);
        return a;
       
    }
    protected String stuname(String stuname){
         this.stuname=stuname;
         return stuname;
    }
    private void stuIdPassword(){
        System.out.println("student password is : " +stuIdPassword);
    }
    public static void main(String [] args){
    Student obj = new Student();
    System.out.println("the student name is : "+(obj.stuname("dharini")));
    obj.stuIdPassword();
    System.out.println("the college code is : "+obj.stuclgcode(2345));
    System.out.println("the advisor name is : "+(obj.advname("initha")));
    Advisor obj1=new Advisor();
    System.out.println("advisor password is : "+obj1.getadvIdPassword());
    System.out.println("the college code is : "+obj.advclgcode(2345));
    System.out.println("the hod name is : "+(obj.hodname("ajitha")));
    Hod obj2 = new Hod();
    System.out.println("hod password is : "+obj2.gethodIdPassword());
    System.out.println("the college code is : "+obj.hodclgcode(2345));
    
    }
}
class Advisor extends Hod{
    private int advIdPassword=500;
    protected int advclgcode;
    public String advname ;
    public int advclgcode(int a){
        //super.hodclgcode(a);
        return a;
       
    }
    protected String advname(String advname){
        this.advname=advname;
        return advname;
    }
    public int getadvIdPassword(){
        return advIdPassword;
    }
    
    
}
class Hod{
    private int hodIdPassword = 200;
    protected int hodclgcode;
    public String hodname ;
    public int hodclgcode(int a){
        return a;
    }
    protected String hodname(String hodname){
        this.hodname=hodname;
        return hodname;
    }
    public int gethodIdPassword(){
        return hodIdPassword;
    }
    
}

