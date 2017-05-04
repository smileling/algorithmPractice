package javaCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class TestHashSet {
	public List<Integer> largestDivisibleSubset(int[] nums) {
        List<Integer> res = new ArrayList<Integer>();
        
        if(nums.length ==0) {
            return res;
        }
        
        Arrays.sort(nums);
        
        int len = nums.length;
        int[] dp = new int[len];
        int[] pos = new int[len];
        int sublen = 0;
        int startPos = 0;
        for (int i = 0; i < len; i++) {
            dp[i] = 0;
        }
        
        for ( int i = len - 1; i >= 0; i--) {
            for( int j = i; j < len; j++) {
                if(nums[j] % nums[i] == 0 && dp[i] < dp[j] + 1) {
                    dp[i] = dp[j] + 1;
                    pos[i] = j;
                    if (sublen < dp[i]) {
                        sublen = dp[i];
                        startPos = i;
                    }
                    
                }
            }
            
        }
        
        for ( int i = 0; i < sublen; i++) {
            res.add(nums[startPos]);
            startPos = pos[startPos];
        }
        
        return res;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set books = new HashSet();
		books.add("java");
		System.out.println(books);
		
		boolean result = books.add(new String("java"));
		System.out.println(result);
		System.out.println(books);
		
//		System.out.println(books.hashCode());
		
		books.add("C++");
		books.add("Python");
		
		Iterator it = books.iterator();
		while(it.hasNext()) {
			String str = (String)it.next();
			System.out.println(str.hashCode());
		}
		
	}

}
