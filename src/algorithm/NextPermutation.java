package algorithm;

public class NextPermutation {
	
	public void nextPermutation(int[] nums) {
		
		for(int i = nums.length - 2; i >=0; i--) {
			for (int j = nums.length - 1; j >= i + 1 ; j--) {
				if (nums[i]<nums[j]){
					System.out.println(i+","+j);
					int tmp = nums[i];
					nums[i] = nums[j];
					nums[j] = tmp;
					int t = 0;
					for ( int k = i+1; k <= (nums.length +i) /2; k++) {
						tmp = nums[k];
						nums[k] = nums[nums.length - 1 - t];
						nums[nums.length - 1 - t] = tmp;
						t++;
					}
					return;
				}
			}
		}
		for (int i = 0; i <= nums.length/2 - 1; i ++) {
			int tmp = nums[i];
			nums[i] = nums[nums.length - i- 1];
			nums[nums.length - i - 1] = tmp;
		}
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num = new int[3];
		num[0]=3;
		num[1] =2;
		num[2] = 1;
		
		NextPermutation np = new NextPermutation();
		np.nextPermutation(num);
		for(int i = 0; i < num.length; i++){
		System.out.println(num[i]);
		}
	}

}
