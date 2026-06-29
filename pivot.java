import java.util.*;
public class pivot{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
		int n = s.nextInt();
        int[] a = new int[n];
		for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
		}
		int totalsum=0;
		for(int i=0;i<n;i++){
			totalsum+=a[i];
			
		}
		int leftsum=0;
		for(int i=0;i<n;i++)
		{
			int rightsum=totalsum-leftsum-a[i];
			if(leftsum==rightsum){
				System.out.print(i);
				return;
			}
			leftsum+=a[i];
			
		}
}
}
