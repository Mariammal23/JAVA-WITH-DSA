import java.util.*;

public class movezero2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }

        int left = 0;
        int right = n - 1;

        while (left < right) {

            if(a[left] != 0) {
                left++;
            }

            else if(a[right] == 0) {
                right--;
            }
			else{
			int temp = a[left];
              a[left] = a[right];
                a[right] = temp;

                left++;
                right--;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}