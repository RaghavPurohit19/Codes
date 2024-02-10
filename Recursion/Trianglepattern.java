package Recursion;

import java.util.Arrays;

public class Trianglepattern {
    public static void main(String[] args) {
        //triangle(4, 0);
        int[]  arr = {4,5,2,3,1};
        bubblesort(arr, arr.length-1, 0);
        System.out.println(Arrays.toString(arr));
    }
    static void triangle2(int r,int c){
        if(r == 0) return;
        if(c<r){
            System.out.print("*");
            triangle2(r, c+1);
        }else {
            System.out.println();
            triangle2(r-1, 0);
        }
    }
    static void triangle(int r,int c){
        if(r == 0) return;
        if(c<r){
            triangle(r, c+1);
            System.out.print("*");
        }else {
            triangle(r-1, 0);
            System.out.println();
        }
    }
    static void bubblesort(int[] arr,int r,int c){
        if(r == 0) return;
        if(c<r){
            if(arr[c] > arr[c+1]){
                int temp = arr[c];
                arr[c] = arr[c+1];
                arr[c+1] = temp;
            }
            bubblesort(arr, r, c+1);
        }else {
            bubblesort(arr, r-1, 0);
        }
    }

    static void selection(int[] arr,int r,int c,int max){
        if(r == 0) return;
        if(c<r){
            if(arr[c] > arr[max]){
                selection(arr, r, c+1, c);
            }else{
                int temp = arr[max];
                arr[max] = arr[r-1];
                arr[r-1] = temp;
                selection(arr, r-1, 0, 0);
            }
          
        }
    }
}
