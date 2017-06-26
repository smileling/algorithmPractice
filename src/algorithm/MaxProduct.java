package algorithm;

public class MaxProduct {

	public int maxProduct(int[] nums){
		int len = nums.length;
		if (len == 0) return 0;
		if (len == 1) return nums[0];
		
		int[][] dp = new int[len][len];
		int max = dp[0][0];
		
		for (int i = 0; i < len; i++){
			dp[i][i] = nums[i];
			if(max < dp[i][i]) {
				max = dp[i][i];
				System.out.println(max);
			}
			
		}
		for(int k = 0; k < len; k++){
			int i = 0;
			int j = k+1;
			while(i < len-1-k && j < len) {
				dp[i][j] = dp[i][j-1] * dp[i+1+k][j];
//				for(int t=i; t <=j ; t++){
//					dp[i][j] *= nums[t];
//				}
				if(max< dp[i][j]){
					max = dp[i][j];
				}
				i++;
				j++;
			}
		}
		
		for(int i = 0;i < len; i++){
			for(int j = i; j < len; j++)
				System.out.print(dp[i][j]+",");
			System.out.println();
		}
		return max;
	}
	
	//error
//	public int maxProduct2(int[] nums){
//		if(nums == null || nums.length == 0){
//			return 0;
//		}
//		if (nums.length == 1) return nums[0];
//		int max_local = nums[0];
//		int min_local = nums[0];
//		int global = nums[0];
//		for (int i = 0; i < nums.length; i++) {
//			int max_copy = max_local;
//			max_local = Math.max(Math.max(nums[i]*max_local, nums[i]), nums[i]*min_local);
//			min_local = Math.min(Math.min(nums[i]*max_copy, nums[i]), nums[i]*min_local);
//			global = Math.max(global, max_local);
//		}
//		return global;
//	}
	
	int maxProduct3 (int nums[]) {
		if(nums == null || nums.length == 0){
			return 0;
		}
		if (nums.length == 1) return nums[0];
		int n = nums.length;
        int maxIdx = 1, minIdx = 1;
        int out = nums[0];
        for (int i = 0; i < n; ++i) {
            int oldMaxIdx = Math.max (maxIdx, 1);
            if (nums[i] > 0) {
                maxIdx = oldMaxIdx * nums[i];
                minIdx *= nums[i];
            } else {
                maxIdx = minIdx * nums[i];
                minIdx = oldMaxIdx * nums[i];
            }
            out = Math.max (out, maxIdx);
        }
        return out;
    }
	
	public int findPeakElement(int[] nums){
		int n = nums.length;
        if(n == 1)
            return 0;
        if(nums[0] > nums[1])
            return 0;
        if(nums[n-1] > nums[n-2])
            return n-1;
        for(int i = 1; i < n-1; i ++)
            if(nums[i] > nums[i-1] && nums[i] > nums[i+1])
                return i;
		return n;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MaxProduct mp = new MaxProduct();
		int[] nums = {2,3,-2,4};
		int a = mp.maxProduct3(nums);
		System.out.println(a);
	}

}
