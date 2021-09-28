package math1;
import java.util.*;

public class question11 {

	public static void main(String[] args) {
		int a, x;
		System.out.println("enter number");
		Scanner r=new Scanner(System.in);
		a=r.nextInt();
		if(a<0) {
			x=(a*-1);
			System.out.println(" Absolute number =  " +x);
			
		}
		else
		{ System.out.println(" Absolute Number= " +a);
		
		}

	}

}
