package DataStruct;

import java.util.Scanner;

public class MergeSort {

public static void main(String[] args){
Scanner s=new Scanner(System.in);
int[] a= new int[10];

}
public void Merge(int[] a,int[] l, int[] r){
	int b=l.length;
	int c=r.length;

	for(int x=0;x<b&x<c;x++){
		if(l[x]>r[x]){
			a[x]=r[x];
		}
		else a[x]=l[x];
		
}
	int y=0;
	while ( y <= b) {
        l[y] = a[y];
        k++;
        i++;
    }
- See more at: http://www.java2novice.com/java-sorting-algorithms/merge-sort/#sthash.kwBNeTDa.dpuf
public void Mergesort(int[] a){
	int n=a.length;
	int[] l=new int[10];
	int[] r=new int[10];
	for(int i=0;i<=n/2;i++){
		 l[i]=a[i];
	}
	for(int j=n/2+1;j<=n-1;j++){
        int k=0;
		r[k]=a[j];
	k++;
	}
	
		Mergesort(l);
		Mergesort(r);
		Merge(a[],)
		
	}
}
}
