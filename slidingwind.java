import java.util.*;
public class slidingwind{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
		int n = s.nextInt();
        int[] a = new int[n];
		for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
		int max=a[0];
		int k=3;
		for(int i=0;i<n-k;i++){
		int sum=0;
			for(int j=i;j<i+k;j++){
				sum+=a[j];
			}
			if(sum>max){
				max=sum;
			}
		}
		System.out.println(max);
		
    }
}