package college;

import java.util.Arrays;

public class sort01 {
    public static void main(String[] args) {
        int[] arr = {1,0,1,0,0,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr){
        int l = 0 , r = arr.length-1;
        while(l<r){
            for(int i = 0 ; i < arr.length ; i ++){
                if(arr[l] == 1){
                    if(arr[r] != 1){
                        int temp = arr[l];
                        arr[l] = arr[r];
                        arr[r] = temp;
                    }
                    r--;
                }else{
                    l++;
                }
            }
        }
        
    }
}
