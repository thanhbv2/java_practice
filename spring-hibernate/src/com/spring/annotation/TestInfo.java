package com.spring.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface TestInfo {

  public enum Priority {
    LOW, MEDIUM, HIGH
  }

  Priority priority() default Priority.LOW;

  String [] tags() default "";

  String createdBy() default "seven";
}
