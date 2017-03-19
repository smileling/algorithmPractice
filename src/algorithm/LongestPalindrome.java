package algorithm;

public class LongestPalindrome {
	
	//method 1
//	public boolean isPalindrome(String s, int start, int end){
//		int i = start;
//		int j = end;
//		for(;i < j; ){
//			if(s.charAt(i) != s.charAt(j)) return false;
//			i++;
//			j--;
//		}
//		return true;
//	}
//	
//	public String longestPalindrome(String s) {
//		if (s == null || s.length() == 0) return "";
//	    if (isPalindrome(s, 0, s.length()-1)) return s;
//		int start = 0;
//		int end = 0;
//		int len = 1;
//		for (int i = 0; i< s.length(); i++) {
//			for (int j = i+1; j < s.length(); j++){
//				if(isPalindrome(s, i,j) && len < j - i +1){
//					len = j - i + 1;
//					start = i;
//					end = j;
//				}
//			}
//		}
//		return s.substring(start, end+1);
//	}
	
	// method 2 动态规划
//	public String longestPalindrome(String s) {
//		if (s == null || s.length() == 0) return "";
//		boolean [][] palin = new boolean[s.length()][s.length()];
//		String res = "";
//		int maxLen = 0;
//		for (int i = s.length() -1; i >=0; i--) {
//			for (int j =i; j < s.length(); j++){
//				if(s.charAt(i) == s.charAt(j) && (j - i <= 2 || palin[i+1][j-1])){
//					palin[i][j] = true; 
//					if (j - i +1 > maxLen) {
//						maxLen = j - i +1;
//						res = s.substring(i,j+1);
//					}
//				}
//			}
//		}
//		return res;
//	}
		
//		if(s == null || s.length()==0)  
//	        return "";  
//	    boolean[][] palin = new boolean[s.length()][s.length()];  
//	    String res = "";  
//	    int maxLen = 0;  
//	    for(int i=s.length()-1;i>=0;i--)  
//	    {  
//	        for(int j=i;j<s.length();j++)  
//	        {  
//	            if(s.charAt(i)==s.charAt(j) && (j-i<=2 || palin[i+1][j-1]))  
//	            {  
//	                palin[i][j] = true;  
//	                if(maxLen<j-i+1)  
//	                {  
//	                    maxLen=j-i+1;  
//	                    res = s.substring(i,j+1);  
//	                }  
//	            }  
//	        }  
//	    }  
//	    return res;  
//	}
	
	//method 3
	public String longestPalindrome(String s) {  
	    if(s == null || s.length()==0)  
	        return "";  
	    int maxLen = 0;  
	    String res = "";  
	    for(int i=0;i<2*s.length()-1;i++)  
	    {  
	        int left = i/2;  
	        int right = i/2;  
	        if(i%2==1)  
	            right++;  
	        String str = lengthOfPalindrome(s,left,right);  
	        if(maxLen<str.length())  
	        {  
	            maxLen = str.length();  
	            res = str;  
	        }  
	    }  
	    return res;  
	}  
	private String lengthOfPalindrome(String s, int left, int right)  
	{  
	      
	    while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right))  
	    {  
	        left--;  
	        right++;  
	    }  
	    return s.substring(left+1,right);  
	}  
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "aaaa";
		System.out.println(a.substring(0, 2));
		LongestPalindrome lp = new LongestPalindrome();
		System.out.println(lp.longestPalindrome(a));
	}

}
