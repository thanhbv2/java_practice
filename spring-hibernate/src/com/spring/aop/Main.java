package com.spring.aop;

import java.util.logging.Logger;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

  private static Logger logger = Logger.getLogger(MyLoggerAspect.class.getName());

  public static void main(String[] args) throws Exception {
    AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(DAOConfig.class);
    AccountDAO account = applicationContext.getBean("accountDAO", AccountDAO.class);
//    account.addAccount();

    OrderDAO orderDAO = applicationContext.getBean("orderDAO", OrderDAO.class);

//    orderDAO.addOrder();
    // AOP inject with method paramenter
//    account.addAccountWithParameter(new Account(), true);
//    account.findAccount();

    GetFortuneService sevice = applicationContext
        .getBean("getFortuneService", GetFortuneService.class);
    String data = sevice.getFortune(true);
    logger.info("get data"  + data);

    applicationContext.close();

  }

}
