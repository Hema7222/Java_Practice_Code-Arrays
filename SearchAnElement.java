package Java.practice.array;

/*------------------To search for an specific element in an integer----------------*/
public class SearchAnElement {

	public static void main(String[] args) {
		int arr[] = {10, 30, 40, 60, 80, 95};
		int search = 470;
		boolean found = false;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]== search) {
				found=true;
				break;
			}
		}
		if(found) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}

	}

}
