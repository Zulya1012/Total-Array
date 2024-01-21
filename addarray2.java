import java.util.Scanner;
public class addarray2{
	public static void main(String[] arg){
		Scanner s=new Scanner(System.in);
		int[] c=new int[5];
		for(int i=0; i<c.length; i++){
		System.out.println("Enter "+(i+1));
		c[i]=s.nextInt();		
		}
		
		int sum=0;
		for(int i=0; i<c.length; i++){
			sum=sum+c[i];
		}
		System.out.println("Total: " +sum);
	}
}
	