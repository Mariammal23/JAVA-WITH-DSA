class poly1{
int add(int a, int b){
return a+b;
}
int add(int a, int b, int c ){
return a+b+c;
}

}
class example{
public static void main(String[] args){
poly1 p = new poly1();
System.out.println(p.add(5, 10));
System.out.println(p.add(5,10,2));

}
}