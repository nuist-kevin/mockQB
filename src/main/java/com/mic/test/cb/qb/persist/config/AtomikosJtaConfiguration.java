package com.mic.test.cb.qb.persist.config;

import com.atomikos.icatch.jta.UserTransactionImp;
import com.atomikos.icatch.jta.UserTransactionManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.jta.JtaTransactionManager;

import javax.transaction.TransactionManager;
import javax.transaction.UserTransaction;

@Configuration
public class AtomikosJtaConfiguration {

  @Bean
  public UserTransaction userTransaction() throws Throwable {
    UserTransactionImp userTransactionImp = new UserTransactionImp();
    userTransactionImp.setTransactionTimeout(1000);
    return userTransactionImp;
  }

  @Bean(initMethod = "init", destroyMethod = "close")
  public UserTransactionManager userTransactionManager() throws Throwable {
    UserTransactionManager userTransactionManager = new UserTransactionManager();
    userTransactionManager.setForceShutdown(false);
    return userTransactionManager;
  }

  @Bean
  public PlatformTransactionManager transactionManager(UserTransaction userTransaction,
      UserTransactionManager userTransactionManager) throws Throwable {
    return new JtaTransactionManager(userTransaction, userTransactionManager);
  }
}
