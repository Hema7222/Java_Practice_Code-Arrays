package Java.practice.array;


/*----------------------------------Insert an element in the array-----------------------------------*/

import java.util.Arrays;

public class InsertAnElement {

	public static void main(String[] args) {
		int array[] = {10,20,40,50};
		int insert = 30;
		int indexAt = 2;
		
		int newArray[] = new int[array.length +1];
		
		for(int i=0; i<indexAt; i++) {
			newArray[i] = array[i];
		}
		
		newArray[indexAt] = insert;
		
		for(int i=indexAt+1; i<newArray.length; i++) {
			newArray[i] = array[i-1];
		}
		
		System.out.println("New Array: "+Arrays.toString(newArray));

	}

}
