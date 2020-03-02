package insertionSort;

import java.util.Arrays;

public class insertionSort {
	
	public static void main(String[] args) {
		int[] array = {3,7,5,13,10,2};
		
		//iterates through all numbers in once array 
		//exposing them to the nested loop 
		
		for (int i = 1; i < array.length; i++) {
			
			int key = array[i];
			
			//looks at item to the left of the 
			//position that is being sorted
			int j = i - 1;
			
			while(j >= 0 && key < array[j]) {

				//to conserve value of 13 array[j] is set to a variable
				int temp = array[j];
				//move this item one to the right
				array[j] = array[j + 1];
				//the value also moves up with the item
				array[j + 1] = temp;
				//moves on to the next index
				j--;
			}
		
		}
		
		System.out.println(Arrays.toString(array));
		
	}

}
