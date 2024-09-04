class Symbles{
    public static void main(String [] args){
        Shape obj  =new Rectangle();
        System.out.println("Area of the rectangle is : "+obj.getArea());
        obj.getdraw();
        Shape obj1  =new Circle();
        System.out.println("Area of the rectangle is : "+obj1.getArea());
        obj1.getdraw();
        Shape obj2  =new Triangle();
        System.out.println("Area of the rectangle is : "+obj2.getArea());
        obj2.getdraw();
        
    }
}

interface Shape{
    abstract int getArea();
    abstract void getdraw();
}
class Rectangle implements Shape{
    public int getArea(){
        return 56;
    }
    public void getdraw(){
        System.out.println(" Name of the shape :RECTANGLE");
    }
}
class Circle implements Shape{
    public int getArea(){
        return 45;
    }
    public void getdraw(){
        System.out.println(" Name of the shape :CIRCLE");
    }
}
class Triangle implements Shape{
    public int getArea(){
        return 34;
    }
    public void getdraw(){
        System.out.println("Name of the shape :TRIANGLE");
    }
}

