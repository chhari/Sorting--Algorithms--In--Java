
public class BubbleSort {

	static void BubbleSort1(int[] arr) {
		int n = arr.length;
		int temp=0;
		for(int i=0;i<n;i++){
			for(int j=1;j<n-i;j++){
				if(arr[j-1] > arr[j]){
					temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,21,11,23,2,3,};
		for (int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		BubbleSort1(arr);
		for (int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		
	}
}
