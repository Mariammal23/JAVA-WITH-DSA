import java.util.*;
public class arraylist{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
		ArrayList<Integer>arr=new ArrayList<>();
		arr.add(2);
		arr.add(3);
		arr.add(4);
		System.out.println("Insert: "+arr);
		arr.remove(1);
		System.out.println("Remove: "+arr);
		System.out.println("Set :" +arr.set(1,6));
		System.out.println("Size: " +arr.size());
		System.out.print("Insempty:" +arr.isEmpty());
		
		
	}
}