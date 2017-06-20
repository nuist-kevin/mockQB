package com.mic.test.cb.qb.persist.dao.cb;

import com.mic.test.cb.BaseTest;
import com.mic.test.cb.qb.persist.domain.cb.qb.QBCustomer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.transaction.annotation.Transactional;
import org.testng.annotations.Test;

public class CustomerTest extends BaseTest {

  @Autowired
  QBCustomerJpaRepository qbCustomerJpaRepository;

  @Test
  @Transactional
  public void testfindOne() {
    QBCustomer qbCustomer = qbCustomerJpaRepository.findOne(202);
    System.out.println(qbCustomer.getAddName());
    System.out.println(qbCustomer.getAddTime().getMonth());
  }
}
