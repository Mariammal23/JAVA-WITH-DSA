import java.util.*;
public class kadane{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
		int n = s.nextInt();
        int[] a = new int[n];
		for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
		int sum=0;
		int maxsum=0;
		for(int i=0;i<n;i++){
			sum+=a[i];
			maxsum=Math.max(maxsum,sum);
			if(sum<0){
				sum=0;
			}
		}
		System.out.print(maxsum);
		
    }
}