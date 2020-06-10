package bubbleSort;

public class BubbleSort {

	public static void main(String[] args) {
		int [] sampleArray = {91,99,71,48,93,94,88,59,41,19,65};
		
	}
	
	//method to sort an Array using Bubble Sort
	public static int[] bubbleSort(int [] arr) {
		int n = arr.length;
		for(int a = 0; a < n; a++) {
			for(int x = 0 ; x < (n-1); x++) {
				if(arr[x] > arr[x+1]) {
					int temp = arr[x];
					arr[x] = arr[x+1];
					arr[x+1] = temp;
				}
			}
		}
		return arr;
	}

}
