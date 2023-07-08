
public class Intersection {

	public static void main(String[] args) {
		int a[] = {2, 6, 7, 8, 9};
		int b[] = {6, 9, 10};
		int i =0 , j =0;
		while(i<a.length && j<b.length){
			if(a[i] == b[j]){
				System.out.print(a[i]+" ");
				i++;
				j++;
			}
			else if(a[i]> b[j]){
				j++;
			}
			else{
				i++;
			}
		}
		
	}

}
