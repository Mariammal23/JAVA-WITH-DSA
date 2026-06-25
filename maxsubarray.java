import java.util.*;
public class maxsubarray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
		int n = s.nextInt();
        int[] a = new int[n];
		for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
		int sum=0;
		int max=a[0];
		for(int i=0;i<n;i++){
			sum=0;
			for(int j=i;j<n;j++){
				sum+=a[j];
			}
			if(sum>max){
				max=sum;
			}
		}
		System.out.println(max);
		
    }
}