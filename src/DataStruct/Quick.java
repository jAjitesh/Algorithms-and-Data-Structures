package DataStruct;
import java.util.Scanner;
import java.util.Random;
public class Quick {
	
	public int c = 0;
	public int[] a;
	
	public void replace(int x, int y) {
		int t = a[x];
		a[x] = a[y];
		a[y] = t;
	}
	
	public int partition(int d,int e)
	{

		int p = a[e];
		int i = d-1;
		
		for(int j = d; j <= e-1; j++){
			c++;
			if(a[j] <= p)
			{
				i=i+1;
				replace(j, i);
			}

		}
		replace(i + 1, e);

		return i + 1;   


	}
	public void insertionSort(int s, int b)
	{
		
		for(int i = s + 1; i <= b; i++)
		{
			int x = a[i];
			int y = i;
			
			while(y > s && a[y-1] > x){
				c++;
				a[y] = a[y-1];
				y = y-1;
			}
			
			c++;
			a[y] = x;
		}
	}
	public void BasicSortWithInsertionSort(int s, int b){
		if(s < b){
			int p = partition(s, b);
			
			if(p - s >= 10){
				BasicSortWithInsertionSort(s, p - 1);
			} else{
				insertionSort(s, p - 1);
			}

			if(b - p >= 10){
				BasicSortWithInsertionSort(p + 1, b);
			} else{
				insertionSort(p + 1, b);
			}
		}
	}
	public int randomize(int s, int b)
	{ 

		Random rand = new Random();
		int random = s + rand.nextInt(b - s);
		replace(random, b);
		
		return partition(s, b);
	}
	
	public int Medianelement(int s, int b) {
		int mid = (s + b) / 2;

		if (a[s] > a[mid]){
			replace(s, b);
		}

		if (a[s] > a[b]){
			replace(s, b);
		}

		if (a[mid] > a[b]){
			replace(mid, b);
		}
		
		c += 3;

		replace(mid, b);
		return partition(s, b);

	}
	
	

	public void medianInsertionSort(int s, int b){

		if(s < b){
			int p = randomize(s, b);
			if(p - s >= 10)
			{
				medianInsertionSort(s, p - 1);
			} 
			else
			{
				insertionSort(s, p - 1);
			}

			if(b - p >= 10)
			{
				medianInsertionSort(p + 1, b);
			} 
			else
			{
				insertionSort(p + 1, b);
			}
		}
	}
	public void quickSort(int s, int b)
	{
		if(s < b){
			int p = partition(s, b);
			quickSort(s, p - 1);
			quickSort(p + 1, b);
		}
	}
	
	
	public void randomizePivot(int s, int b)
	{
		if(s < b){
			int p = randomize(s, b);
			randomizePivot(s, p - 1);
			randomizePivot(p + 1, b);
		}
	}
	
	public void medianSort(int s, int b)
	{
		if(s < b){
			int p = Medianelement(s, b);
			medianSort(s, p - 1);
			medianSort(p + 1, b);
		}
	}
	
	public void randomizeinsertionSort(int s, int b){
		if(s < b){
			int p = randomize(s, b);
			
			if(p - s >= 10){
				randomizeinsertionSort(s, p - 1);
			} 
			else
			{
				insertionSort(s, p - 1);
			}

			if(b - p >= 10)
			{
				randomizeinsertionSort(p + 1, b);
			} 
			else
			{
				insertionSort(p + 1, b);
			}
		}
	}

	
	
	public Quick(int[] ar){
		this.a = ar;
		this.c = 0;
	}
	
	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);
		System.out.print("Number of elements in the array - ");
		int n=sc.nextInt();
		
		int[] a=new int[n];
		
		Random rand = new Random();
		
		for(int i=0;i<n;i++){
			a[i]= rand.nextInt(n) + 1;
		}
		
		sc.close();
		
		if(n <= 20){
			System.out.println("The given array");
			for(int j = 0; j < n; j++){
				System.out.print(a[j]);
				System.out.print(" ");
			}
			System.out.println(" ");
		}
		
		
		System.out.println(" ");
		System.out.println("Normal quick sort - ");
		
		Quick Nl = new Quick(a.clone());
		Nl.quickSort(0, n - 1);
		
		if(n <= 20)
		{
			for(int m = 0; m < n; m++)
			{
				System.out.print(Nl.a[m]);
				System.out.print(" ");
			}
			System.out.println(" ");
		}
		
		System.out.println("Number of key comparisions - " + Nl.c);
		
		double qc = Nl.c;
		
		System.out.println(" ");
		System.out.println("Normal quick sort with insertion sort -");
		Quick BasicSortWithInsertionSort = new Quick(a.clone());
		BasicSortWithInsertionSort.BasicSortWithInsertionSort(0, n - 1);
		
		if(n <= 20){
			for(int m = 0; m < n; m++){
				System.out.print(BasicSortWithInsertionSort.a[m]);
				System.out.print(" ");
			}
			System.out.println(" ");
		}
		
		System.out.println("No of comparisions" + BasicSortWithInsertionSort.c);
		System.out.println("% of key comparisions saved - " + ((qc - BasicSortWithInsertionSort.c) * 100)/qc);
	
		
		System.out.println(" ");
		System.out.println("Randomized QuickSort - ");
		Quick rqs = new Quick(a.clone());
		rqs.randomizePivot(0, n - 1);
		
		if(n <= 20){
			for(int v = 0; v < n; v++){
				System.out.print(rqs.a[v]);
				System.out.print(" ");
			}
			System.out.println(" ");
		}
		
		System.out.println("Number of key comparisions  - " + rqs.c);
		System.out.println("% of key comparisions saved - " + ((qc - rqs.c) * 100)/qc);
		
		
		System.out.println(" ");
				System.out.println("Randomized quick sort with insertion sort");
		Quick ris = new Quick(a.clone());
		ris.randomizeinsertionSort(0, n - 1);
		
		if(n <= 20){
			for(int i = 0; i < n; i++){
				System.out.print(ris.a[i]);
				System.out.print(" ");
			}
			System.out.println(" ");
		}
		
		System.out.println("Number of key comparisions - - " + ris.c);
		System.out.println("% of key comparisions Saved - " + ((qc - ris.c) * 100)/qc);
	
		
		System.out.println(" ");
		
		System.out.println("Median of 3 partition - ");
		Quick mts = new Quick(a.clone());
		mts.medianSort(0, n - 1);
		
		if(n <= 20){
			for(int i = 0; i < n; i++){
				System.out.print(mts.a[i]);
				System.out.print(" ");
			}
			System.out.println(" ");
		}
		
		System.out.println("Number of key comparisions -- " + mts.c);
		System.out.println("% of key comparisions saved - " + ((qc - mts.c) * 100)/qc);

		System.out.println(" ");

		System.out.println("Median of three  with insertion sort - ");
		Quick mtis = new Quick(a.clone());
		mtis.medianInsertionSort(0,n - 1);
		
		if(n <= 20)
		{
			for(int i = 0; i < n; i++)
			{
				System.out.print(mtis.a[i]);
				System.out.print(" ");
			}
			System.out.println(" ");
		}
		
		System.out.println("Number of key comparisions - " + mtis.c);
		System.out.println("% of key comparisions saved - " + ((qc - mtis.c) * 100)/qc);
		
		
	}
}


