package Arrays._2dArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matrices {

    public static void main(String[] args) {
        int[][] matrix=new int[3][3];
        Scanner sc=new Scanner(System.in);
        int n=3,m=3; //row,column
        //input
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }
        }


        //output
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                max=Math.max(max,matrix[i][j]);
                min=Math.min(min,matrix[i][j]);
            }

        }
        System.out.println("Max: "+max+"\n"+"Min: "+min);


    }
}
