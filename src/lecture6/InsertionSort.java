package lecture6;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr= {1,20,20,5,6,9,10};
		InsSort(arr);
		for(int val: arr)
		{
			System.out.println(val);
		}
	}
	public static void InsSort(int[] arr) {
		for(int cnt=1; cnt<=arr.length-1;cnt++) {
			int temp = arr[cnt];
			int j=cnt-1;
			while(j>=0 && temp<arr[j]) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=temp;
		}
	}

}
