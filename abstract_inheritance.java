class Student extends College{
    float getClgNaacRank(){
        return 3.5f;
        }
public static void main(String [] args){
    College obj = new Advisor();//obj object created for Advisor by using reference for parent class of  College class
    System.out.println("Advisor get clg naac rank:"+ obj.getClgNaacRank());
    College obj1 = new Student();
    System.out.println("Student get clg naac rank:"+obj1.getClgNaacRank());
   // College clg = new College(); **** can't creat object for the College class
    //System.out.println(clg.getNumberOfTheRank());
} 
}

abstract class College{//there can't create object for this class
    abstract float getClgNaacRank();//there can't define the method probleam
        int getNumberOfTheRank(){
            return 35;
        }
}
class Advisor extends College{
    float getClgNaacRank(){
        return 2.5f;
    }
} 
