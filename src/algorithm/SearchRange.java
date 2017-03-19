package algorithm;

public class SearchRange {
	
	/*
	 * 
	 * Given an array of integers sorted in ascending order, find the starting and ending position of a given target value.
	 * Your algorithm's runtime complexity must be in the order of O(log n).
	 * If the target is not found in the array, return [-1, -1].
	 * 
	 * For example,
	 * Given [5, 7, 7, 8, 8, 10] and target value 8,
	 * return [3, 4].
	 */
	public int[] searchRange(int[] nums, int target) {
        
        int[] pos = new int[2];
        pos[0] = -1;
        pos[1] = -1;
        
        if (nums.length == 0||target < nums[0] || target >nums[nums.length - 1]) return pos;
       
        int l = 0;
        int r = nums.length -1;
        while(target > nums[l]&&l<=r)l++;
        if (target == nums[l]) pos[0] = l;
        while(target < nums[r]&&l<=r)r--;
        if(target == nums[r]) pos[1] = r;
        return pos;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
