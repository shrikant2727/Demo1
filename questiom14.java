package math1;
import java.util.*;

public class questiom14 {

	public static void main(String[] args) {
		 int y;
		 System.out.println("Enter year");
		 Scanner r=new Scanner(System.in);
		 y= r.nextInt();
		 if(y%100==0 && y%4==0 || y%4==0 ) {
             System.out.println("year is leap");
		 }
		 else
			 System.out.println("not leap year");

	}

}
