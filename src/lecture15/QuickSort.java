package lecture15;

public class QuickSort {

	public static void main(String[] args) {
		int[] arr= {10,20,30,40,10};
		sort(arr,0,arr.length-1);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	public static void sort(int[] arr, int lo, int hi) {
		if(lo>=hi) {
			return;
		}
		int mid=(lo+hi)/2;
		int pivot=arr[mid];
		int left=lo;
		int right=hi;
		while(left<=right) {
		   while(arr[left]<pivot) {
			   left++;
		   }
		   while(arr[right]>pivot) {
			   right--;
		   }
		   if(left<=right) {
			   int temp=arr[left];
			   arr[left]=arr[right];
			   arr[right]=temp;
			   left++;
			   right--;
		   }
		}
		sort(arr,lo,right);
		sort(arr,left,hi);
	}

}
