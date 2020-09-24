package com.spring.aop;

import org.springframework.stereotype.Component;

@Component
public class OrderDAO {

  public boolean addOrder() {
    System.out.println("Add order");
    return false;
  }

}
