import java.util.*;
public class hollowpyramid
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    System.out.println("Enter a n: ");
	    int n=s.nextInt();
	    
		for(int i=1;i<=n;i++){
		    for(int j=1;j<n-i;j++){
		        
		        System.out.print(" ");
		    }
		
		for(int k=1;k<=(2*i-1);k++){
		    if(j==1 || j<=(2*i-1) || i==4){
				System.out.print("*");
			}
			esle{
				System.out.print(" ");
			}
		}
		System.out.println();
		}
	}
}