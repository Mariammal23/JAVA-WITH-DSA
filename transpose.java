import java.util.*;
public class transpose
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    System.out.println("Enter a row:");
	    int r=s.nextInt();
	     System.out.println("Enter a col:");
	    int c=s.nextInt();
	    int [][] A=new int[r] [c];
	    
	    System.out.println("Enter A matrix: ");
	    for(int i=0;i<r;i++){
	        for(int j=0;j<c;j++){
	            A[i][j]=s.nextInt();
	        }
	    }
	    System.out.println("Transpose of Matrix: ");
	    for(int i=0;i<c;i++){
	        for(int j=0;j<r;j++){
	            System.out.print(A[j][i]+" ");
	        }
            System.out.println();
	    }
	}
}
