package college;

import java.util.ArrayList;

public class maxsubarr {
    public static void main(String[] args) {
        int[] arr = {5,2,3,6,4,1,5};
        int k = 3;

        int subsum = slide(arr, k);
        System.out.println(subsum);
    }
    public static int ans(int[] arr, int k){
        int max = Integer.MIN_VALUE;
        int n  = arr.length;
        for(int i = 0 ; i<n-k-1 ; i++){
            int sum = 0 ;
            for(int j = i ; j <k+i ; j ++){
                sum+=arr[j];
            }
            max =Math.max(max, sum);
        }
        return max;
    }
    //sliding window approach
    public static int slide(int[] arr , int k){
        int n = arr.length;
        int max = 0;
        int sum = 0 ;
        for(int i=0;i<k;i++){
            sum+= arr[i];
            max = sum;
        }
        for(int  i = k; i<n;i++ ){
            sum = sum + arr[i];
            sum = sum - arr[i-k];
            max = Math.max(max, sum);
        }
       
        return max;
    }
    public static int slide2(int[] arr , int k){
        int n = arr.length;
        int i = 0  , j = 0 , sum = 0 , max = 0;
        while(j<n){
            sum = sum + arr[j];
            if(j-i+1<k) j++;
            else if(j-i+1 == k){
                max = Math.max(sum,max);
                sum = sum - arr[i];
                i++;j++;
            }
        }
        return max;
    }
}
//2461 leetcode 
// subarr mei min and max ka sum print