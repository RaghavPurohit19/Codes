package Recursion;

import java.util.ArrayList;

public class findelement {
    public static void main(String[] args) {
        int[] arr = {1,2,3,73,3};
       // System.out.println(find(arr, 73, 0));
        //findAllIndex(arr, 3, 0);
        //System.out.println(list);

        System.out.println(findAllIndexf(arr, 3, 0, new ArrayList<>()));
    }
    static boolean find(int[] arr , int target , int index){
        if( index == arr.length) return false;
        return arr[index] == target || find(arr, target, index+1);
    }
    static int findIndex(int[] arr , int target , int index){
        if( index == arr.length) return -1;
        if(arr[index] ==  target) return index;
        else return  findIndex(arr, target, index+1);
    }

    static ArrayList<Integer> list =   new ArrayList<>();
    static void findAllIndex(int[] arr , int target , int index){
        if( index == arr.length) return ;
        if(arr[index] ==  target){
            list.add(index);
        }
        findAllIndex(arr, target, index+1);
    }
    static ArrayList<Integer> findAllIndexf(int[] arr , int target , int index, ArrayList<Integer> list){
        if( index == arr.length) return list;
        if(arr[index] ==  target){
            list.add(index);
        }
        return findAllIndexf(arr, target, index+1,list);
    }
    static ArrayList<Integer> findAllIndexf2(int[] arr , int target , int index){
        ArrayList<Integer> list = new ArrayList<>();
        if( index == arr.length) return list;
        if(arr[index] ==  target){
            list.add(index);
        }
        ArrayList<Integer> ans = findAllIndexf2(arr, target, index+1);
        list.addAll(ans);
        return list;
    }

}
