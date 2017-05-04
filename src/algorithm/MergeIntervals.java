package algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {
	public class Interval {
		int start;
		int end;
		Interval() { 
			start = 0; 
			end = 0; 
			}
		Interval(int s, int e) { 
			start = s; 
			end = e; 
			}
	}
	
	public class MyComparator implements Comparator<Interval> {  
		@Override  
        public int compare(Interval a, Interval b) {  
            return a.start - b.start;  
        }  
    }  
      
    public List<Interval> merge(List<Interval> intervals) {  
        List<Interval> ans = new ArrayList<Interval>();  
        if (intervals.size() == 0) return ans;  
          
        Collections.sort(intervals, new MyComparator());  
          
        int start = intervals.get(0).start;  
        int end = intervals.get(0).end;  
          
        for (int i = 0; i < intervals.size(); i++) {  
            Interval inter = intervals.get(i);  
            if (inter.start > end) {  
                ans.add(new Interval(start, end));  
                start = inter.start;  
                end = inter.end;  
            } else {  
                end = Math.max(end, inter.end);  
            }  
        }  
        ans.add(new Interval(start, end));  
          
        return ans;  
    }  

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
