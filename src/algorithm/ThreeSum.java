package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
	List<List<Integer>> ret = new ArrayList<List<Integer>>();

	public List<List<Integer>> threeSum(int[] num) {

		if (num == null || num.length < 3)
			return ret;

		Arrays.sort(num);

		int len = num.length;
		for (int i = 0; i < len - 2; i++) {
			if (i > 0 && num[i] == num[i - 1])
				continue;
			find(num, i + 1, len - 1, num[i]);

		}

		return ret;
	}

	public void find(int[] num, int start, int end, int target) {
		int l = start;
		int r = end;

		while (l < r) {
			if (num[l] + num[r] + target == 0) {
				List<Integer> ans = new ArrayList<Integer>();
				ans.add(target);
				ans.add(num[l]);
				ans.add(num[r]);
				ret.add(ans);
				while (l < r && num[l] == num[l + 1])
					l++;
				while (l < r && num[r] == num[r - 1])
					r--;
				l++;
				r--;
			} else if (num[l] + num[r] + target < 0) {
				l++;
			} else {
				r--;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[6];
		nums[0] = 3;
		nums[1] = 0;
		nums[2] = -2;
		nums[3] = -1;
		nums[4] = 1;
		nums[5] = 2;
		
//		int[] nums = new int[4];
//		nums[0] = 0;
//		nums[1] = 0;
//		nums[2] = 0;
//		nums[3] = 0;

		ThreeSum ts = new ThreeSum();
		System.out.println(ts.threeSum(nums));
	}

}
