package Test;

public @interface MyTarget {
	int id();
	String synopsis();
	String engineer() default "[unassigned]";
	String date() default "[unimplemented]";
//	String value() default "hahaha";
}
