package com.spring.aop;

import org.springframework.stereotype.Component;


@Component
public class AccountDAO {

  public void addAccount(){
    System.out.println("Add acount");
  }


  public boolean addAccountWithParameter(Account account, Boolean test){
    System.out.println("Add acount with paramenter =====================");
    return true;
  }

  public void findAccount() throws Exception {
    throw new RuntimeException("test");
  }


}
