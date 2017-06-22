package Test;

//package com.platform.testgrid.actions;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

//import com.platform.testgrid.utils.Logger;

/**
 * This class is not for test case.
 * Tag usage: @ActionTag(desc="This is $this, assign to ${v}, parm ${1}, ${2}, ${3} ...")
 *  Syntax: $this: same as myName
 *          ${v}: a veriable name, the return object of the action will be assigned to the variable
 *          ${1}, ${2}, ${3} ...: parameters of the action
 *          ${*}                : all parameters separated by space
 *          @{1}, @{2}, @{3} ...: expends the parameters, unless it is scalar
 *              e.g.:
 *                  For call: arr = new String[] { "abc", "def" };
 *                            isEmpty(arr);
 *                  with tag: ActionTag(desc="Check if @{1} is null")
 *                                
 *                  Log when runtime:  "Check if <b>("abc", "def")</b> is null"
 *                  Desc for document: "Check if <b>any elements of arr</b> is null" 
 * @author pijiang
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface ActionTag
{
    //Class returnType() default void.class;
    
    /** action description */
    String desc() default "";
        
    /** if the action is deprecated, set a this tag as reason */
    String deprecated() default "";
    

//    /** log level for this action */
//    Logger.LogCatalog logCatalog() default Logger.LogCatalog.ACTION_DESC;
    
    /** TODO */
    String timeoutTerminator() default "";
}
