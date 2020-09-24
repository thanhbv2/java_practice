package com.spring.aop;

import java.util.concurrent.TimeUnit;
import org.springframework.stereotype.Component;

@Component
public class GetFortuneService {

  public String getFortune(Boolean isEx){
    if (isEx) {
      throw new RuntimeException("====> around handle");
    }
    try {
      TimeUnit.SECONDS.sleep(5);
    } catch (InterruptedException e) {
      e.printStackTrace();

    }
    return "=======>>> Success";
  }
}
