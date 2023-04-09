package star;
import java.util.*;

public class factorial_1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
		int sum=1;
		System.out.print("enter the number:-  ");
		int n=sc.nextInt();
		for(int i=1; i<=n; i++) {
			sum=sum*i;
			//System.out.println(sum);
		}
		System.out.println(sum);

	}

}
