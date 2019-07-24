package dvsv;

public class dvsvsd {
	public static void main(String[] args) {
		int[] a= {1,2,3,5,6};
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<a.length-i-1;j++) {
				if(a[j]<a[j+1]) {
					int temp=0;
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					 
				}
			}
		}	
	for(int i=0;i<a.length;i++) {
		System.out.println(a[i]);
	}
}
}