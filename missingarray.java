class Hello{
public static void main(String [] args){
int arr[]={1,2,3,5,6,7,8,9}; 
int count =1;
for(int i=0;i<arr.length;i++){
if (arr[i]!=count){
System.out.println(count);
i=i-1;
}
count++;
}
}
}