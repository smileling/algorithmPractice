package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * 【Combination Sum I】

Given a set of candidate numbers (C) and a target number (T), find all unique combinations in C where the candidate numbers sums to T.

The same repeated number may be chosen from C unlimited number of times.

Note:
All numbers (including target) will be positive integers.
Elements in a combination (a1, a2, … , ak) must be in non-descending order. (ie, a1 ≤ a2 ≤ … ≤ ak).
The solution set must not contain duplicate combinations.
For example, given candidate set 2,3,6,7 and target 7, 
A solution set is: 
[7] 
[2, 2, 3] 

【Combination Sum II 】
Given a collection of candidate numbers (C) and a target number (T), find all unique combinations in C where the candidate numbers sums to T.

Each number in C may only be used once in the combination.

Note:
All numbers (including target) will be positive integers.
Elements in a combination (a1, a2, … , ak) must be in non-descending order. (ie, a1 ≤ a2 ≤ … ≤ ak).
The solution set must not contain duplicate combinations.
For example, given candidate set 10,1,2,7,6,1,5 and target 8, 
A solution set is: 
[1, 7] 
[1, 2, 5] 
[2, 6] 
[1, 1, 6] 
 */
public class CombinationSum {

	//sum 1
	List<List<Integer>> ans = new ArrayList<List<Integer>>();
	int[] cans = {};
	
	public List<List<Integer>> combinationSum(int[] candidates, int target) {
		this.cans = candidates;
		Arrays.sort(cans);
		backTracking(new ArrayList(), 0, target);
		
		return ans;
    }
	
	public void backTracking(List<Integer> cur, int from, int target){
		if(target == 0) {
			List<Integer> list = new ArrayList<Integer>(cur);
			ans.add(list);
		} else {
			for (int i = from; i < cans.length && cans[i] <= target; i++){
				cur.add(cans[i]);
				backTracking(cur,i,target - cans[i]);
				cur.remove(new Integer(cans[i]));
			}
		}
	}
	
	//sum 2
	List<List<Integer>> ans2 = new ArrayList<List<Integer>>();  
    int[] num = {};  
      
    public List<List<Integer>> combinationSum2(int[] num, int target) {  
        this.num = num;  
        Arrays.sort(num);  
        backTracking2(new ArrayList<Integer>(), 0, target);  
        return ans2;  
    }  
      
    public void backTracking2(List<Integer> cur, int from, int tar) {  
        if (tar == 0) {  
            //查看该解是否已经在结果集中，如对于输入[1,1]和1，只需放一个[1]到结果集中  
            boolean exist = false;  
            for (int i = ans2.size() - 1; i >= 0 ; i--) {  
                List<Integer> tmp = ans2.get(i);  
                if (tmp.size() != cur.size()) {  
                    continue;  
                }  
                int j = 0;  
                while (j < cur.size() && tmp.get(j) == cur.get(j)) {  
                    j++;  
                }  
                if (j == cur.size()) {  
                    exist = true;  
                    break;  
                }  
            }  
              
            //如果当前解不在结果集中，把其加入到结果集中  
            if (!exist) {  
                List<Integer> list = new ArrayList<Integer>(cur);  
                ans2.add(list);  
            }  
            return;  
        }  
        for (int i = from; i < num.length && num[i] <= tar; i++) {  
            cur.add(num[i]);  
            backTracking2(cur, i + 1, tar - num[i]);  
            cur.remove(new Integer(num[i]));  
        }  
    }  

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
