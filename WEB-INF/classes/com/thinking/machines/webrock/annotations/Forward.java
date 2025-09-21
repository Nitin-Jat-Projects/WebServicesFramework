package com.thinking.machines.webrock.annotations;
import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Forward
{
    public String value();
}
