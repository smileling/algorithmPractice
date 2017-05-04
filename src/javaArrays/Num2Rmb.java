package javaArrays;

import java.util.Arrays;

public class Num2Rmb {

	private String[] hanArr = { "零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖"};
	private String[] unitArr = {"拾", "佰", "仟"};
	
	/**
	 * 把一个浮点数分解成整数部分和小数部分字符串
	 * @param num 需要被分解的浮点数
	 * @return 分解出来的整数部分和小数部分。第一个数组元素是整数部分，第二个数组元素是小数部分
	 */
	private String[] divide(double num) {
		long zheng = (long) num;
		long xiao = Math.round((num - zheng) * 100);
		return new String[] {
				zheng + "",
				String.valueOf(xiao)
		};
	}
	
	/**
	 * 把一个四位的数字字符串变成汉字字符串
	 * @param numStr 需要被转换的四位的数字字符串
	 * @return 四位的数字字符串被转换成的汉字字符串
	 */
	private String toHanStr(String numStr) {
		String result = "";
		int numLen = numStr.length();
		for(int i = 0; i < numLen; i++) {
			int num = numStr.charAt(i) - 48;
			int flag = 1;
			if (num != 0 && i != numLen - 1) {
				result += hanArr[num] + unitArr[numLen - 2 -i ];
				flag = 1;
			} else {
				result += hanArr[num];
				flag = 0;
			}
		}
		return result;
	}
	
	public static void main(String[] args) {

		Num2Rmb nr = new Num2Rmb();
		System.out.println(Arrays.toString(nr.divide(236711125.123)));
		System.out.println(nr.toHanStr("6109"));
		System.out.println(String.valueOf("12"));
	}

}
