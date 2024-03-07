package hashing;

import java.util.*;

public class majorityelementII {
    public static List<Integer> majority(int[] nums){
        int n = nums.length;
        List<Integer> ans =  new ArrayList<>();
        HashMap<Integer, Integer> mpp = new HashMap<>();
        int min = (int)(n/3)+1;
        
        for(int i = 0 ; i < n  ; i ++){
            int value = mpp.getOrDefault(nums[i], 0);
            mpp.put(nums[i], value+1);
            if(mpp.get(nums[i]) == min){
                ans.add(nums[i]);
            }
            if(ans.size() == 2) break;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,2,2,3,3};
        List<Integer> ans = majority(nums);
        for(int i = 0 ; i < ans.size() ; i ++){
            System.out.print(ans.get(i)+ " ");
        }
        System.out.println();
    }
}
