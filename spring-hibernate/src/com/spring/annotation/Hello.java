package com.spring.annotation;

import java.lang.reflect.Method;

public class Hello {

  @FieldAnnatation(getValue = 10)
  public void sayHello(){
    System.out.println("hello");
  }

  public static void main(String[] args) throws NoSuchMethodException {
    Hello m = new Hello();
    Method method = m.getClass().getMethod("sayHello");
    FieldAnnatation fieldAnnatation = method.getAnnotation(FieldAnnatation.class);
    fieldAnnatation.getValue();
    System.out.println(fieldAnnatation.getValue());

  }

}
