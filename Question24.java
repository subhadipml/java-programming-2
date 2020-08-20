//Find out the Kth smallest element in an unsorted array

import java.util.Arrays; 

public class Question24 { 
	public static int kthSmallest(Integer[] arr, int k) { 
		Arrays.sort(arr); 
		return arr[k - 1]; 
	} 

	public static void main(String[] args) { 
		Integer arr[] = new Integer[] { 12, 3, 5, 7, 19 }; 
		int k = 2; 
		System.out.print("2nd smallest element is " + kthSmallest(arr, k)); 
	} 
}