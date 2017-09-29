 package Algorithms;

public class MergeSort {
	
	public void sort(int a[]){
		 
		int[] l= new int[a.length/2];
		int[] r= new int[a.length/2];
		if(a.length>2){
		for(int i=0;i<a.length/2;i++){
			l[i]=a[i]; 	
		}
		for(int j=a.length/2;j<a.length;j++){
			r[j]=a[j];

		}
sort(l);
sort(r);
merge(l,r,a);
	}
		}
	
	public void merge(int[] l,int[] r,int[] a){
		
		int i=0,j=0,k=0;
	while(i<l.length && j<r.length){
	if(l[i]<=r[j]){
		a[k]=l[i];
		k++;
		i++;
	}
	else{
		a[k]=r[j];
		k++;
		j++;
	}}
	while(i<l.length){
		a[k]=l[i];
	i++;
	k++;
	}
	while(j<r.length){
	a[k]=r[j];
	k++;
	j++;
	}
	}
	
	
}
