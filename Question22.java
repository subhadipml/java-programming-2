import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// Replace each element of the array by its rank in the array
// Java program for the above approach 


public class Question22 { 
	static void changeArr(int[] input) {
		int newArray[] = Arrays.copyOfRange(input, 0, input.length); 
		Arrays.sort(newArray); 
		Map<Integer, Integer> ranks = new HashMap<>(); 

		int rank = 1; 

		for (int index = 0; index < newArray.length; index++) { 

			int element = newArray[index]; 
			if (ranks.get(element) == null) { 

				ranks.put(element, rank); 
				rank++; 
			} 
		} 
		for (int index = 0; index < input.length; index++) { 
			input[index] = ranks.get(input[index]); 
		
		} 
	} 

	public static void main(String[] args){ 
		int[] arr = { 100, 2, 70, 2 }; 
		
		System.out.println("Array elements are: ");
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		changeArr(arr); 
 
		System.out.println("Rank of Array elements are:");
		System.out.println(Arrays.toString(arr)); 
	} 
} 
