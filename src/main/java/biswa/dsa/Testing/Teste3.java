package biswa.dsa.Testing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import biswa.dsa.Utill.IterationHelper;

public class Teste3 {
	
	public static void main(String[] args) {
		int target = 9;
		int[] nums = {2,3,3,4,6,7};
		int count = 0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i]+nums[i] <= target) {
                    count++;
                    System.out.println("["+nums[i]+"]");
            }
            for(int j=i; j<nums.length; j++) {
            	System.out.print("["+nums[i]);
                for(int k=j+1; k<nums.length; k++) {
                    if(nums[i]+nums[k] <= target) {
                    count++;
                    System.out.println(nums[k]+"]");
                    System.out.print("["+nums[i]);
                    } else {
                    	System.out.print(nums[k]+", ");
                    }
                }
            }
        }
//		IterationHelper.iterateIntegerArray(nums, "S");
	}

}
