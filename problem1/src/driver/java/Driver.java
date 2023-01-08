package driver.java;
import java.util.*;
public class Driver {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the size of transaction array");
		
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		
		System.out.println("enter the values of array");
		
		for (int i = 0; i < size; i++)
			
		arr[i] = sc.nextInt();
		
		System.out.println("enter the total no of targets that needs to be achieved");
		
		int targetNo = sc.nextInt();
		
		while (targetNo-- != 0) {
			
		
		long target;
		
		System.out.println("enter the value of target");
		
		target = sc.nextInt();
		
		Service a= new Service();
		int b = a.targetArch(arr, target);
		
		if(b>0) {
			System.out.println("target achieved after"+ b +"Transaction");
			
		}
		else {
			System.out.println("Given Target is not achieved");
		}
		
		}
	}
}





	