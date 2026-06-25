import java.util.*;
public class add
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    System.out.println("Enter a row:");
	    int r=s.nextInt();
	     System.out.println("Enter a col:");
	    int c=s.nextInt();
	    int [][] A=new int[r][c];
	    int [][] B=new int[r][c];
	    int [][] C=new int[r][c];
	    System.out.println("Enter A matrix: ");
	    for(int i=0;i<r;i++){
	        for(int j=0;j<c;j++){
	            A[i][j]=s.nextInt();
	        }
	    }
		System.out.println("Enter B matrix: ");
	    for(int i=0;i<r;i++){
	        for(int j=0;j<c;j++){
	            B[i][j]=s.nextInt();
	        }
	    }
	    for(int i=0;i<r;i++){
	        for(int j=0;j<c;j++){
	            C[i][j]=A[i][j]+B[i][j];
	        }
	    }
		System.out.println("Addition of Matrix: ");
	    for(int i=0;i<r;i++){
	        for(int j=0;j<c;j++){
	            System.out.print(C[i][j]+" ");
	        }
            System.out.println();
	    }
	}
}
