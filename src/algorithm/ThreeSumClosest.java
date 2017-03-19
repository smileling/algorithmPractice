package algorithm;

import java.util.Arrays;

public class ThreeSumClosest {

	public int threeSumClosest(int[] num, int target) {

		if (num == null || num.length < 3){
			int sum = 0;
			for (int i = 0; i < num.length; i++)
				sum += num[i];
			return sum;
		} // return 0
			
		Arrays.sort(num);

		int len = num.length;
		int ret = 0;
		int closestDist = Integer.MAX_VALUE;
		for (int i = 0; i < len - 2; i++) {
			if (i > 0 && num[i] == num[i - 1])
				continue;
			int l = i+1;
			int r = len -1;
			while (l < r) {
				int sum = num[l] + num[r] + num[i];
				if (sum < target) {
					if (target - sum < closestDist) {
						closestDist = target - sum;
						ret = sum;
					}
					l++;
				} else if (sum > target){
					if (sum - target < closestDist) {
						closestDist = sum - target;
						ret = sum;
					}
					r--;
				} else {
					return sum;
				}
					
			}
		}

		return ret;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] nums = new int[6];
//		nums[0] = 3;
//		nums[1] = 0;
//		nums[2] = -2;
//		nums[3] = -1;
//		nums[4] = 1;
//		nums[5] = 2;
		
		int[] nums = new int[4];
		nums[0] = -1;
		nums[1] = 2;
		nums[2] = 1;
		nums[3] = -4;

		ThreeSumClosest ts = new ThreeSumClosest();
		System.out.println(ts.threeSumClosest(nums, 1));
	}

}
