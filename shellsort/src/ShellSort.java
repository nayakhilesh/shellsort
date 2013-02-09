
public class ShellSort {
 	
	public static int[] shell(int n, int[] arr) {
		
		if (n <= 0 || n > arr.length) {
			return arr;
		}
		
		for (int i=0;i<=(n-1);i++) {
			
			for (int j=i+n;j<arr.length;j+=n) {
				
				int k=j-n;
				int temp = arr[j];
				while(k >= 0 && temp<arr[k]) {
					arr[k+n]=arr[k];
					k-=n;
				}
				
				arr[k+n] = temp;
			}
			
		}
		
		return arr;
	}
 
	public static int[] shellSort(int[] arr) {
		
		int n = (arr.length/2);
		if(n % 2 == 0) {
			n-=1;
		}
		for(int i=n;i>=1;i-=2) {
			arr = shell(i,arr);
		}
		return arr;
	}
 }