package college;
import java.util.ArrayList;

public class printsub {
    public static void main(String[] args) {
        int[] arr = {1,3,5,10,23}; 
        print(arr);
    }
    public static void print(int[] nums){
        for(int i = 0 ; i < nums.length ; i++){
        ArrayList<Integer> ar = new ArrayList<>();
        for(int j=i;j<nums.length;j++){
            ar.add(nums[j]);
            System.out.println(ar+" ");
        }
    }
    }
}
