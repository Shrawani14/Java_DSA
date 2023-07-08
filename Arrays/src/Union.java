
public class Union {
	public static void union(int a[] , int b[]){
		
		int m = a.length;
		int n = b.length;
		int i = 0, j = 0;
		while(i<m && j<n){
			if(a[i] < b[j]){
				System.out.print(a[i]+" ");
				i++;
			}
			else if(b[j] < a[i]){
				System.out.print(b[j]+" ");
				j++;
			}
			else{
				System.out.print(b[j]+" ");
				i++;
				j++;
			}
			
		}
		while(i<m){
			System.out.print(a[i]+" ");
			i++;
		}
		while(j<n){
			System.out.print(b[j]+" ");
			j++;
		}
	}
	public static void main(String[] args) {
		int a[] = {3,4,5,6,7,8,9};
		int b[] = {1,2};
		 union(a , b);

	}

}
