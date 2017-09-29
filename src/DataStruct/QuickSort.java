package DataStruct;
import java.util.Random;
import java.util.Scanner;

public class QuickSort {
	
	public int count = 0;
	public int[] A;
	
	public void swap(int p, int r) {
		int temp = A[p];
		A[p] = A[r];
		A[r] = temp;
	}
	
	public int partition(int lower,int higher){

		int pivot = A[higher];
		int i = lower-1;
		
		for(int j = lower; j <= higher-1; j++){
			
			count++;
			
			if(A[j] <= pivot){
				i=i+1;
				swap(j, i);
			}

		}
		swap(i + 1, higher);

		return i + 1;   


	}
	
	public int randomize(int lower, int higher){ 

		Random rand = new Random();
		int random = lower + rand.nextInt(higher - lower);
		swap(random, higher);
		
		return partition(lower, higher);
	}
	
	public int medianOfThree(int lower, int higher) {
		int center = (lower + higher) / 2;

		if (A[lower] > A[center]){
			swap(lower, center);
		}

		if (A[lower] > A[higher]){
			swap(lower, higher);
		}

		if (A[center] > A[higher]){
			swap(center, higher);
		}
		
		count += 3;

		swap(center, higher);
		return partition(lower, higher);

	}
	
	public void InsertionSort(int lower, int higher){
		
		for(int i = lower + 1; i <= higher; i++){
			int value = A[i];
			int hole = i;
			
			while(hole > lower && A[hole-1] > value){
				count++;
				A[hole] = A[hole-1];
				hole = hole-1;
			}
			
			count++;
			A[hole] = value;
		}
	}

	public void BasicSort(int lower, int higher){
		if(lower < higher){
			int pivot = partition(lower, higher);
			BasicSort(lower, pivot - 1);
			BasicSort(pivot + 1, higher);
		}
	}
	
	public void RandomizedSort(int lower, int higher){
		if(lower < higher){
			int pivot = randomize(lower, higher);
			RandomizedSort(lower, pivot - 1);
			RandomizedSort(pivot + 1, higher);
		}
	}
	
	public void MedianOfThreeSort(int lower, int higher){
		if(lower < higher){
			int pivot = medianOfThree(lower, higher);
			MedianOfThreeSort(lower, pivot - 1);
			MedianOfThreeSort(pivot + 1, higher);
		}
	}
	
	public void BasicSortWithInsertionSort(int lower, int higher){
		if(lower < higher){
			int pivot = partition(lower, higher);
			
			if(pivot - lower >= 10){
				BasicSortWithInsertionSort(lower, pivot - 1);
			} else{
				InsertionSort(lower, pivot - 1);
			}

			if(higher - pivot >= 10){
				BasicSortWithInsertionSort(pivot + 1, higher);
			} else{
				InsertionSort(pivot + 1, higher);
			}
		}
	}
	
	public void RandomizedSortWithInsertionSort(int lower, int higher){
		if(lower < higher){
			int pivot = randomize(lower, higher);
			
			if(pivot - lower >= 10){
				RandomizedSortWithInsertionSort(lower, pivot - 1);
			} else{
				InsertionSort(lower, pivot - 1);
			}

			if(higher - pivot >= 10){
				RandomizedSortWithInsertionSort(pivot + 1, higher);
			} else{
				InsertionSort(pivot + 1, higher);
			}
		}
	}

	public void MedianOfThreeSortWithInsertionSort(int lower, int higher){

		if(lower < higher){
			int pivot = medianOfThree(lower, higher);
			if(pivot - lower >= 10){
				MedianOfThreeSortWithInsertionSort(lower, pivot - 1);
			} else{
				InsertionSort(lower, pivot - 1);
			}

			if(higher - pivot >= 10){
				MedianOfThreeSortWithInsertionSort(pivot + 1, higher);
			} else{
				InsertionSort(pivot + 1, higher);
			}
		}
	}
	
	public QuickSort(int[] array){
		this.A = array;
		this.count = 0;
	}
	
	public static void main(String[] args){

		Scanner s=new Scanner(System.in);
		System.out.print("Enter Size of array: ");
		int input_size=s.nextInt();
		
		int[] A=new int[input_size];
		
		Random rand = new Random();
		
		for(int k=0;k<input_size;k++){
			A[k]= rand.nextInt(input_size) + 1;
		}
		
		s.close();
		
		if(input_size <= 20){
			System.out.println("Actual Array");
			for(int m = 0; m < input_size; m++){
				System.out.print(A[m]);
				System.out.print(" ");
			}
			System.out.println(" ");
		}
		
		
		System.out.println(" ");
		System.out.println("Array Sorted with Basic QuickSort");
		
		QuickSort BasicQuickSort = new QuickSort(A.clone());
		BasicQuickSort.BasicSort(0, input_size - 1);
		
		if(input_size <= 20){
			for(int m = 0; m < input_size; m++){
				System.out.print(BasicQuickSort.A[m]);
				System.out.print(" ");
			}
			System.out.println(" ");
		}
		
		System.out.println("Total Comparisions: " + BasicQuickSort.count);
		
		double quickSortCount = BasicQuickSort.count;
		
		System.out.println(" ");
		System.out.println("Array Sorted with Randomized QuickSort");
		QuickSort RandomizedQuickSort = new QuickSort(A.clone());
		RandomizedQuickSort.RandomizedSort(0, input_size - 1);
		
		if(input_size <= 20){
			for(int m = 0; m < input_size; m++){
				System.out.print(RandomizedQuickSort.A[m]);
				System.out.print(" ");
			}
			System.out.println(" ");
		}
		
		System.out.println("Total Comparisions: " + RandomizedQuickSort.count);
		System.out.println("Percentage Saved: " + ((quickSortCount - RandomizedQuickSort.count) * 100)/quickSortCount);
		
		
		System.out.println(" ");
		System.out.println("Array Sorted with Median of 3 QuickSort");
		QuickSort MedianOf3Sort = new QuickSort(A.clone());
		MedianOf3Sort.MedianOfThreeSort(0, input_size - 1);
		
		if(input_size <= 20){
			for(int m = 0; m < input_size; m++){
				System.out.print(MedianOf3Sort.A[m]);
				System.out.print(" ");
			}
			System.out.println(" ");
		}
		
		System.out.println("Total Comparisions: " + MedianOf3Sort.count);
		System.out.println("Percentage Saved: " + ((quickSortCount - MedianOf3Sort.count) * 100)/quickSortCount);

		System.out.println(" ");
		System.out.println("Array Sorted with Basic QuickSort with Insertion Sort");
		QuickSort BasicSortWithInsertionSort = new QuickSort(A.clone());
		BasicSortWithInsertionSort.BasicSortWithInsertionSort(0, input_size - 1);
		
		if(input_size <= 20){
			for(int m = 0; m < input_size; m++){
				System.out.print(BasicSortWithInsertionSort.A[m]);
				System.out.print(" ");
			}
			System.out.println(" ");
		}
		
		System.out.println("Total Comparisions: " + BasicSortWithInsertionSort.count);
		System.out.println("Percentage Saved: " + ((quickSortCount - BasicSortWithInsertionSort.count) * 100)/quickSortCount);
	
		
		System.out.println(" ");
		System.out.println("Array Sorted with Randomized QuickSort with Insertion Sort");
		QuickSort RandomizedWithInsertionSort = new QuickSort(A.clone());
		RandomizedWithInsertionSort.RandomizedSortWithInsertionSort(0, input_size - 1);
		
		if(input_size <= 20){
			for(int m = 0; m < input_size; m++){
				System.out.print(RandomizedWithInsertionSort.A[m]);
				System.out.print(" ");
			}
			System.out.println(" ");
		}
		
		System.out.println("Total Comparisions: " + RandomizedWithInsertionSort.count);
		System.out.println("Percentage Saved: " + ((quickSortCount - RandomizedWithInsertionSort.count) * 100)/quickSortCount);
	
		
		System.out.println(" ");
		System.out.println("Array Sorted with Median of 3 QuickSort with Insertion Sort");
		QuickSort MedianOf3WithInsertionSort = new QuickSort(A.clone());
		MedianOf3WithInsertionSort.MedianOfThreeSortWithInsertionSort(0, input_size - 1);
		
		if(input_size <= 20){
			for(int m = 0; m < input_size; m++){
				System.out.print(MedianOf3WithInsertionSort.A[m]);
				System.out.print(" ");
			}
			System.out.println(" ");
		}
		
		System.out.println("Total Comparisions: " + MedianOf3WithInsertionSort.count);
		System.out.println("Percentage Saved: " + ((quickSortCount - MedianOf3WithInsertionSort.count) * 100)/quickSortCount);
		
		
	}
}

