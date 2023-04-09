package Arrays;


public class ArrayRotation {

    // left rotation of 1 element (anti-clockwise)
    static void rotateOne(int[] arr){
        int temp=arr[0];
        for (int i=1;i<arr.length;i++){
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=temp;
    }
    static void rotate(int[]arr,int k){
        //on rotation of no which is same as size of arr gives the same array
        k=k%arr.length;
        if (k<0){
            k=k+arr.length;
        }
        for (int i=0;i<k;i++){
            rotateOne(arr);
        }
    }


    //************ OPTIMIZED ***************

    /**
    1 2 3 4 5
    rotate by 3
    divide the arr int (0,2) and (3,len)
    rotate first part, rotate next part
    append both and rotate from (0,len) **/
    static void rotateOp(int[] arr, int start, int end){
        while (start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }



    public static void main(String[] args) {

        int[] arr={1,2,3,4,5};
        //rotate by 3
        int k=3;
        rotateOp(arr,0,k-1);
        rotateOp(arr,k,arr.length-1);
        rotateOp(arr,0,arr.length-1);

        for (int i : arr) {
            System.out.print(i+" ");
        }


    }
}
