package algorithm;

public class longSubstr {

	//method 1
//	public int lengthOfLongestSubstring(String s) {
//		if(s.isEmpty()|| s.length() == 0) return 0;
//		int max=1;
//		for(int i = 0; i < s.length(); i++) {
//			int tmplen = lengthOfSubstring(s,i);
//			if( tmplen > max) {
//				max = tmplen;
//			}
//		}
//        return max;
//    }
//	
//	public int lengthOfSubstring(String s, int index) {
//		int length = 1;
//		int j = index;
//		for (int i = index+1; i < s.length(); i++) {
//			
//			for (j = index; j < i; j++){
//				if(s.substring(j,j+1).contains(s.substring(i,i+1))) return length;
//			}
//			if( j >= i ) {
//				length++;
//			}
//		}
//		
//		return length;
//	}
	//method 2
	public static int lengthOfLongestSubstring(String s) {
		int[] flag = new int[128];
		int start = 0;
		int len = 0;
		char[] w = new char[s.length()];
		w = s.toCharArray();
		for (int i = 0; i < 128; i++)
			flag[i] = -1;
		for (int i = 0; i < s.length(); i++) {
			if (flag[w[i] - ' '] >= start) {
				if (i - start > len) {
					len = i - start;
				}
				start = flag[w[i] - ' '] + 1;
			}
			flag[w[i] - ' '] = i;
		}
		if (len > s.length() - start)
			return len;
		else
			return s.length() - start;
	}
	
//	static int[] last = new int[128];
//
//	public static int lengthOfLongestSubstring(String s) {
//		int start = 0;
//		int len = 0;
//		char[] w = new char[s.length()];
//		w = s.toCharArray();
//		for (int i = 0; i < 128; i++)
//			last[i] = -1;// last数组用于保存新出现的字符的下标，一开始全部初始化为-1
//		for (int i = 0; i < s.length(); ++i) {
//			if (last[w[i] - ' '] >= start) { // 当前这个字符出现过
//				if (i - start > len)
//					len = i - start;
//				start = last[w[i] - ' '] + 1; // 从这个字符首次出现的位置+1，重新扫描，相当于把前面抛开前面的字符串不谈
//			}
//			last[w[i] - ' '] = i;// 更新当前字符的下标
//		}
//		if (len > s.length() - start)// 针对没有重复字符的字符串
//			return len;
//		else
//			return s.length() - start;
//	}
    
    public static void main(String[] args) {
//    	ArrayList<String> array = new ArrayList<String>();
//    	array.add(0,"121");
//    	array.add(1, "12");
//    	System.out.println(array.get(0)+array.get(1));
//    	if((array.get(0)+array.get(1)).compareTo(array.get(1)+array.get(0))>0) System.out.println("a0>a1");
//    	else System.out.println("a0<=a1");
    	
    	
    }
}