package com.oop;

import java.lang.Annotation.ElementType;
import java.lang.Annotation.Retention;
import java.lang.Annotation.RetentionPolicy;
import java.lang.Annotation.Target;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface NotBlank {
	
}