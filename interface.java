class Advisor implements Management, Principal{
     public String getClgDetail(){
        return "feesdivision can't known";
    }
    public int getSalary(){
        return 45000;
    }
    public static void main(String []args){
        Management obj =new Hod();
        Principal obj1 = new Hod();
        System.out.println("HOD: "+obj1.getClgDetail());
        System.out.println("HOD salary: "+obj.getSalary());
        obj=new Advisor();
        obj1 = new Advisor();
        System.out.println("Advisor : " +obj1.getClgDetail());
        System.out.println("Advisor salary: " +obj.getSalary());
    }
}
interface Principal{
    abstract public String getClgDetail();
}
interface Management{
    abstract public int getSalary();
}
class Hod implements Management,Principal{
    public String getClgDetail(){
        return "feesdivision known";
    }
    public int getSalary(){
        return 80000;
    }
}
