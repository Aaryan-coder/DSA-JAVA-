package timeComplexity;

public class Array_Equilibirium_Index {
    static int i = 1;
    static int j = 0;
    static int ans = -1;
	public static int arrayEquilibriumIndex(int[] arr){  
		int sum = 0;
        int count = 0;
        while(i<arr.length){
            sum = 0;
            count = 0;
        for(int k = 0;k<i;k++){
            sum+=arr[k];
        }
            if(i==arr.length-1){
                count+=0;   
            }
            if(i<arr.length-1){
        for(int k = i+1;k<arr.length;k++){
            count+=arr[k];
        }
            }
            if(sum==count){
            ans = i;
                break;
        }
        i++;
        }
        return ans;
	}
	public static void main(String[] args) {
		int arr[] = {1,2,3,2,1};
		System.out.println(arrayEquilibriumIndex(arr));
	}
}
