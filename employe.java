import java.util.*;
class Main {
    int id;
    String name;
	Main(int id, String name) {
        this.id = id;
        this.name = name;
    }
	void display() {
        System.out.println("ID : " + id);
        System.out.println("Name : " + name);
    }
}
public class employe {
    public static void main(String[] args) {
		ArrayList<Main> arr = new ArrayList<>();
		arr.add(new Main(101, "Sri"));
		Main e = arr.get(0);
		e.display();
    }
}