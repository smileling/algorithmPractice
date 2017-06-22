package Test;

import java.util.List;


import Test.ActionTag;
//import com.platform.testgrid.actions.ActionTag;


public class TestAssert {
	
	public String statusCode() {
		return "hi";
	}
	
    public static Object isEqual(int actual, Object expected, String message) 
    {
        return isEqual((Object)actual, expected, message);
    }
	
	@ActionTag(desc="Check if ${1}=${2}")
	public static Object isEqual(Object actual, Object expected, String message) {
//		if(actual == null && expected == null)
//            return actual;
//        
//        if(actual == null)
//            throw new AssertFail("Expect " + expected + ", actual result is null");
//        
        if(actual instanceof Long && expected instanceof Long)
        {
            if((Long)expected != (Long) actual)
//                fail("===isEqual(" + actual +","+ expected +")===" + message);
            
            return actual;
        }
        else if(actual instanceof String && expected instanceof String)
        {
            if (((String) expected).trim().equals(((String)actual).trim()))
                return actual;
            //System.out.print(actual);
//            fail("===isEqual(" + actual +","+ expected +")===" + message);
        }
        else if(actual instanceof List && expected instanceof List)
        {
            List a = (List) actual;
            List e = (List) expected;
            
            if(a.size() != e.size())
//                fail(message + ", size (" + a.size() + ") is not expected " + e.size());
            
            for(int i = 0; i < a.size(); i ++)
                isEqual(a.get(i), e.get(i), message + ", line " + i + " actual: " + a.get(i) + ", expected: " + e.get(i));
        }
        else
        {
            String str1 = actual.toString();
            String str2 = expected.toString();
//            if(!str2.equals(str1))
//                fail("===isEqual(" + actual +","+ expected +")===" + message);
            System.out.println("is not equal.");
        }
        
        return actual;
	}

	public static void main(String[] args) {
		TestAssert ta = new TestAssert();
//		ta.statusCode()| TestAssert.isEqual("hi", "is not equal.");
	}

}
