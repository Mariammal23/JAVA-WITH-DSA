import java.util.*;
abstract class Animal{
    abstract void sound();
    
}
class dog extends Animal{
    void sound(){
        System.out.println("Barking");
    }
}
class Main
{
	public static void main(String[] args) {
		dog d= new dog();
		d.sound();
		
	}
}