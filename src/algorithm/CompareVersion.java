package algorithm;

public class CompareVersion {

	public int compareVersion(String version1, String version2) {
		
		int len1 = version1.split("\\.").length;
		int len2 = version2.split("\\.").length;
		
		if(len1 == 0 && len2 == 0) {
			if(Integer.parseInt(version1) > Integer.parseInt(version2))
        		return 1;
        	else if(Integer.parseInt(version1) < Integer.parseInt(version2))
        		return -1;
        	else 
        		return 0;
		}
		
		if (len1 == 0) {
			if(Integer.parseInt(version1) > Integer.parseInt(version2.split(".")[0]))
        		return 1;
        	else if(Integer.parseInt(version1) < Integer.parseInt(version2.split(".")[0]))
        		return -1;
        	else 
        		return 0;
		}
		if(len2 == 0) {
			if(Integer.parseInt(version1.split(".")[0]) > Integer.parseInt(version2))
        		return 1;
        	else if(Integer.parseInt(version1.split(".")[0]) < Integer.parseInt(version2))
        		return -1;
        	else 
        		return 0;
		}
        String[] v1 = new String[len1];
        String[] v2 = new String[len2];
        v1 = version1.split("\\.");
        v2 = version2.split("\\.");
        int i = 0;
        for (; i < len1 && i < len2; i++) {
        	if(Integer.parseInt(v1[i]) > Integer.parseInt(v2[i]))
        		return 1;
        	else if(Integer.parseInt(v1[i]) < Integer.parseInt(v2[i]))
        		return -1;
        	else 
        		continue;
        }
        if(i < len1) {
        	for(;i<len1;i++){
        		if(Integer.parseInt(v1[i]) > 0)
        			return 1;
        	}
        	return 0;
        }
        if(i < len2) {
        	for(;i<len2;i++){
        		if(Integer.parseInt(v2[i]) > 0)
        			return -1;
        	}
        	return 0;
        }
        return 0;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		String a = "12";
//		String b = "3";
//		System.out.println(Integer.parseInt(a)-Integer.parseInt(b));
		CompareVersion cv = new CompareVersion();
		System.out.println(cv.compareVersion("1.0", "1.1"));
//		System.out.println("1.0".split("\\.").length);
	}

}
