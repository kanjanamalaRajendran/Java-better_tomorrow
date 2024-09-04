class StringExample {
    public static void main(String[] args) {
        String s1="Welcome";
        //creating String by java string literal;
        String s2 = new String("Example");
        //creating java string byn new keyword
       char[] ch= {'k','a','n','j','a','n','a','m','a','l','a'};
       String s3=new String(ch);
       //converting char array to string;
       System.out.println(s1);
       System.out.println(s2);
       System.out.println(s3);
       }
}