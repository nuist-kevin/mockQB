package com.mic.test.cb.qb.persist.dao.cb;

import com.mic.test.cb.BaseTest;
import com.mic.test.cb.qb.persist.domain.cb.QBCustomer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created by caiwen on 2017/6/6.
 */


public class CustomerTest extends BaseTest {

  @Resource
  QBCustomerJpaRepository qbCustomerJpaRepository;

  @Test
  @Transactional
  public void testfindOne() {
    QBCustomer qbCustomer = qbCustomerJpaRepository.findOne(2221);
    System.out.println(qbCustomer.getAddName());
  }
}
