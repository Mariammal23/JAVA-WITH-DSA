class A{
void eat(){
System.out.println("A is Eating");

}
}
class B extends A{
void bark(){
System.out.println("B is Barking");
}
}
public class single{
public static void main(String[] args){
B b=new B();
b.eat();
b.bark();
}
}