
public class MergeSort {

	static int[] arr;
	static int[] temparr;
	void prepare(int[] arr){
		this.arr = arr;
		this.temparr = new int[arr.length];
		divide(0,arr.length);
		
	}
	static void merge(int low,int mid,int high){
		for(int i = low;i<=high;i++){
			temparr[i] = arr[i]; 
		}
		int i = low;
		int j = high;
		int k = low;
		while(i<=mid && j<=high){
			if(temparr[i]<=temparr[j]){
				arr[k] = temparr[i];
				i++;
			}
			else{
				arr[k] = temparr[j];
				j++;
			}
			k++;
		}
		while(i<=mid){
			arr[k] = temparr[i];
			k++;
			i++;
		}
	}
	static void divide(int low, int high){
		if(low<high){
			int mid = low+(high-low)/2;
			divide(low,mid);
			divide(mid+1,high);
			merge(low,mid,high);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,21,11,23,2,3,};
		for (int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		new MergeSort().prepare(arr);
		for (int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}

	}

}
