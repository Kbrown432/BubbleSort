class BubbleSort {
	public static void main(String[] args) {
		int[] arr = {-10, 4, 200, 34, 6};
		//prints original array
		for (int x: arr) {
			System.out.print(x+" ");
		}
		System.out.println();

		int temp;
		for (int i=0; i<arr.length; i++) {
			for (int j=0; j<arr.length-1; j++) {
				if (arr[j] > arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		//print sorted array
		for (int x: arr) {
			System.out.print(x+" ");
		}
		System.out.println();
	}
}