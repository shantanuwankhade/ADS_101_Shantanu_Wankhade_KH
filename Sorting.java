import java.util.*;

class Sorting{
	void sort(int arr[]){
		int n = arr.length;
		for(int i=n-1;i>0;i--){
			int key = arr[i];
			int j = i-1;
		
		while(j>=0 && arr[j]>key){
			arr[j+1]=arr[j];
			j=j-1;
			//
			int m= arr.length;
			for(int u=0;u<m;u++){
				System.out.println(arr[i]);
			}
			
		}
		arr[j+1]=key;
		}
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		
		int a[] = new int[n];
		for(int i=0; i<n;i++){
			a[i]= sc.nextInt();
		}
		
		Sorting S = new Sorting();
		S.sort(a);
		int w= a.length;
			for(int i=0;i<w;i++){
				System.out.print(a[i]+" ");
	}
	}
}