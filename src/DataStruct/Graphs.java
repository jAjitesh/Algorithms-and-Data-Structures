package DataStruct;

import java.util.ArrayList;
import java.util.Scanner;

public class Graphs {

	public ArrayList<Integer> adjacent(int v,int e,int[][] arr){
		ArrayList<Integer> adj = new ArrayList<Integer>();
		for(int i = 0; i < v; i++ ){
			if(arr[e][i] != 0){
				adj.add(arr[e][i]);
			}
		}
		return adj;
	}
	
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int v = s.nextInt();
		int e = s.nextInt();
		int[][] arr = new int[v][v];
		int from = 0, to = 0;
		int weight;
		for(int i=0; i< e; i++){
			from = s.nextInt();
			to = s.nextInt();
			weight = s.nextInt();
			arr[from-1][to-1] = weight;
		}
		
        for (int i = 0; i < v; i++) 
        {
            
            for (int j = 0; j < v; j++) 
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
        
        

    }
	}

