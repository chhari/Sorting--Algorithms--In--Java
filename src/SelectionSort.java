
public class SelectionSort {

	static void SelectionSorting(int[] arr) {
		for(int i=0;i<arr.length-1;i++){
			int index= i;
			for(int j=i+1;j<arr.length-1;j++){
				
				if(arr[j]<arr[index]){
					index=j;
					
				}
			}
			if(index!=i){
				int temp = arr[index];
				arr[index] = arr[i];
				arr[i] = temp;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,21,11,23,2,3,};
		for (int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		SelectionSorting(arr);
		for (int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		
	}

}
