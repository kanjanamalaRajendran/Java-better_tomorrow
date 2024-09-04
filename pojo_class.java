class Employee{
    int EmpId;
    Address address; //pojo class ,this class access the method of Address class
    public String toString(){
        return "EmpId: "+EmpId+"\n"+"state: "+address.state+"\n"+"Address: "+address.address+"\n"+"pincode : "+address.pincode+"\n"+"landmark : "+address.landmark;
    }
    
    Employee(int id ,Address address){
        this.EmpId=id;
        this.address=address;
        address.landmark="eckm";//there can change the Address variable diclaretion 
    }
    public static void main(String [] args){
        Address address = new Address(45643,"tup","mkce","tamil");
        Employee emp = new Employee(123,address);  //Address object here using;
        System.out.println(emp.toString());//tostring using printing all in one line;
    }
}
class Address{
    int pincode;
    String address;
    String landmark;
    String state;
    Address(int pincode,String address, String landmark,String state){
    this.pincode =pincode;
    this.address=address;
    this.landmark=landmark;
    this.state=state;
    }
}
