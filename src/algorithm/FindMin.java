package algorithm;

public class FindMin {
	
	public int findMin(int[] nums) {
		if(nums[0] < nums[nums.length -1]) 
			return nums[0];
		int res = nums[0];
		for (int i = 0; i < nums.length - 1; i++) {
			if(nums[i] > nums[i+1]){
				res = nums[i+1];
				break;
			}
		}
		return res;
		
	}
	
	public int findMin2(int[] nums) {
		if(nums[0] < nums[nums.length -1]) 
			return nums[0];
		int res = nums[0];
		for (int i = 0; i < nums.length - 1; i++) {
			if(nums[i] > nums[i+1]){
				res = nums[i+1];
				break;
			}
		}
		return res;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
