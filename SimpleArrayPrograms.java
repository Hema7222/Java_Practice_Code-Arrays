package Java.practice.array;


/*---------------Sum of all elements in an array of integers----------------*/

//public class SimpleArrayPrograms {
//
//	public static void main(String[] args) {
//		int sum=0;
//		int arr[] = {10, 20, 30,40,50};
//		for(int i=0;i<arr.length; i++) {
//			sum=sum+arr[i];
//		}
//		System.out.println("Sum: "+sum);
//
//	}
//
//}


/*--------------------Reverse an array--------------------*/

//import java.util.Scanner;
//
//public class SimpleArrayPrograms {
//
//	public static void main(String[] args) {
////		int arr[] = {10, 20, 30,40,50};
//		Scanner s = new Scanner(System.in);
//		System.out.println("Enter the number of elements in an array: ");
//		int n = s.nextInt();
//		
//		int arr[] = new int[n];
//		System.out.println("Enter the elements: ");
//		for(int i=0;i<n;i++) {
//			arr[i]=s.nextInt();
//		}
//		
//		System.out.print("[");
//		for(int i=arr.length-1;i>=0; i--) {
//			System.out.print(arr[i]);
//			if(i!=0) {
//				System.out.print(", ");
//			}
//		}
//		System.out.print("]");
//
//		s.close();
//	}
//
//}



/*--------------------Average of all elements in an array--------------------*/

public class SimpleArrayPrograms {

	public static void main(String[] args) {
		int sum=0;
		int arr[] = {95, 92, 97, 86, 98};
		for(int i=0;i<arr.length; i++) {
			sum=sum+arr[i];
		}
		float Avg = (float)sum/arr.length;
		System.out.println("Sum: "+sum);
		System.out.println("Avg: "+Avg);

	}

}
