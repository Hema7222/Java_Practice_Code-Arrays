package Java.practice.array;


///*---------------------Descending Order using Bubble Sort--------------------*/
//
//public class SortAnElement {
//
//	public static void main(String[] args) {
//		int array[] = {15, 3, 9, 45, 76, 32};
//		
//		for(int i=0; i<array.length-1; i++) {
//			for(int j=0; j<array.length-1-i; j++) {
//				if(array[j]<array[j+1]) {
//					int temp = array[j];
//					array[j] = array[j+1];
//					array[j+1] = temp;
//				}
//			}
//		}
//		System.out.println("Array in descending order: ");
//		for(int i:array) {
//			System.out.print(i+" ");
//		}
//
//	}
//
//}




/*-------------------Ascending Order using Bubble Sort---------------------*/

//public class SortAnElement {
//
//	public static void main(String[] args) {
//		int array[] = {15, 3, 9, 45, 76, 32};
//		
//		for(int i=0; i<array.length-1; i++) {
//			for(int j=0; j<array.length-1-i; j++) {
//				if(array[j]>array[j+1]) {
//					int temp = array[j];
//					array[j] = array[j+1];
//					array[j+1] = temp;
//				}
//			}
//		}
//		System.out.println("Array in Ascending order: ");
//		for(int i:array) {
//			System.out.print(i+" ");
//		}
//
//	}
//
//}



///*--------------Descending Order---------------*/
//
//import java.util.Arrays;
//import java.util.Collections;
//
//public class SortAnElement {
//
//	public static void main(String[] args) {
//		Integer array[] = {15, 3, 9, 45, 76, 32};
//		
//		Arrays.sort(array);
//		Arrays.sort(array, Collections.reverseOrder());
//		
//		System.out.println("Arrays in Ascending Order: "+Arrays.toString(array));
//
//	}
//
//}




/*--------------Ascending Order---------------*/

import java.util.Arrays;

public class SortAnElement {

	public static void main(String[] args) {
		int array[] = {15, 3, 9, 45, 76, 32};
		
		Arrays.sort(array);
		
		System.out.println("Arrays in Ascending Order: "+Arrays.toString(array));

	}

}
