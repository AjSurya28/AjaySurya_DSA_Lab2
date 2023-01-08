
package driver.java;


public class Service {
	public  int targetArch(int[] arr, long target) {
	long sum = 0;
	
	for (int i = 0; i < arr.length; i++) {
		
	sum += arr[i];

	
	if (sum >= target) {
		
	return (i+1);
	}
	}
	
	return 0;
	
	}
	}
	

