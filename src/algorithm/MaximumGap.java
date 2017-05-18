package algorithm;

import java.util.Arrays;

public class MaximumGap {

	public int maximumGap(int[] nums) {
		if(nums.length < 2) return 0;
		int max = 0;
		Arrays.sort(nums);
		for(int i = 0; i < nums.length -1; i++) {
			if(max < nums[i+1] - nums[i])
				max = nums[i+1] - nums[i];
		}
		return max;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
