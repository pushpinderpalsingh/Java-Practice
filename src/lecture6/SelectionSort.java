package lecture6;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr= {1,20,20,5,6,9,10};
		SelSort(arr);
		for(int val: arr)
		{
			System.out.println(val);
		}

	}
	public static void SelSort(int[] arr) {
	     for(int cnt=0;cnt<=arr.length-2;cnt++) {
	    	 int min=cnt;
	    	 for(int j=cnt+1;j<=arr.length-1;j++) {
	    		 if(arr[j]<arr[min])
	    			 min=j;
	    	 }
	    	 int temp=arr[cnt];
	    	 arr[cnt]=arr[min];
	    	 arr[min]=temp;
	     }
	}

}
