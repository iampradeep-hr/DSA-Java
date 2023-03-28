package Arrays;


public class KadanesAlgorithm {

    //Goal - To find the sum of max sub array

    public static int maxSubArray(int[] arr){
        int currSum=0;
        int maxSum=0;
        for (int i=0; i<arr.length;i++){
            currSum+=arr[i];

            if (currSum>maxSum){
                maxSum=currSum;
            }

            if (currSum<0){
                currSum=0;
            }
        }
        return maxSum;
    }

    public static int maxSubArray2(int[] arr){
        int max_so_far = arr[0];
        int max_ending_here = arr[0];
        for (int i = 1; i < arr.length; i++) {
            max_ending_here = Math.max(arr[i], max_ending_here + arr[i]);
            max_so_far = Math.max(max_so_far, max_ending_here);
        }
        return max_so_far;
    }

    public static void main(String[] args) {

        int arr1[] ={5,-4,-2,6,-1};
        int arr2[]={-3, -7, -2, -8, -9};
        int ans=maxSubArray2(arr1);
        System.out.println("Ans: "+ans);

    }
}
