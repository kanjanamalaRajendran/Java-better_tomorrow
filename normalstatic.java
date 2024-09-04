class Bank{
static int balan = 1000;
int normalveriable(){
int balance=1000;
return ++balance;
}
int staticveriable(){
return balan++;
}
public static void main(String []args){
Bank obj = new Bank();
System.out.println("I am normal "+obj.normalveriable());
System.out.println("I am normal "+obj.normalveriable());
System.out.println("I am normal "+obj.normalveriable());
System.out.println("I am normal "+obj.staticveriable());
System.out.println("I am normal "+obj.staticveriable());
System.out.println("I am normal "+obj.staticveriable());
System.out.println("I am normal "+obj.staticveriable());
System.out.println("I am normal "+obj.staticveriable());
System.out.println("I am normal "+obj.staticveriable());
}
}



