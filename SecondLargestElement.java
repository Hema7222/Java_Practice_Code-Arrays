package Java.practice.array;

/*------------------LARGEST ELEMENT IN AN ARRAY----------------*/

//public class SecondLargestElement {
//
//	public static void main(String[] args) {
//		int arr[] = {10, 24, 55, 67, 85, 3, 65, 52, 97};
//		int max=0;
//		for(int i=0; i<arr.length;i++) {
//			if(arr[i]>max) {
//				max=arr[i];
//			}
//		}
//		System.out.println("Largest Element: "+max);
//	}
//
//}




/*-------------------SECOND LARGEST ELEMENT IN AN ARRAY----------------*/

public class SecondLargestElement {

	public static void main(String[] args) {
		int arr[] = {10, 24, 55, 67, 85, 3, 65, 52, 86, 97};
		int max=0;
		int secondmax = arr[0];
		for(int i=0; i<arr.length;i++) {
			if(arr[i]>max) {
				secondmax=max;
				max=arr[i];
			}
			if(arr[i]>secondmax && arr[i]!=max) {
				secondmax=arr[i];
			}
		}
		System.out.println("Second Largest Element: "+secondmax);
	}

}
