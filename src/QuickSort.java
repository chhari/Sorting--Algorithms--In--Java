
public class QuickSort {

	static void  QuickSort(int[] arr, int low, int high) {
		if(low>high){
			return;
		}
		int mid = low+(high-low)/2;
		int pivot = arr[mid];
		int i = low;
		int j = high;
		while(i<=j){
			while(arr[i]<pivot){
				i++;
			}
			while(arr[j]>pivot){
				j--;
			}
			if(i<=j){
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
				
			}
		}
		if(low<j){
			QuickSort(arr,low,j);
		}
		if(high>i){
			QuickSort(arr,i,high);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,21,11,23,2,3,};
		for (int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		QuickSort(arr,0,arr.length-1);
		for (int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		
	}
}
