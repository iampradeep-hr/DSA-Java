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

    public static void main(String[] args) {

        int arr[] ={5,-4,-2,6,-1};
        int ans=maxSubArray(arr);
        System.out.println("Ans: "+ans);

    }
}
