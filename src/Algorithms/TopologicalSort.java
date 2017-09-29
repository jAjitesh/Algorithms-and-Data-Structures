package Algorithms;

import java.util.ArrayList;
import java.util.Scanner;

public class TopologicalSort {

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
		int[] degree = new int[v];
		int from = 0, to = 0;
		
		for(int i=0; i< e; i++){
			from = s.nextInt();
			to = s.nextInt();
			
			arr[from-1][to-1] = 1;
		}
		
        for (int i = 0; i < v; i++) 
        {
            int indegree = 0;
            for (int j = 0; j < v; j++) {
            	indegree = indegree + arr[j][i];
            }
           degree[i] =      
        }
	}}
        



