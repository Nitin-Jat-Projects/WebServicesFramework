package com.thinking.machines.webrock.annotations;
import java.lang.annotation.*;


//ElementType.Type means this annotation is applicable on class
//ElementType.METHOD means this annotation is applicable on methods
//@Retention(RetentionPolicy.RUNTIME) : do not change this line in any annotation

@Target({ElementType.TYPE, ElementType.METHOD})  
@Retention(RetentionPolicy.RUNTIME)    
public @interface GET
{

}